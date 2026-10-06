package urbanpulse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class User {
    private UUID id;
    private String email;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String name;
    private String phone;
    private Role role;
    // TODO: Department se convertirá en una tabla
    private Department department;
    private Boolean active;
    // Campo por defecto de Supabse
    // Pero lo he decidido dejar en Usuario porque una feature típica en apps y webs
    // Son los aniversarios o recompensas por longevidad
    private LocalDateTime createdAt;
}
