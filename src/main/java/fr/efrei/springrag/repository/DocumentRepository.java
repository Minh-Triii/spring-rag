package fr.efrei.springrag.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import fr.efrei.springrag.domain.Document;


public interface DocumentRepository extends JpaRepository<Document, Long> {
    /*@Query(
            "select disctinct new net.filecode.rag.repository.dto.DocumentDTO(document.title)"
    )
    List<DocumentDTO> findAllDocumentsDTO();*/
}
