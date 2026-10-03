package urbanpulse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import urbanpulse.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
