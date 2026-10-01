package urbanpulse.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import urbanpulse.dto.ExternalObservation;
import urbanpulse.entity.ExternalObservationEntity;

@Component
@AllArgsConstructor
public class ExternalObservationMapper extends MapperDTO<ExternalObservation, ExternalObservationEntity>{
    @Override
    public ExternalObservation toDTO(ExternalObservationEntity externalObservationEntity) {
        ExternalObservation externalObservation = new ExternalObservation();

        externalObservation.setId(externalObservationEntity.getId());
        externalObservation.setSource(externalObservationEntity.getSource());
        externalObservation.setContextType(externalObservationEntity.getContextType());
        externalObservation.setVariable(externalObservationEntity.getVariable());
        externalObservation.setValueNumeric(externalObservationEntity.getValueNumeric());
        externalObservation.setValueText(externalObservationEntity.getValueText());
        externalObservation.setUnit(externalObservationEntity.getUnit());
        externalObservation.setQuality(externalObservationEntity.getQuality());
        externalObservation.setObservedAt(externalObservationEntity.getObservedAt());
        externalObservation.setIngestedAt(externalObservationEntity.getIngestedAt());
        externalObservation.setValidUntil(externalObservationEntity.getValidUntil());
        externalObservation.setLatitude(externalObservationEntity.getLatitude());
        externalObservation.setLongitude(externalObservationEntity.getLongitude());
        externalObservation.setDistrict(externalObservationEntity.getDistrict());

        return externalObservation;
    }
}
