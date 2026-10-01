package urbanpulse.mapper;

import lombok.AllArgsConstructor;
import urbanpulse.dto.StatusChange;
import urbanpulse.entity.StatusChangeEntity;

@AllArgsConstructor
public class StatusChangeMapper extends MapperDTO<StatusChange, StatusChangeEntity> {
    private final IncidentMapper incidentMapper;

    @Override
    public StatusChange toDTO(StatusChangeEntity statusChangeEntity) {
        StatusChange statusChange = new StatusChange();
        statusChange.setId(statusChangeEntity.getId());
        statusChange.setIncident(incidentMapper.toDTO(statusChangeEntity.getIncident()));
        statusChange.setFromStatus(statusChangeEntity.getFromStatus());
        statusChange.setToStatus(statusChangeEntity.getToStatus());
        statusChange.setChangedAt(statusChangeEntity.getChangedAt());
        statusChange.setChangedAt(statusChangeEntity.getChangedAt());
        statusChange.setReason(statusChangeEntity.getReason());
        statusChange.setData(statusChangeEntity.getData());
        return statusChange;
    }
}
