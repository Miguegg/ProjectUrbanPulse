package urbanpulse.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import urbanpulse.dto.Category;
import urbanpulse.dto.Department;
import urbanpulse.dto.District;
import urbanpulse.dto.IncidentStatus;
import urbanpulse.dto.Priority;
import urbanpulse.entity.IncidentEntity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public interface IncidentRepository extends JpaRepository<IncidentEntity, UUID> {

    @Query("""
            SELECT i
            FROM IncidentEntity i
            LEFT JOIN FETCH i.reporter r
            WHERE (:status IS NULL OR i.status = :status)
              AND (:category IS NULL OR i.category = :category)
              AND (:reportedAt IS NULL OR (i.reportedAt >= :reportedAtStart AND i.reportedAt < :reportedAtEnd))
              AND (:priority IS NULL OR i.priority = :priority)
              AND (:district IS NULL OR i.district = :district)
              AND (:department IS NULL OR r.department = :department)
            """)
    List<IncidentEntity> findFilteredIncidents(
            @Param("status") IncidentStatus status,
            @Param("category") Category category,
            @Param("reportedAt") LocalDateTime reportedAt,
            @Param("reportedAtStart") LocalDateTime reportedAtStart,
            @Param("reportedAtEnd") LocalDateTime reportedAtEnd,
            @Param("priority") Priority priority,
            @Param("district") District district,
            @Param("department") Department department);
}
