package urbanpulse.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import urbanpulse.dto.UrbanContext;
import urbanpulse.entity.UrbanContextEntity;

@Component
@AllArgsConstructor
public class UrbanContextMapper extends MapperDTO<UrbanContext, UrbanContextEntity> {

    private IncidentMapper incidentMapper;
    private ExternalObservationMapper externalObservationMapper;

    public UrbanContext toDTO(UrbanContextEntity entity) {
        if (entity == null) return null;
        UrbanContext dto = new UrbanContext();
        dto.setIncident(incidentMapper.toDTO(entity.getIncident()));
        dto.setDistrict(entity.getDistrict());
        dto.setReferenceTime(entity.getReferenceTime());
        dto.setStatus(entity.getStatus());
        dto.setSummary(entity.getSummary());
        dto.setCreatedAt(entity.getCreatedAt());
        dto.setExternalObservations(externalObservationMapper.toDTOList(entity.getExternalObservations()));
        return dto;
    }
}
