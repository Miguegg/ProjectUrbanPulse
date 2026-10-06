package urbanpulse.controller.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import urbanpulse.dto.Incident;
import urbanpulse.service.IncidentService;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
@Slf4j
@AllArgsConstructor
@Tag(name = "Incidents", description = "Urban incident reporting, search and lifecycle operations")
@RequestMapping("/api/v1/incidents")
public class IncidentRestController {
    private final IncidentService incidentService;

    /*
    * Gets all incidents
    */
    @GetMapping("/")
    public ResponseEntity<List<Incident>> getIncidents() {
        //TODO
        return null;
    }

    /*
     * Gets an incident by its ID.
     * If it does not exist, it returns a 404 error.
    */
    @GetMapping("/{id}")
    public ResponseEntity<Incident> getIncidentById() {
        //TODO
        return null;
    }

    /*
     * Filters incidents based on certain criteria.
    */
    @GetMapping
    public ResponseEntity<List<Incident>> filterIncidents() {
        //TODO
        return null;
    }

    /*
     * Saves a new incident into the database
    */
    @PostMapping("/")
    public ResponseEntity<Incident> addIncident(@RequestBody Incident incident) {
        Incident created = incidentService.addIncident(incident);
        log.info("Incident {} created", created.getId());
        return ResponseEntity.created(URI.create("/api/v1/incidents/" + created.getId())).body(created);
    }

    /*
     * Updates an incident.
    */
    @PatchMapping("/{id}")
    public ResponseEntity<Incident> editIncident(@PathVariable UUID id, @RequestBody Incident incident) {
        return incidentService.editIncident(id, incident)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /*
     * Deletes an incident.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIncident(@PathVariable UUID id) {
        if (!incidentService.deleteIncident(id)) {
            return ResponseEntity.notFound().build();
        }
        log.info("Incident {} deleted", id);
        return ResponseEntity.noContent().build();
    }
}
