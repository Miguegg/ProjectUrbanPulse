package urbanpulse.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private Integer id;
    private String email;
    private String passwordHash;
    private String name;
    private String phone;
    private Role role;
    // TODO: Department se convertirá en una tabla
    private Department department;
    private Boolean active;
    // TODO: Esta variable es la típica de placeholder de Supabase,
    // TODO: Si no aparece en el pdf se borrará aquí y en Supabase
    private LocalDateTime createdAt;
}
