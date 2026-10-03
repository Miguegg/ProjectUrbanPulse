package urbanpulse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import urbanpulse.entity.AttachmentEntity;

public interface AttachmentRepository extends JpaRepository<AttachmentEntity, Integer> {

}
