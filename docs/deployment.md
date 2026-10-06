# Despliegue

## Estado

No hay un despliegue de producción documentado en las fuentes revisadas.

El repositorio contiene configuración para desarrollo local con Spring Boot, Maven, PostgreSQL/Supabase y Docker. No se ha encontrado Dockerfile, configuración de Kubernetes ni workflow de CI/CD con despliegue.

## Artefacto

El proyecto usa Maven y Spring Boot. El `pom.xml` define:

| Elemento | Valor |
|---|---|
| Java | 17 |
| Spring Boot parent | 4.1.1 |
| Artifact ID | `ProjectUrbanPulse` |
| Version | `0.0.1-SNAPSHOT` |

## Configuración

Según las convenciones del repositorio, las diferencias entre entornos deben vivir fuera del código. El archivo `.env.example` documenta variables para la conexión PostgreSQL:

```dotenv
POSTGRES_URL=jdbc:postgresql://127.0.0.1:54322/postgres
POSTGRES_USER=postgres
POSTGRES_PASSWORD=postgres
```

## Entornos

| Entorno | Estado documentado |
|---|---|
| Local | Documentado con Supabase CLI sobre Docker. |
| Test |  |
| Staging |  |
| Producción |  |

## Proceso de despliegue


## Rollback


## Comprobaciones posteriores

---

# Deployment

## Status

No production deployment is documented in the reviewed sources.

The repository contains configuration for local development with Spring Boot, Maven, PostgreSQL/Supabase, and Docker. No Dockerfile, Kubernetes configuration, or CI/CD deployment workflow was found.

## Artifact

The project uses Maven and Spring Boot. The `pom.xml` defines:

| Element | Value |
|---|---|
| Java | 17 |
| Spring Boot parent | 4.1.1 |
| Artifact ID | `ProjectUrbanPulse` |
| Version | `0.0.1-SNAPSHOT` |

## Configuration

According to the repository conventions, differences between environments should live outside the code. The `.env.example` file documents PostgreSQL connection variables:

```dotenv
POSTGRES_URL=jdbc:postgresql://127.0.0.1:54322/postgres
POSTGRES_USER=postgres
POSTGRES_PASSWORD=postgres
```

## Environments

| Environment | Documented state |
|---|---|
| Local | Documented with Supabase CLI over Docker. |
| Test |  |
| Staging |  |
| Production |  |

## Deployment process


## Rollback


## Post-deployment checks

