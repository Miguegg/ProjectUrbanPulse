package urbanpulse.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import urbanpulse.dto.UrbanAsset;
import urbanpulse.entity.UrbanAssetEntity;

@Component
@AllArgsConstructor
public class UrbanAssetMapper extends MapperDTO<UrbanAsset, UrbanAssetEntity> {
    public UrbanAsset toDTO(UrbanAssetEntity entity) {
        if (entity == null) return null;
        UrbanAsset dto = new UrbanAsset();
        dto.setId(entity.getId());
        dto.setAssetType(entity.getAssetType());
        dto.setExternalSource(entity.getExternalSource());
        dto.setExternalId(entity.getExternalId());
        dto.setName(entity.getName());
        dto.setLatitude(entity.getLatitude());
        dto.setLongitude(entity.getLongitude());
        dto.setGeometry(entity.getGeometry());
        dto.setMetadata(entity.getMetadata());
        dto.setCreatedDAt(entity.getCreatedAt());
        return dto;
    }
}
