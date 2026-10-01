package urbanpulse.controller.rest;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/api/v1/users")
public class UserRestController {

    //Get all users
    @GetMapping("/")
    public void listarUsuarios(){

    }

    //Get user by id
    @GetMapping("/{id}")
    public void buscarUsuario(){

    }

    //Deletes user by id
    @DeleteMapping("/{id")
    public void eliminarUsuario(){

    }

    //Updates user by id
    @PutMapping("/{id}")
    public void  editarUsuario(){

    }

    //Creates a new user
    @PostMapping("/")
    public void crearUsuario(){

    }

    //Lists users according to the filters
    @GetMapping("/filter")
    public void filtrarUsuarios(){

    }

}
