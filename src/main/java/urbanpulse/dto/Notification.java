package urbanpulse.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Notification {
    private Integer id;
    private User recipient;
    private Incident incident;
    private NotificationEvent event;
    private NotificationChannel channel;
    private String message;
    private NotificationStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime sentAt;
    private LocalDateTime readAt;
}
