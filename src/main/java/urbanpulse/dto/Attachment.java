package urbanpulse.dto;

import lombok.Data;
import urbanpulse.dto.Inciden;
import urbanpulse.dto.User;

import java.time.LocalDateTime;

@Data
public class Attachment {
    private Integer id;
    private Incident incident;
    private User uploadedBy;
    private String fileName;
    private String contentType;
    private Long sizeBytes;
    private String storagePath;
    private LocalDateTime uploadedAt;
}
