package urbanpulse.dto;

import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class KnowledgeDocument {
    private Integer id;
    private String code;
    private Integer versionNumber;
    private String title;
    private DocumentType docType;
    private String storagePath;
    private String sourceUrl;
    private LocalDate effectiveDate;
    private LocalDateTime indexedAt;
    private LocalDateTime createdAt;
}
