package urbanpulse.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UrbanAsset {
    private Integer id;
    private AssetType assetType;
    private ExternalSource externalSource;
    private String externalId;
    private String name;
    private Double latitude;
    private Double longitude;
    private String geometry;
    private String metadata;
    private LocalDateTime createdDAt;
}
