package fr.efrei.springrag.repository;

import fr.efrei.springrag.web.dto.DocumentDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import fr.efrei.springrag.domain.Document;

import java.util.List;


public interface DocumentRepository extends JpaRepository<Document, Long> {
    @Query(
            "select distinct new fr.efrei.springrag.web.dto.DocumentDTO(document.title, document.content) from Document document"
    )
    List<DocumentDTO> findAllDocumentsDTO();
}
