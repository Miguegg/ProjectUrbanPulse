package urbanpulse.controller.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import urbanpulse.dto.UrbanAsset;
import urbanpulse.service.UrbanAssetService;

import java.util.List;
import java.util.UUID;

@RestController
@Slf4j
@AllArgsConstructor
@Tag(name = "Urban Assets", description = "City assets and candidate assets near incidents or locations")
@RequestMapping("/api/v1/urban-assets")
public class UrbanAssetRestController {
    private final UrbanAssetService urbanAssetService;

    /*
     * Gets urban assets available as relevant city layers.
    */
    @GetMapping("/")
    public ResponseEntity<List<UrbanAsset>> getUrbanAssets() {
        try { return ResponseEntity.ok(this.urbanAssetService.getAllAssets()); }
        catch(Exception e) { return ResponseEntity.notFound().build(); }
    }

    /*
     * Finds candidate urban assets near an incident or location.
     * radiusMeters is optional (50 m by default) and must be greater than 0.
    */
    @GetMapping("/nearby")
    public ResponseEntity<List<UrbanAsset>> getNearbyUrbanAssets(
            @RequestParam UUID incidentID,
            @RequestParam(defaultValue = "50") double radiusMeters) {
        if (radiusMeters <= 0) return ResponseEntity.badRequest().build();
        try { return ResponseEntity.ok(this.urbanAssetService.getNearbyAssets(incidentID, radiusMeters)); }
        catch(Exception e) { return ResponseEntity.notFound().build(); }
    }

    /*
     * Gets an urban asset by its ID.
     * If it does not exist, it returns a 404 error.
    */
    @GetMapping("/{id}")
    public ResponseEntity<UrbanAsset> getUrbanAssetById() {
        //TODO
        return null;
    }
}
