package urbanpulse.controller.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import urbanpulse.dto.*;
import urbanpulse.service.IncidentService;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
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
        return ResponseEntity.ok(this.incidentService.getAllIncidents());
    }

    /*
     * Gets an incident by its ID.
     * If it does not exist, it returns a 404 error.
    */
    @GetMapping("/{id}")
    public ResponseEntity<Incident> getIncidentById(@PathVariable UUID id) {
        Optional<Incident> incident = incidentService.getIncidentById(id);
        return incident.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * Filters incidents using any combination of the supported criteria.
     * Null filters are ignored, while multiple filters are combined with logical AND.
     *
     * @param status filter by incident status
     * @param category filter by incident category
     * @param date filter by reported date alias
     * @param reportedAt filter by reported date
     * @param priority filter by priority level
     * @param district filter by district
     * @param department filter by reporter department
     * @return a list of incidents matching the request filters
     */
    @GetMapping
    public ResponseEntity<List<Incident>> filterIncidents(
           @RequestParam(required = false) IncidentStatus status,
           @RequestParam(required = false) Category category,
           @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
           @RequestParam(required = false, name = "reportedAt") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate reportedAt,
           @RequestParam(required = false) Priority priority,
           @RequestParam(required = false) District district,
           @RequestParam(required = false) Department department) {

       LocalDate filterDate = reportedAt != null ? reportedAt : date;
       List<Incident> incidents = incidentService.filterIncidents(status, category, filterDate, priority, district, department);
       return ResponseEntity.ok(incidents);
    }

    /*
     * Saves a new incident into the database
    */
    @PostMapping("/")
    public ResponseEntity<Incident> addIncident() {
        //TODO
        return null;
    }

    /*
     * Updates an incident.
    */
    @PatchMapping("/{id}")
    public ResponseEntity<Incident> editIncident() {
        //TODO
        return null;
    }

    /*
     * Deletes an incident.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIncident() {
        //TODO
        return null;
    }
}
