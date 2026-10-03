package urbanpulse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import urbanpulse.entity.UrbanContextEntity;

public interface UrbanContextRepository extends JpaRepository<UrbanContextEntity, Integer> {
}
