# ADR-006: Conexión con OpenStreetMap

## Estado

Accepted

## Contexto

Se requiere mostrar un mapa en el frontend de la aplicación para que los usuarios interactúen con las incidencias urbanas. Se debe tener acceso a la ubicación de los elementos urbanos.

## Opciones consideradas

- OpenStreetMap.
- Google Maps.
- Mapbox.

## Decisión

Utilizar OpenStreetMap como fuente de mapas en el frontend, representando sobre él la ubicación de los elementos urbanos (UrbanAsset) y sus incidencias.

## Consecuencias

### Positivas

- Datos y mapas abiertos, sin coste de licencia ni necesidad de contratar un servicio de pago.
- Coherente con el uso de OpenData como fuente de datos urbanos (ADR-004).
- Buena integración con el ecosistema de React para mapas (ADR-005).

### Negativas

- Los servidores de teselas públicos tienen políticas de uso limitado, por lo que un tráfico elevado puede requerir un proveedor de teselas alternativo o caché.
- Es obligatorio mostrar la atribución a OpenStreetMap.
- Dependencia de la disponibilidad de un servicio externo.

---

# ADR-006: Connection with OpenStreetMap

## Status

Accepted

## Context

A map must be displayed in the application's frontend so that users can interact with urban incidents. Access to the location of urban elements is required.

## Options considered

- OpenStreetMap.
- Google Maps.
- Mapbox.

## Decision

Use OpenStreetMap as the map source in the frontend, displaying on it the location of urban elements (UrbanAsset) and their incidents.

## Consequences

### Positive

- Open data and maps, with no licensing cost and no need to contract a paid service.
- Consistent with the use of OpenData as the source of urban data (ADR-004).
- Good integration with the React ecosystem for maps (ADR-005).

### Negative

- Public tile servers have limited usage policies, so high traffic may require an alternative tile provider or caching.
- Attribution to OpenStreetMap is mandatory.
- Dependence on the availability of an external service.
