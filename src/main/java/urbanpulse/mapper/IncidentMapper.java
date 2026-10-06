package urbanpulse.mapper;

import lombok.AllArgsConstructor;
import org.springframework.boot.context.properties.PropertyMapper;
import org.springframework.stereotype.Component;
import urbanpulse.dto.Incident;
import urbanpulse.entity.IncidentEntity;

@Component
@AllArgsConstructor
public class IncidentMapper extends MapperDTO<Incident, IncidentEntity> {
    @Override
    public Incident toDTO(IncidentEntity entity) {
        Incident incident = new Incident();
        incident.setId(entity.getId());
        incident.setTitle(entity.getTitle());
        incident.setDescription(entity.getDescription());
        incident.setCategory(entity.getCategory());
        incident.setStatus(entity.getStatus());
        incident.setPriority(entity.getPriority());
        incident.setPriorityJustification(entity.getPriorityJustification());
        incident.setLatitude(entity.getLatitude());
        incident.setLongitude(entity.getLongitude());
        incident.setLocationAccuracy(entity.getLocationAccuracyM());
        incident.setAddress(entity.getAddress());
        incident.setNeighbourhood(entity.getNeighborhood());
        incident.setDistrict(entity.getDistrict());
        incident.setReporter(entity.getReporter());
        incident.setReportedAt(entity.getReportedAt());
        incident.setUpdatedAt(entity.getUpdatedAt());
        incident.setResolvedAt(entity.getResolvedAt());
        incident.setClosedAt(entity.getClosedAt());
        return incident;
    }

    public IncidentEntity toEntity(Incident incident) {
        IncidentEntity entity = new IncidentEntity();
        entity.setTitle(incident.getTitle());
        entity.setDescription(incident.getDescription());
        entity.setCategory(incident.getCategory());
        entity.setPriority(incident.getPriority());
        entity.setPriorityJustification(incident.getPriorityJustification());
        entity.setLatitude(incident.getLatitude());
        entity.setLongitude(incident.getLongitude());
        entity.setLocationAccuracyM(incident.getLocationAccuracy());
        entity.setAddress(incident.getAddress());
        entity.setNeighborhood(incident.getNeighbourhood());
        entity.setDistrict(incident.getDistrict());
        entity.setReporter(incident.getReporter());
        return entity;
    }
}
