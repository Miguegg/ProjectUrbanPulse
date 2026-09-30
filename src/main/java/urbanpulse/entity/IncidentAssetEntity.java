package urbanpulse.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import urbanpulse.dto.AssetLinkType;

import java.time.LocalDateTime;

// Relación incidencia - activo urbano (RF22). Puede haber varios candidatos
// por incidencia, pero solo uno CONFIRMED.
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "incident_asset")
public class IncidentAssetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "incident_id", nullable = false)
    private IncidentEntity incident;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "asset_id", nullable = false)
    private UrbanAssetEntity asset;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "link_type")
    private AssetLinkType linkType;

    @Column(name = "distance_m")
    private Double distanceM;

    // Entre 0 y 1
    private Double confidence;

    @CreationTimestamp
    @Column(nullable = false, name = "created_at", updatable = false)
    private LocalDateTime createdAt;
}
