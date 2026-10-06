# Desarrollo

## Requisitos

| Herramienta | Uso                                                   |
|---|-------------------------------------------------------|
| Java 17 | Ejecución y compilación de la aplicación Spring Boot. |
| Maven | Gestión de dependencias, compilación y pruebas.       |
| Docker Desktop | Ejecucion local de Supabase.                          |
| Node.js | Ejecucion de `npx supabase`.                          |
| Supabase CLI | Base de datos local y carga de migraciones/seed.      |

## Preparar la base de datos local

La base de datos local se levanta con Supabase CLI sobre Docker:

```bash
npx supabase start
```

Al arrancar, Supabase aplica las migraciones y carga los datos de prueba configurados en `supabase/seed.sql`.

Para reiniciar la base de datos local con el esquema y el seed:

```bash
npx supabase db reset
```

Para detener el entorno local:

```bash
npx supabase stop
```

## Ejecutar la aplicacion


## Ejecutar pruebas

El proyecto contiene una prueba de contexto Spring Boot en `src/test/java/urbanpulse/ProjectUrbanPulseApplicationTests.java`.

```bash
mvn test
```

## Validación

Antes de abrir una Pull Request en un proyecto Java/Maven se debe ejecutar:

```bash
mvn verify
```

## Estructura actual

```text
src/main/java/urbanpulse/
|-- controller/rest
|-- dto
|-- entity
`-- mapper
```

## Flujo Git

Se debe trabajar en ramas dedicadas, no directamente en `main`, y usar nombres del tipo `<type>/<kebab-case-description>`.

Los commits deben seguir Conventional Commits, por ejemplo:

```bash
git commit -m "docs: update development guide"
```

## Variables de entorno

El repositorio incluye `.env.example`. El archivo `.env` no debe versionarse.

---

# Development

## Requirements

| Tool | Use |
|---|---|
| Java 17 | Running and compiling the Spring Boot application. |
| Maven | Dependency management, compilation, and tests. |
| Docker Desktop | Running the local Supabase environment. |
| Node.js | Running `npx supabase`. |
| Supabase CLI | Local database and migration/seed loading. |

## Prepare the local database

The local database runs with Supabase CLI over Docker:

```bash
npx supabase start
```

On startup, Supabase applies the migrations and loads the test data configured in `supabase/seed.sql`.

To reset the local database with the schema and seed:

```bash
npx supabase db reset
```

To stop the local environment:

```bash
npx supabase stop
```

## Run the application


## Run tests

The project contains a Spring Boot context test at `src/test/java/urbanpulse/ProjectUrbanPulseApplicationTests.java`.

```bash
mvn test
```

## Validation

Before opening a Pull Request in a Java/Maven project, run:

```bash
mvn verify
```

## Current structure

```text
src/main/java/urbanpulse/
|-- controller/rest
|-- dto
|-- entity
`-- mapper
```

## Git workflow

The repository conventions indicate working on dedicated branches, not directly on `main`, using names like `<type>/<kebab-case-description>`.

Commits should follow Conventional Commits, for example:

```bash
git commit -m "docs: update development guide"
```

## Environment variables

The repository includes `.env.example`. The `.env` file must not be versioned.
