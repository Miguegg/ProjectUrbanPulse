# ADR-003: Almacenamiento de datos mediante PostgreSQL

## Estado

Accepted

## Contexto

Las entidades propuestas (Incident, User, UrbanAsset…) guardan relaciones explícitas entre sí. Es necesario mantener la información tanto de las entidades como de sus relaciones (por ejemplo, incidencias con el elemento urbano UrbanAsset que tiene dicha incidencia).

## Opciones consideradas

- PostgreSQL
- MongoDB
- MySQL

## Decisión

Utilizar PostgreSQL.

## Consecuencias

### Positivas

- Transacciones ACID para los cambios de estado.
- Una sola base de datos sobre la que operar.
- Experiencia previa del equipo.

### Negativas

- Escalar horizontalmente es más complejo.
- Los cambios de esquema requieren migraciones de datos que pueden complicarse.

---

# ADR-003: Data storage with PostgreSQL

## Status

Accepted

## Context

The proposed entities (Incident, User, UrbanAsset…) have explicit relationships with each other. It is necessary to keep the information of both the entities and their relationships (for example, incidents linked to the UrbanAsset that has that incident).

## Options considered

- PostgreSQL
- MongoDB
- MySQL

## Decision

Use PostgreSQL.

## Consequences

### Positive

- ACID transactions for state changes.
- A single database to operate.
- Prior experience of the team.

### Negative

- Horizontal scaling is more complex.
- Schema changes require data migrations, which can become complicated.
