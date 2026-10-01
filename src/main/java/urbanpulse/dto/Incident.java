package urbanpulse.dto;

import lombok.Data;
import urbanpulse.entity.UserEntity;

import java.time.LocalDateTime;

@Data
public class Incident {
    private Integer id;
    private String title;
    private String description;
    private Category category;
    private IncidentStatus status;
    private Priority priority;
    private String priorityJustification;
    private Double latitude;
    private Double longitude;
    private Double locationAccuracy;
    private String address;
    private String neighbourhood;
    private District district;
    private UserEntity reporter;
    private LocalDateTime reportedAt;
    private LocalDateTime resolvedAt;
    private LocalDateTime closedAt;
}
