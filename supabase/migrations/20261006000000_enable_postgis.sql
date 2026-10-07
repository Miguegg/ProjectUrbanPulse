-- =====================================================================
-- PostGIS: spatial queries over incidents and urban assets (ADR-007)
-- =====================================================================
-- latitude/longitude remain the source of truth. The "location" columns
-- are derived from them, so JPA entities and inserts do not change.
-- geography (not geometry) so distances are returned in meters.

CREATE EXTENSION IF NOT EXISTS postgis WITH SCHEMA extensions;

ALTER TABLE urban_asset
    ADD COLUMN location extensions.geography(Point, 4326)
        GENERATED ALWAYS AS (extensions.ST_SetSRID(extensions.ST_MakePoint(longitude, latitude), 4326)::extensions.geography) STORED;

ALTER TABLE incident
    ADD COLUMN location extensions.geography(Point, 4326)
        GENERATED ALWAYS AS (extensions.ST_SetSRID(extensions.ST_MakePoint(longitude, latitude), 4326)::extensions.geography) STORED;

-- The B-tree index on (latitude, longitude) is not useful for radius searches
DROP INDEX IF EXISTS ix_urban_asset_location;

CREATE INDEX ix_urban_asset_geo ON urban_asset USING GIST (location);
CREATE INDEX ix_incident_geo    ON incident    USING GIST (location);
