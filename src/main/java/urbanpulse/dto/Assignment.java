package urbanpulse.dto;

import lombok.Data;
import urbanpulse.dto.Incident;
import urbanpulse.dto.User;

import java.time.LocalDateTime;

@Data
public class Assignment {
    private Integer id;
    private Incident incident;
    private Department department;
    private User technician;
    private User assignedBy;
    private AssignmentStatus status;
    private String notes;
    private LocalDateTime assignedAt;
    private LocalDateTime endedAt;
}
