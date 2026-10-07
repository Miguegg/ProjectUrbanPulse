# ADR-007: Consultas espaciales mediante PostGIS

## Estado

Accepted

## Contexto

Las incidencias y los elementos urbanos (UrbanAsset) se almacenan con su latitud y longitud (ADR-003). Es necesario resolver consultas por proximidad, como encontrar los elementos urbanos candidatos cercanos a una incidencia. Con columnas `DOUBLE PRECISION` estas consultas requieren calcular distancias a mano y no pueden aprovechar un índice espacial.

## Opciones consideradas

- PostGIS.
- Cálculo de distancias (Haversine) en SQL o en Java sobre latitud y longitud.
- Motor de búsqueda externo con soporte geoespacial (p. ej. Elasticsearch).

## Decisión

Utilizar la extensión PostGIS de PostgreSQL, ya incluida en Supabase, activándola mediante una migración (`supabase/migrations/20261006000000_enable_postgis.sql`).

- `latitude` y `longitude` se mantienen.
- Las tablas `incident` y `urban_asset` añaden una columna generada `location` de tipo `geography(Point, 4326)`, con índice GiST.
- Se usa `geography` en lugar de `geometry` para obtener distancias directamente en metros.
- Las consultas espaciales se escriben como consultas nativas en los repositorios. 

## Consecuencias

### Positivas

- Consultas por radio (`ST_DWithin`) y ordenación por distancia (`ST_Distance`) precisas y eficientes gracias al índice espacial.
- Sin cambios en entidades, DTOs ni datos de prueba: la columna `location` se calcula automáticamente.
- Sin servicios adicionales que desplegar: la extensión está disponible en Supabase local y remoto.
- Abre la puerta a convertir la columna `geometry` (GeoJSON en JSONB) de `urban_asset` en una geometría real en el futuro.

### Negativas

- Las consultas espaciales son SQL nativo, específico de PostgreSQL, y no se validan en el arranque como JPQL.
- Las funciones de PostGIS viven en el esquema `extensions` de Supabase, por lo que las consultas las referencian con ese prefijo.
- Si en el futuro se necesitan tipos espaciales en Java, habrá que añadir `hibernate-spatial` y JTS.

---

# ADR-007: Spatial queries with PostGIS

## Status

Accepted

## Context

Incidents and urban elements (UrbanAsset) are stored with their latitude and longitude (ADR-003). Proximity queries must be supported, such as finding the candidate urban elements near an incident. With `DOUBLE PRECISION` columns these queries require computing distances by hand and cannot use a spatial index.

## Options considered

- PostGIS.
- Distance calculation (Haversine) in SQL or Java over latitude and longitude.
- External search engine with geospatial support (e.g. Elasticsearch).

## Decision

Use the PostgreSQL PostGIS extension, already included in Supabase, enabling it through a migration (`supabase/migrations/20261006000000_enable_postgis.sql`).

- `latitude` and `longitude` remain the source of truth.
- The `incident` and `urban_asset` tables add a generated `location` column of type `geography(Point, 4326)`, with a GiST index.
- `geography` is used instead of `geometry` to get distances directly in meters.
- Spatial queries are written as native queries in the repositories. `hibernate-spatial` is not added for now, and JPA entities do not map the `location` column.

## Consequences

### Positive

- Accurate and efficient radius queries (`ST_DWithin`) and distance ordering (`ST_Distance`) thanks to the spatial index.
- No changes to entities, DTOs, or test data: the `location` column is computed automatically.
- No additional services to deploy: the extension is available in local and remote Supabase.
- Opens the door to turning the `urban_asset` `geometry` column (GeoJSON in JSONB) into a real geometry in the future.

### Negative

- Spatial queries are native SQL, PostgreSQL-specific, and are not validated at startup like JPQL.
- PostGIS functions live in Supabase's `extensions` schema, so queries reference them with that prefix.
- If spatial types are needed in Java in the future, `hibernate-spatial` and JTS will have to be added.
