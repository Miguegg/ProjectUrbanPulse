package org.example.proyectourbanpulse.controller.rest;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/api/v1/urbanAsset")
public class UrbanAssetRestController {

    //Get all urban assets
    @GetMapping("/")
    public void listarUrbanAssets(){

    }

    //Get urban asset by id
    @GetMapping("/{id}")
    public void buscarUrbanAsset(){

    }

    //Deletes urban asset by id
    @DeleteMapping("/{id")
    public void eliminarUrbanAsset(){

    }

    //Updates urban asset by id
    @PutMapping("/{id}")
    public void  editarUrbanAsset(){

    }

    //Creates a new urban asset
    @PostMapping("/")
    public void crearUrbanAsset(){

    }

    //Lists urban assets according to the filters
    @GetMapping("/filter")
    public void filtrarUrbanAsset(){

    }

}
