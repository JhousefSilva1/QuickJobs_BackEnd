package bo.edu.ucb.quickjobs.quickjobs.service;

import bo.edu.ucb.quickjobs.quickjobs.dto.DocumentsDTO;

public interface DocumentsService {

    public DocumentsDTO addDocuments(DocumentsDTO documentsDTO);

    public DocumentsDTO getDocumentsById(Long documentsId);

    public DocumentsDTO updateDocuments(Long documentsId, DocumentsDTO documentsRequest);

    public void deleteDocuments(Long documentsId);
}
