package urbanpulse.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import urbanpulse.dao.IncidentRepository;
import urbanpulse.dto.Incident;
import urbanpulse.mapper.IncidentMapper;

import java.util.List;

@Service
@AllArgsConstructor
public class IncidentService {
    private final IncidentRepository incidentRepository;
    private final IncidentMapper incidentMapper;

    public List<Incident> getAllIncidents() {
        return this.incidentMapper.toDTOList(incidentRepository.findAll());
    }


}
