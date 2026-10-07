package urbanpulse.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import urbanpulse.dao.UrbanAssetRepository;
import urbanpulse.dto.UrbanAsset;
import urbanpulse.mapper.UrbanAssetMapper;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UrbanAssetService {
    private final UrbanAssetRepository urbanAssetRepository;
    private final UrbanAssetMapper urbanAssetMapper;
    private final IncidentService incidentService;

    public List<UrbanAsset> getAllAssets() {
        return this.urbanAssetMapper.toDTOList(urbanAssetRepository.findAll());
    }

    /**
     * Gets the urban assets near an incident, closest first.
     *
     * @param incidentID   ID of the incident used as the search center
     * @param radiusMeters search radius in meters
     * @return assets within the radius of the incident
     */
    public List<UrbanAsset> getNearbyAssets(UUID incidentID, double radiusMeters) {
        return this.urbanAssetMapper.toDTOList(
                urbanAssetRepository.findNearbyAssets(incidentID, radiusMeters));
    }
}
