package urbanpulse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import urbanpulse.entity.UrbanAssetEntity;

import java.util.List;
import java.util.UUID;

public interface UrbanAssetRepository extends JpaRepository<UrbanAssetEntity, UUID> {

    /**
     * Finds the urban assets located within a radius of an incident, closest first.
     * Uses the PostGIS "location" columns (see ADR-007), so it must be a native query.
     *
     * @param incidentID   ID of the incident used as the search center
     * @param radiusMeters search radius in meters
     * @return assets within the radius ordered by distance; empty if the incident does not exist
     */
    @Query(value = """
            SELECT ua.*
            FROM urban_asset ua
            JOIN incident i ON i.id = :incidentID
            WHERE extensions.ST_DWithin(ua.location, i.location, :radiusMeters)
            ORDER BY extensions.ST_Distance(ua.location, i.location)
            """, nativeQuery = true)
    List<UrbanAssetEntity> findNearbyAssets(@Param("incidentID") UUID incidentID,
                                            @Param("radiusMeters") double radiusMeters);
}
