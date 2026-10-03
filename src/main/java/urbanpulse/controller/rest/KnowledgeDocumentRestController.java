package urbanpulse.controller.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import urbanpulse.service.KnowledgeDocumentService;

@RestController
@Slf4j
@AllArgsConstructor
@Tag(name = "Knowledge Documents", description = "Versioned procedures and regulations available for consultation and RAG")
@RequestMapping("/api/v1/knowledge-documents")
public class KnowledgeDocumentRestController {
    private final KnowledgeDocumentService knowledgeDocumentService;

    /*
     * Gets indexed procedures and regulations available for consultation.
     */
    @GetMapping("/")
    public void getKnowledgeDocuments() {
        //TODO
    }

    /*
     * Gets a knowledge document by its ID.
     * If it does not exist, it returns a 404 error.
     */
    @GetMapping("/{id}")
    public void getKnowledgeDocumentById() {
        //TODO
    }

    /*
     * Searches procedures and regulations to support assisted recommendations.
     */
    @GetMapping("/search")
    public void searchKnowledgeDocuments() {
        //TODO
    }

    /*
     * Saves a versioned procedure or regulation for later indexing.
     */
    @PostMapping("/")
    public void addKnowledgeDocument() {
        //TODO
    }
}
