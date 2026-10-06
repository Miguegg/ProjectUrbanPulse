package urbanpulse.service;

import org.springframework.transaction.annotation.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import urbanpulse.dao.UserRepository;
import urbanpulse.dto.Department;
import urbanpulse.dto.Role;
import urbanpulse.dto.User;
import urbanpulse.entity.UserEntity;
import urbanpulse.mapper.UserMapper;
import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    public List<User> getAllUsers() {
        return userMapper.toDTOList(userRepository.findAll());
    }

    public User getUserById(UUID id) {
        return userMapper.toDTO(userRepository.findById(id).orElse(null));
    }

    @Transactional
    public User addUser(String email,
                        String password,
                        String name,
                        String phone,
                        Role role,
                        Department department) {
        UserEntity user = new UserEntity();
        user.setEmail(email);
        user.setPasswordHash(passwordEncoder.encode(password));
        user.setName(name);
        user.setPhone(phone);
        user.setRole(role);
        user.setDepartment(department);
        user.setActive(true);
        return userMapper.toDTO(userRepository.save(user));
    }

    public User editUserRoles(UUID id, Role newRole) {
        UserEntity user = userRepository.findById(id).orElse(null);
        // No puede dar null, porque se hará con select, radio o checkbox
        user.setRole(newRole);
        return userMapper.toDTO(userRepository.save(user));
    }
}
