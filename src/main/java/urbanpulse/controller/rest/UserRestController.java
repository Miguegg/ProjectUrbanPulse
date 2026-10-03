package urbanpulse.controller.rest;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import urbanpulse.service.UserService;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/api/v1/users")
public class UserRestController {
    private final UserService userService;

    /*
     * Gets all users managed by the system.
     */
    @GetMapping("/")
    public void getUsers() {
        //TODO
    }

    /*
     * Gets a user by its ID.
     * If it does not exist, it returns a 404 error.
     */
    @GetMapping("/{id}")
    public void getUserById() {
        //TODO
    }

    /*
     * Registers a new user in the system.
     */
    @PostMapping("/")
    public void addUser() {
        //TODO
    }

    /*
     * Updates the roles and permissions assigned to a user.
     */
    @PatchMapping("/{id}/roles")
    public void editUserRoles() {
        //TODO
    }
}
