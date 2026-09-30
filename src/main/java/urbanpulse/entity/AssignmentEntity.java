package urbanpulse.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import urbanpulse.dto.AssignmentStatus;
import urbanpulse.dto.Department;

import java.time.LocalDateTime;

// Relación temporal incidencia - departamento - técnico (RF11).
// Solo puede haber una asignación abierta (ended_at null) por incidencia.
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "assignment")
public class AssignmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "incident_id", nullable = false)
    private IncidentEntity incident;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Department department;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "technician_id")
    private UserEntity technician;

    // Null si la asignación fue automática
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assigned_by_id")
    private UserEntity assignedBy;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AssignmentStatus status = AssignmentStatus.PENDING;

    private String notes;

    @CreationTimestamp
    @Column(nullable = false, name = "assigned_at", updatable = false)
    private LocalDateTime assignedAt;

    // Hay que rellenarlo al pasar a DECLINED, COMPLETED o CANCELLED
    @Column(name = "ended_at")
    private LocalDateTime endedAt;
}
