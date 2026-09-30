package urbanpulse.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import urbanpulse.dto.ContextType;
import urbanpulse.dto.District;
import urbanpulse.dto.ExternalSource;
import urbanpulse.dto.ObservationQuality;

import java.time.LocalDateTime;

// Dato externo normalizado: fuente, instante de observación, de ingesta, unidad y calidad (RF23)
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "external_observation")
public class ExternalObservationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ExternalSource source;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "context_type")
    private ContextType contextType;

    // Qué se mide, p. ej. "temperature" o "traffic_intensity"
    @Column(nullable = false)
    private String variable;

    // Al menos uno de los dos valores tiene que venir relleno
    @Column(name = "value_numeric")
    private Double valueNumeric;

    @Column(name = "value_text")
    private String valueText;

    private String unit;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ObservationQuality quality;

    @Column(nullable = false, name = "observed_at")
    private LocalDateTime observedAt;

    @CreationTimestamp
    @Column(nullable = false, name = "ingested_at", updatable = false)
    private LocalDateTime ingestedAt;

    // Caducidad del dato
    @Column(name = "valid_until")
    private LocalDateTime validUntil;

    private Double latitude;

    private Double longitude;

    @Enumerated(EnumType.STRING)
    private District district;
}
