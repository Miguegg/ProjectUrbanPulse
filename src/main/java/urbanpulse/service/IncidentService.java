package urbanpulse.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import urbanpulse.dao.IncidentRepository;
import urbanpulse.dto.*;
import urbanpulse.entity.IncidentEntity;
import urbanpulse.mapper.IncidentMapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class IncidentService {
    private final IncidentRepository incidentRepository;
    private final IncidentMapper incidentMapper;

    /**
     * Filters incidents using the repository JPQL query.
     *
     * @param status incident status filter
     * @param category incident category filter
     * @param reportedAt day used to filter by reportedAt
     * @param priority incident priority filter
     * @param district district filter
     * @param department reporter department filter
     * @return incidents matching the filters
     */
    public List<Incident> filterIncidents(
            IncidentStatus status,
            Category category,
            LocalDate reportedAt,
            Priority priority,
            District district,
            Department department) {

        if (status == null && category == null && reportedAt == null && priority == null && district == null && department == null) {
            throw new UnsupportedOperationException("All filters are null.");
        }

        LocalDateTime reportedAtStart = reportedAt != null ? reportedAt.atStartOfDay() : null;
        LocalDateTime reportedAtEnd = reportedAt != null ? reportedAt.plusDays(1).atStartOfDay() : null;

        return incidentRepository.findFilteredIncidents(
                        status,
                        category,
                        reportedAt != null ? reportedAtStart : null,
                        reportedAtStart,
                        reportedAtEnd,
                        priority,
                        district,
                        department)
                .stream()
                .map(incidentMapper::toDTO)
                .toList();
    }
}
