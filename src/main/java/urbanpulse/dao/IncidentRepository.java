package urbanpulse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import urbanpulse.entity.IncidentEntity;

public interface IncidentRepository extends JpaRepository<IncidentEntity, Integer> {
}
