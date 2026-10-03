package urbanpulse.controller.rest;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import urbanpulse.service.IncidentService;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/api/v1/incidents")
public class IncidentRestController {
    private final IncidentService incidentService;

    /*
    * Gets all incidents
    */
    @GetMapping("/")
    public void getIncidents() {
        //TODO
    }

    /*
     * Gets an incident by its ID.
     * If it does not exist, it returns a 404 error.
     */
    @GetMapping("/{id}")
    public void getIncidentById() {
        //TODO
    }

    /*
     * Filters incidents based on certain criteria.
     */
    @GetMapping
    public void filterIncidents() {
        //TODO
    }

    /*
     * Saves a new incident into the database
     */
    @PostMapping("/")
    public void addIncident() {
        //TODO
    }

    /*
     * Updates an incident.
     */
    @PatchMapping("/{id}")
    public void editIncident() {
        //TODO
    }

    /*
     * Deletes an incident.
     */
    @DeleteMapping("/{id}")
    public void deleteIncident() {
        //TODO
    }
}
