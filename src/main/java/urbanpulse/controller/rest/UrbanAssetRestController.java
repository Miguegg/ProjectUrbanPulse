package urbanpulse.controller.rest;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import urbanpulse.service.UrbanAssetService;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/api/v1/urban-assets")
public class UrbanAssetRestController {
    private final UrbanAssetService urbanAssetService;

    /*
     * Gets urban assets available as relevant city layers.
     */
    @GetMapping("/")
    public void getUrbanAssets() {
        //TODO
    }

    /*
     * Finds candidate urban assets near an incident or location.
     */
    @GetMapping("/nearby")
    public void getNearbyUrbanAssets() {
        //TODO
    }

    /*
     * Gets an urban asset by its ID.
     * If it does not exist, it returns a 404 error.
     */
    @GetMapping("/{id}")
    public void getUrbanAssetById() {
        //TODO
    }
}
