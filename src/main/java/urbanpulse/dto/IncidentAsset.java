package urbanpulse.dto;

import lombok.Data;
import urbanpulse.dto.Incident;
import urbanpulse.dto.UrbanAsset;


import java.time.LocalDateTime;

@Data
public class IncidentAsset {
    private Integer id;
    private Incident incident;
    private UrbanAsset asset;
    private AssetLinkType linkType;
    private Double distanceM;
    private Double confidence;
    private LocalDateTime createdAt;
}
