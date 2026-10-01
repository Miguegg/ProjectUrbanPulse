package urbanpulse.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StatusChange {
    private Integer id;
    private Incident incident;
    private IncidentStatus fromStatus;
    private IncidentStatus toStatus;
    private User changedBy;
    private LocalDateTime changedAt;
    private String reason;
    private String data;
}
