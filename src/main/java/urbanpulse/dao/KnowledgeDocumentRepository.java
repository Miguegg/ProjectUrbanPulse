package urbanpulse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import urbanpulse.entity.KnowledgeDocumentEntity;

public interface KnowledgeDocumentRepository extends JpaRepository<KnowledgeDocumentEntity, Integer> {
}
