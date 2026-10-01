package urbanpulse.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import urbanpulse.dto.IncidentAsset;
import urbanpulse.entity.IncidentAssetEntity;

@Component
@AllArgsConstructor
public class IncidentAssetMapper extends MapperDTO<IncidentAsset, IncidentAssetEntity>{
    private final UrbanAssetMapper urbanAssetMapper;
    private final IncidentMapper incidentMapper;

    @Override
    public IncidentAsset toDTO(IncidentAssetEntity incidentAssetEntity) {
        IncidentAsset incidentAsset = new IncidentAsset();

        incidentAsset.setId(incidentAssetEntity.getId());
        incidentAsset.setAsset(urbanAssetMapper.toDTO(incidentAssetEntity.getAsset()));
        incidentAsset.setIncident(incidentMapper.toDTO(incidentAssetEntity.getIncident()));
        incidentAsset.setLinkType(incidentAssetEntity.getLinkType());
        incidentAsset.setDistanceM(incidentAssetEntity.getDistanceM());
        incidentAsset.setConfidence(incidentAssetEntity.getConfidence());
        incidentAsset.setCreatedAt(incidentAssetEntity.getCreatedAt());

        return incidentAsset;
    }
}
