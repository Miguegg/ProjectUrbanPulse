package urbanpulse.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import urbanpulse.dto.Notification;
import urbanpulse.entity.NotificationEntity;

@Component
@AllArgsConstructor
public class NotificationMapper extends MapperDTO<Notification, NotificationEntity> {
    private final UserMapper userMapper;
    private final IncidentMapper incidentMapper;

    @Override
    public Notification toDTO(NotificationEntity notificationEntity) {
        Notification notification = new Notification();
        notification.setId(notificationEntity.getId());
        notification.setRecipient(userMapper.toDTO(notificationEntity.getRecipient()));
        notification.setIncident(incidentMapper.toDTO(notificationEntity.getIncident()));
        notification.setEvent(notificationEntity.getEvent());
        notification.setChannel(notificationEntity.getChannel());
        notification.setMessage(notificationEntity.getMessage());
        notification.setStatus(notificationEntity.getStatus());
        notification.setCreatedAt(notificationEntity.getCreatedAt());
        notification.setSentAt(notificationEntity.getSentAt());
        notification.setReadAt(notificationEntity.getReadAt());
        return notification;
    }
}
