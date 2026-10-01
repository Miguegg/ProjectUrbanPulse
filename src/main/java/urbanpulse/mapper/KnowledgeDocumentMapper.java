package urbanpulse.mapper;

import urbanpulse.dto.Incident;
import urbanpulse.dto.KnowledgeDocument;
import urbanpulse.entity.IncidentEntity;
import urbanpulse.entity.KnowledgeDocumentEntity;

public class KnowledgeDocumentMapper extends MapperDTO<KnowledgeDocument, KnowledgeDocumentEntity> {

    @Override
    public KnowledgeDocument toDTO(KnowledgeDocumentEntity document) {
        KnowledgeDocument knowledgeDocument = new KnowledgeDocument();
        knowledgeDocument.setId(knowledgeDocument.getId());
        knowledgeDocument.setCode(knowledgeDocument.getCode());
        knowledgeDocument.setVersionNumber(knowledgeDocument.getVersionNumber());
        knowledgeDocument.setTitle(knowledgeDocument.getTitle());
        knowledgeDocument.setDocType(knowledgeDocument.getDocType());
        knowledgeDocument.setStoragePath(knowledgeDocument.getStoragePath());
        knowledgeDocument.setSourceUrl(knowledgeDocument.getSourceUrl());
        knowledgeDocument.setEffectiveFrom(knowledgeDocument.getEffectiveFrom());
        knowledgeDocument.setIndexedAt(knowledgeDocument.getIndexedAt());
        knowledgeDocument.setCreatedAt(knowledgeDocument.getCreatedAt());
        return knowledgeDocument;
    }
}
