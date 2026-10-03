package urbanpulse.controller.rest;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import urbanpulse.service.AttachmentService;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/api/v1/attachments")
public class AttachmentRestController {
    private final AttachmentService attachmentService;

    /*
     * Gets the evidence files attached to an incident.
     */
    @GetMapping("/incidents/{incidentId}")
    public void getIncidentAttachments() {
        //TODO
    }

    /*
     * Adds a photo, video or document as evidence for an incident.
     * The file type and size must be validated.
     */
    @PostMapping("/incidents/{incidentId}")
    public void addIncidentAttachment() {
        //TODO
    }
}
