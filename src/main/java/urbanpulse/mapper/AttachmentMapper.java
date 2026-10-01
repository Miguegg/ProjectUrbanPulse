package urbanpulse.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import urbanpulse.dto.Attachment;
import urbanpulse.entity.AttachmentEntity;

@Component
@AllArgsConstructor
public class AttachmentMapper extends  MapperDTO<Attachment, AttachmentEntity>{
    private final IncidentMapper incidentMapper;
    private final UserMapper userMapper;

    @Override
    public Attachment toDTO(AttachmentEntity attachmentEntity) {
        Attachment attachment = new Attachment();

        attachment.setId(attachmentEntity.getId());
        attachment.setIncident(incidentMapper.toDTO(attachmentEntity.getIncident()));
        attachment.setUploadedBy(userMapper.toDTO(attachmentEntity.getUser()));
        attachment.setFileName(attachmentEntity.getFileName());
        attachment.setContentType(attachmentEntity.getContentType());
        attachment.setSizeBytes(attachmentEntity.getSizeBytes());
        attachment.setStoragePath(attachmentEntity.getStoragePath());
        attachment.setUploadedAt(attachmentEntity.getUploadedAt());
        return attachment;
    }
}
