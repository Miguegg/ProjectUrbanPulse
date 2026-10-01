package urbanpulse.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import urbanpulse.dto.Assignment;
import urbanpulse.entity.AssignmentEntity;

@Component
@AllArgsConstructor
public class AssignmentMapper extends MapperDTO<Assignment, AssignmentEntity>{
    private final IncidentMapper incidentMapper;
    private final UserMapper userMapper;

    @Override
    public Assignment toDTO(AssignmentEntity assignmentEntity) {
        Assignment assignment = new Assignment();

        assignment.setId(assignmentEntity.getId());
        assignment.setIncident(incidentMapper.toDTO(assignmentEntity.getIncident()));
        assignment.setDepartment(assignmentEntity.getDepartment());
        assignment.setTechnician(userMapper.toDTO(assignmentEntity.getTechnician()));
        assignment.setAssignedBy(userMapper.toDTO(assignmentEntity.getAssignedBy()));
        assignment.setStatus(assignmentEntity.getStatus());
        assignment.setNotes(assignmentEntity.getNotes());
        assignment.setAssignedAt(assignmentEntity.getAssignedAt());
        assignment.setEndedAt(assignmentEntity.getEndedAt());

        return assignment;
    }
}
