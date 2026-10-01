package urbanpulse.mapper;

import urbanpulse.dto.Notification;
import urbanpulse.entity.NotificationEntity;

public class NotificationMapper extends MapperDTO<Notification, NotificationEntity> {

    @Override
    public Notification toDTO(NotificationEntity notificationEntity) {
        Notification notification = new Notification();
        notification.setId(notificationEntity.getId());
        notification.setRecipient(notificationEntity.getRecipient());
        notification.setIncident(notificationEntity.getIncident());
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
