# UrbanPulse

Plataforma cloud para la gestión inteligente de incidencias urbanas (Spring Boot + PostgreSQL/Supabase).

## Base de datos en local

La base de datos local se levanta con Supabase CLI sobre Docker. El esquema y los datos de prueba se cargan solos.

### Requisitos

- Docker Desktop abierto.
- Node.js (para ejecutar `npx supabase`).

### Montarla

1. Si tienes levantado otro proyecto de Supabase (por ejemplo Bancosol), páralo, porque usan los mismos puertos:

   ```bash
   npx supabase stop --project-id ProyectoBancosol
   ```

2. Desde la raíz del proyecto, arranca Supabase:

   ```bash
   npx supabase start
   ```

   La primera vez tarda porque descarga las imágenes de Docker. Al arrancar crea las tablas y carga los datos de prueba.

3. Arranca la aplicación. `application.properties` ya apunta a la base de datos local:

   | Dato       | Valor                                        |
   |------------|----------------------------------------------|
   | URL        | `jdbc:postgresql://127.0.0.1:54322/postgres` |
   | Usuario    | `postgres`                                   |
   | Contraseña | `postgres`                                   |

   Para ver las tablas y los datos desde el navegador, abre Supabase Studio en http://127.0.0.1:54323.

### Comandos útiles

| Comando                  | Qué hace                                                                   |
|--------------------------|----------------------------------------------------------------------------|
| `npx supabase start`     | Levanta la base de datos local.                                            |
| `npx supabase stop`      | La para. Los datos se conservan para la próxima vez.                       |
| `npx supabase db reset`  | Borra la base de datos local y la vuelve a crear con el esquema y el seed. |
| `npx supabase status`    | Muestra las URLs y los puertos de lo que está levantado.                   |

### Ficheros

- `supabase/migrations/20260929000000_initial_schema.sql`: esquema de la base de datos. Si lo cambias, ejecuta `npx supabase db reset` para aplicarlo.
- `supabase/seed.sql`: datos de prueba. Todos los usuarios de prueba comparten la contraseña indicada en la cabecera del fichero.
- `supabase/config.toml`: configuración de Supabase CLI (puertos, etc.). No hace falta ejecutar `npx supabase init`. Storage y Analytics están desactivados porque todavía no se usan y en Windows dan problemas al arrancar.

### Problemas frecuentes

- **`Bind for 0.0.0.0:54322 failed: port is already allocated`**: hay otro proyecto de Supabase usando los puertos. Páralo con `npx supabase stop --project-id <nombre-del-proyecto>` (el nombre aparece en el propio mensaje de error) y vuelve a ejecutar `npx supabase start`.
- **`Cannot connect to the Docker daemon`** o **`open //./pipe/dockerDesktopLinuxEngine: El sistema no puede encontrar el archivo especificado`**: Docker Desktop no está abierto. Ábrelo, espera a que ponga *Engine running* y repite el comando.
