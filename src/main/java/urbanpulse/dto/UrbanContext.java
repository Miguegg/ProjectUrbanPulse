package urbanpulse.dto;

import lombok.Data;
import urbanpulse.entity.ExternalObservationEntity;

import java.time.LocalDateTime;

@Data
public class UrbanContext {
    private Incident incident;
    // TODO: District será una tabla
    private District district;
    private LocalDateTime referenceTime;
    private ContextStatus status;
    private String summary;
    private LocalDateTime createdAt;
    private Set<ExternalObservation> observation;
}
