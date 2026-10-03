package urbanpulse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import urbanpulse.entity.UrbanAssetEntity;

public interface UrbanAssetRepository extends JpaRepository<UrbanAssetEntity, Integer> {
}
