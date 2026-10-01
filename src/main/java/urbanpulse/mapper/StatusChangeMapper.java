package urbanpulse.mapper;

import org.springframework.stereotype.Component;
import urbanpulse.dto.StatusChange;
import urbanpulse.dto.User;
import urbanpulse.entity.StatusChangeEntity;

@Component
public class StatusChangeMapper extends MapperDTO<StatusChange, StatusChangeEntity>{

    private IncidentMapper incidentMapper;
    private UserMapper userMapper;

    public StatusChange toDTO(StatusChangeEntity entity) {
        if (entity == null) return null;
        StatusChange dto = new StatusChange();
        dto.setId(entity.getId());
        dto.setIncident(incidentMapper.toDTO(entity.getIncident()));
        dto.setFromStatus(entity.getFromStatus());
        dto.setToStatus(entity.getToStatus());
        dto.setChangedBy(userMapper.toDTO(entity.getChangedBy()));
        dto.setChangedAt(entity.getChangedAt());
        dto.setReason(entity.getReason());
        dto.setData(entity.getData());
        return dto;
    }
}
