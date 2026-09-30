package urbanpulse.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.CreationTimestamp;
import urbanpulse.dto.IncidentStatus;

import java.time.LocalDateTime;

// Historial auditable: una fila por cada cambio de estado de una incidencia (RF12)
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "status_change")
public class StatusChangeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "incident_id", nullable = false)
    private IncidentEntity incident;

    // Null en el alta (el primer cambio es null -> REPORTED)
    @Enumerated(EnumType.STRING)
    @Column(name = "from_status")
    private IncidentStatus fromStatus;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "to_status")
    private IncidentStatus toStatus;

    // Null si el cambio lo hizo el sistema
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "changed_by_id")
    private UserEntity changedBy;

    @CreationTimestamp
    @Column(nullable = false, name = "changed_at", updatable = false)
    private LocalDateTime changedAt;

    // Obligatorio al rechazar o reabrir (RF09)
    private String reason;

    // JSONB con datos asociados, p. ej. {"department": "MOBILITY"}
    @Column(columnDefinition = "jsonb")
    @ColumnTransformer(write = "?::jsonb")
    private String data;
}
