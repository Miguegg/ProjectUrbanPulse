package urbanpulse.controller.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import urbanpulse.service.AssignmentService;

@RestController
@Slf4j
@AllArgsConstructor
@Tag(name = "Assignments", description = "Temporal assignment relationships between incidents and departments, teams or technicians")
@RequestMapping("/api/v1/assignments")
public class AssignmentRestController {
    private final AssignmentService assignmentService;

    /*
     * Gets the assignment history associated with an incident.
     */
    @GetMapping("/incidents/{incidentId}")
    public void getIncidentAssignments() {
        //TODO
    }

    /*
     * Assigns a validated incident to a department, team or technician.
     */
    @PostMapping("/")
    public void addAssignment() {
        //TODO
    }

    /*
     * Updates the temporal assignment relationship for an incident.
     */
    @PatchMapping("/{id}")
    public void editAssignment() {
        //TODO
    }
}
