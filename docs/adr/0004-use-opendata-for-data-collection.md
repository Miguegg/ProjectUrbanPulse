# ADR-004: Comunicación y recogida de datos con OpenData

## Estado

Accepted

## Contexto

Se requiere recopilación de datos urbanos para poder registrar incidencias (por ejemplo, una entidad UrbanAsset que represente un semáforo) de manera que los usuarios puedan trabajar con incidencias relacionadas a los mismos.

## Opciones consideradas

- OpenData.
- Introducción manual de los elementos urbanos por parte del personal municipal.
- Servicios o APIs de terceros de pago.

## Decisión

Recogida de datos a través de OpenData.

## Consecuencias

### Positivas

- Acceso a datos urbanos reales (por ejemplo, elementos como semáforos) sin coste de licencia.
- Evita tener que crear y mantener manualmente el catálogo de elementos urbanos desde cero.
- Los datos de UrbanAsset pueden cargarse de forma inicial y actualizarse de manera periódica.

### Negativas

- Dependencia de la disponibilidad, calidad y frecuencia de actualización de la fuente externa.
- Los formatos y esquemas de los conjuntos de datos pueden ser heterogéneos, lo que exige procesos de importación y transformación.
- Puede haber elementos urbanos ausentes o desactualizados en los datos publicados.

---

# ADR-004: Communication and data collection with OpenData

## Status

Accepted

## Context

Urban data collection is required in order to register incidents (for example, an UrbanAsset entity representing a traffic light) so that users can work with incidents related to them.

## Options considered

- OpenData.
- Manual entry of urban elements by municipal staff.
- Paid third-party services or APIs.

## Decision

Collect data through OpenData.

## Consequences

### Positive

- Access to real urban data (for example, elements such as traffic lights) at no licensing cost.
- Avoids having to create and maintain the catalog of urban elements manually from scratch.
- UrbanAsset data can be loaded initially and updated periodically.

### Negative

- Dependence on the availability, quality and update frequency of the external source.
- Dataset formats and schemas may be heterogeneous, requiring import and transformation processes.
- Some urban elements may be missing or outdated in the published data.
