# Base de datos

## Estado

La base de datos local se gestiona con Supabase CLI sobre Docker. El esquema se define en `supabase/migrations/20260929000000_initial_schema.sql` y los datos de prueba en `supabase/seed.sql`.

El esquema actual se describe en la migración como un esquema reducido basado en las entidades del modelo de dominio del documento de introducción.

## Tecnología

| Elemento | Valor documentado |
|---|---|
| Motor | PostgreSQL |
| Entorno local | Supabase CLI sobre Docker |
| Versión local de PostgreSQL | 17, según `supabase/config.toml` |
| Puerto local de base de datos | `54322` |
| Studio local | `http://127.0.0.1:54323` |

## Tablas principales

| Tabla | Propósito |
|---|---|
| `app_user` | Usuarios ciudadanos o personal municipal. |
| `incident` | Entidad central del dominio: reporte, ubicación, estado, prioridad y marcas temporales. |
| `status_change` | Transiciones auditables de estado. |
| `attachment` | Metadatos de ficheros asociados a incidencias. |
| `assignment` | Relación temporal entre incidencia, departamento y técnico. |
| `urban_asset` | Activo urbano físico identificable. |
| `incident_asset` | Asociación entre incidencia y activo urbano. |
| `external_observation` | Observación contextual normalizada desde una fuente externa. |
| `urban_context` | Contexto urbano de una incidencia o zona en un instante. |
| `urban_context_observation` | Relacion entre contextos y observaciones. |
| `notification` | Comunicación derivada de eventos. |
| `knowledge_document` | Procedimiento o normativa versionada para uso documental/RAG. |

## Ciclo de vida de incidencia

Los estados definidos en el esquema y en el enum Java son:

`REPORTED`, `VALIDATED`, `REJECTED`, `ASSIGNED`, `IN_PROGRESS`, `RESOLVED`, `REOPENED`, `CLOSED`.

## Seguridad de datos

La migración activa Row Level Security en las tablas principales. El propio comentario de la migración indica que, sin políticas, la API REST pública de Supabase no ve estas tablas y que Spring Boot conecta como `postgres`.

## Configuración local

`src/main/resources/application.properties` apunta actualmente a la base de datos local:

| Propiedad | Valor |
|---|---|
| `spring.datasource.url` | `jdbc:postgresql://127.0.0.1:54322/postgres` |
| `spring.datasource.username` | `postgres` |
| `spring.datasource.password` | `postgres` |
| `spring.jpa.hibernate.ddl-auto` | `validate` |

## Configuración remota

---

# Database

## Status

The local database is managed with Supabase CLI over Docker. The schema is defined in `supabase/migrations/20260929000000_initial_schema.sql`, and test data is defined in `supabase/seed.sql`.

The current schema is described in the migration as a reduced schema based on the domain model entities from the introduction document.

## Technology

| Element | Documented value |
|---|---|
| Engine | PostgreSQL |
| Local environment | Supabase CLI over Docker |
| Local PostgreSQL version | 17, according to `supabase/config.toml` |
| Local database port | `54322` |
| Local Studio | `http://127.0.0.1:54323` |

## Main tables

| Table | Purpose |
|---|---|
| `app_user` | Citizen or municipal staff users. |
| `incident` | Central domain entity: report, location, status, priority, and timestamps. |
| `status_change` | Auditable status transitions. |
| `attachment` | Metadata for files associated with incidents. |
| `assignment` | Temporary relationship between incident, department, and technician. |
| `urban_asset` | Identifiable physical urban asset. |
| `incident_asset` | Association between incident and urban asset. |
| `external_observation` | Normalized contextual observation from an external source. |
| `urban_context` | Urban context for an incident or area at a specific time. |
| `urban_context_observation` | Relationship between contexts and observations. |
| `notification` | Communication derived from events. |
| `knowledge_document` | Versioned procedure or regulation for documentary/RAG use. |

## Incident lifecycle

The states defined in the schema and in the Java enum are:

`REPORTED`, `VALIDATED`, `REJECTED`, `ASSIGNED`, `IN_PROGRESS`, `RESOLVED`, `REOPENED`, `CLOSED`.

## Data security

The migration enables Row Level Security on the main tables. The migration comment states that, without policies, the public Supabase REST API cannot see these tables, and that Spring Boot connects as `postgres`.

## Local configuration

`src/main/resources/application.properties` currently points to the local database:

| Property | Value |
|---|---|
| `spring.datasource.url` | `jdbc:postgresql://127.0.0.1:54322/postgres` |
| `spring.datasource.username` | `postgres` |
| `spring.datasource.password` | `postgres` |
| `spring.jpa.hibernate.ddl-auto` | `validate` |

## Remote configuration

