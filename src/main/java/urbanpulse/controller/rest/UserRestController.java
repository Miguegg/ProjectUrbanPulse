package urbanpulse.controller.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import urbanpulse.dto.Role;
import urbanpulse.dto.User;
import urbanpulse.service.UserService;

import java.util.List;
import java.util.UUID;

@RestController
@Slf4j
@AllArgsConstructor
@Tag(name = "Users", description = "User registration, lookup and role management")
@RequestMapping("/api/v1/users")
public class UserRestController {
    private final UserService userService;

    /*
     * Gets all users managed by the system.
    */
    @GetMapping("/")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = this.userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    /*
     * Gets a user by its ID.
     * If it does not exist, it returns a 404 error.
    */
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable UUID id) {
        User user = this.userService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    /*
     * Registers a new user in the system.
    */
    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User created = userService.addUser(
                user.getEmail(),
                user.getPassword(),
                user.getName(),
                user.getPhone(),
                user.getRole(),
                user.getDepartment()
        );
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteUserById(@PathVariable UUID id) {
        this.userService.deleteUserById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    /*
     * Updates the roles and permissions assigned to a user.
    */
    @PatchMapping("/{id}/roles")
    public ResponseEntity<User> editUserRoles(@PathVariable UUID id, @RequestBody Role role) {
        User user = this.userService.editUserRoles(id, role);
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
