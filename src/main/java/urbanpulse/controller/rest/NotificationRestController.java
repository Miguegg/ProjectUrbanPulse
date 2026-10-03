package urbanpulse.controller.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import urbanpulse.service.NotificationService;

@RestController
@Slf4j
@AllArgsConstructor
@Tag(name = "Notifications", description = "Notifications generated from relevant incident events")
@RequestMapping("/api/v1/notifications")
public class NotificationRestController {
    private final NotificationService notificationService;

    /*
     * Gets notifications generated for a user.
     */
    @GetMapping("/users/{userId}")
    public void getUserNotifications() {
        //TODO
    }

    /*
     * Updates the delivery status of a notification.
     */
    @PatchMapping("/{id}")
    public void editNotificationStatus() {
        //TODO
    }
}
