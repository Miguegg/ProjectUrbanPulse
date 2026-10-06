# ADR-002: Implementación de backend con Spring Boot

## Estado

Accepted

## Contexto

El backend debe exponer una API REST, gestionar seguridad por roles y asegurar persistencia de datos. El equipo cuenta con mayor experiencia utilizando Spring Boot.

## Opciones consideradas

- Spring Boot (Java).
- Node.js (Express + Sequelize).

## Decisión

Utilizar Spring Boot como framework del backend.

## Consecuencias

### Positivas

- Encaja con la experiencia del equipo y con la restricción del proyecto.
- Framework estándar en la industria para API REST, seguridad, validación y acceso a datos.
- Soporte de eventos de aplicación para desacoplar notificaciones y auditoría.

### Negativas

- Mayor consumo de memoria y tiempo de arranque que alternativas más ligeras.
- Los modelos de clasificación o predicción para usuarios analistas pueden requerir integración con Python.

---

# ADR-002: Backend implementation with Spring Boot

## Status

Accepted

## Context

The backend must expose a REST API, manage role-based security and ensure data persistence. The team has more experience using Spring Boot.

## Options considered

- Spring Boot (Java).
- Node.js (Express + Sequelize).

## Decision

Use Spring Boot as the backend framework.

## Consequences

### Positive

- Fits the team's experience and the project's constraints.
- Industry-standard framework for REST APIs, security, validation and data access.
- Support for application events to decouple notifications and auditing.

### Negative

- Higher memory consumption and startup time than lighter alternatives.
- Classification or prediction models for analyst users may require integration with Python.
