package urbanpulse.dto;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ExternalObservation {

    private Integer id;
    private ExternalSource source;
    private ContextType contextType;
    private String variable;
    private Double valueNumeric;
    private String valueText;
    private String unit;
    private ObservationQuality quality;
    private LocalDateTime observedAt;
    private LocalDateTime ingestedAt;
    private LocalDateTime validUntil;
    private Double latitude;
    private Double longitude;
    private District district;
}
