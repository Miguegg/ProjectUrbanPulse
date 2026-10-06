# ADR-001: Estructura monolítica

## Estado

Accepted

## Contexto

Se cuenta con un equipo reducido y un límite de tiempo estricto. Buscamos agilizar el desarrollo mediante una arquitectura sencilla. Hay que decidir la manera en la que se estructura el sistema.

## Opciones consideradas

- Estructura monolítica.
- Estructura basada en microservicios.

## Decisión

Estructura monolítica, organizada internamente en módulos con dependencias entre ellos.

## Consecuencias

### Positivas

- Un único bloque que desarrollar.
- Menor coste operativo y curva de aprendizaje.
- El diseño modular permite la incorporación de nuevos servicios si resulta necesario.

### Negativas

- Todo el sistema escala y se despliega en bloque.
- Un fallo grave en un módulo puede afectar a toda la API.

---

# ADR-001: Monolithic structure

## Status

Accepted

## Context

The team is small and the time limit is strict. We aim to speed up development with a simple architecture. We need to decide how the system is structured.

## Options considered

- Monolithic structure.
- Microservices-based structure.

## Decision

Monolithic structure, internally organized into modules with dependencies between them.

## Consequences

### Positive

- A single block to develop.
- Lower operating cost and learning curve.
- The modular design allows new services to be added if necessary.

### Negative

- The whole system scales and is deployed as a single unit.
- A serious failure in one module can affect the entire API.
