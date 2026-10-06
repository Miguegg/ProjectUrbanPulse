# ADR-005: Implementación de frontend React

## Estado

TBD

## Contexto

La plataforma tiene usuarios muy distintos: ciudadanía (interfaz sencilla, uso desde el móvil, subida de evidencias), personal municipal (listados, filtros y mapa) y analistas (indicadores). La interfaz debe comunicarse con la API REST y ser accesible desde web y móvil.

## Opciones consideradas

- React como aplicación de una sola página (SPA).
- Angular.
- Vistas renderizadas en servidor (Thymeleaf, JSP).

## Decisión

Utilizar React como frontend, desacoplado del backend y comunicado mediante HTTPS / JSON.

## Consecuencias

### Positivas

- Frontend y backend se despliegan por separado.
- Amplio ecosistema para mapas, tablas y gráficos.
- Gestión de acceso frontend web y móvil desde una sola página (SPA).

### Negativas

- Aumenta la complejidad debido al acoplamiento con backend con respecto a renderizado desde servidor.
- La gestión de sesión y tokens puede pasar a ser responsabilidad del cliente.

---

# ADR-005: React frontend implementation

## Status

TBD

## Context

The platform has very different users: citizens (simple interface, mobile use, evidence upload), municipal staff (listings, filters and map) and analysts (indicators). The interface must communicate with the REST API and be accessible from web and mobile.

## Options considered

- React as a single-page application (SPA).
- Angular.
- Server-side rendered views (Thymeleaf, JSP).

## Decision

Use React as the frontend, decoupled from the backend and communicating via HTTPS / JSON.

## Consequences

### Positive

- Frontend and backend are deployed separately.
- Broad ecosystem for maps, tables and charts.
- Web and mobile access management from a single page (SPA).

### Negative

- Increased complexity due to coupling with the backend, compared to server-side rendering.
- Session and token management may become the client's responsibility.
