package urbanpulse.controller.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@AllArgsConstructor
@Tag(name = "Authentication", description = "User and municipal staff authentication")
@RequestMapping("/api/v1/auth")
public class AuthController {

    /*
     * Authenticates a user or authorized municipal staff member.
     */
    @PostMapping("/login")
    public void login() {
        //TODO
    }
}
