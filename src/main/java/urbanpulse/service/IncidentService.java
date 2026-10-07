package urbanpulse.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import urbanpulse.dao.IncidentRepository;
import urbanpulse.dto.Incident;
import urbanpulse.entity.IncidentEntity;
import urbanpulse.mapper.IncidentMapper;

import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class IncidentService {
    private final IncidentRepository incidentRepository;
    private final IncidentMapper incidentMapper;

    public Optional<Incident> getIncidentById(UUID id) {
        Optional<IncidentEntity> incident = incidentRepository.findById(id);
        return incident.map(incidentMapper::toDTO);
    }


}
