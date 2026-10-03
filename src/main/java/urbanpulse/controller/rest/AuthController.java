package urbanpulse.controller.rest;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@AllArgsConstructor
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
