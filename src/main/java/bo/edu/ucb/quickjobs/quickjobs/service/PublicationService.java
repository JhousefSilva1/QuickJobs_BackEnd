package bo.edu.ucb.quickjobs.quickjobs.service;

import bo.edu.ucb.quickjobs.quickjobs.dto.PublicationDTO;
import bo.edu.ucb.quickjobs.quickjobs.dto.PublicationResponse;

public interface PublicationService {

    public PublicationDTO addPublication(PublicationDTO publicationDTO);

    public PublicationResponse getAllPublications(int numberPage, int sizePage, String sortBy, String sortType);

    public PublicationDTO getPublicationById(long id);

    public  PublicationDTO updatePublication(PublicationDTO publicationDTO, long id);

    public void deletePublication(long id);
}
