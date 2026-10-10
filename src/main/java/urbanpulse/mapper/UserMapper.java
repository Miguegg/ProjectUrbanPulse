package urbanpulse.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import urbanpulse.dto.User;
import urbanpulse.entity.UserEntity;

@Component
@AllArgsConstructor
public class UserMapper extends MapperDTO<User, UserEntity> {
    public User toDTO(UserEntity entity) {
        if (entity == null) return null;
        User dto = new User();
        dto.setId(entity.getId());
        dto.setEmail(entity.getEmail());
        dto.setPasswordHash(entity.getPasswordHash());
        dto.setName(entity.getName());
        dto.setPhone(entity.getPhone());
        dto.setRole(entity.getRole());
        dto.setDepartment(entity.getDepartment());
        dto.setActive(entity.getActive());
        // TODO: Si se borra en Supa y DTO se borra este tmb
        dto.setCreatedAt(entity.getCreatedAt());
        return dto;
    }

    public UserEntity toEntity(User dto) {
        if (dto == null) return null;
        UserEntity entity = new UserEntity();
        entity.setId(dto.getId());
        return entity;
    }
}
