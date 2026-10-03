package urbanpulse.controller.rest;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import urbanpulse.service.UrbanContextService;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/api/v1/urban-contexts")
public class UrbanContextRestController {
    private final UrbanContextService urbanContextService;

    /*
     * Gets the urban context associated with an incident.
     */
    @GetMapping("/incidents/{incidentId}")
    public void getIncidentUrbanContext() {
        //TODO
    }

    /*
     * Gets aggregated urban context for a zone and period.
     */
    @GetMapping("/zones")
    public void getZoneUrbanContext() {
        //TODO
    }
}
