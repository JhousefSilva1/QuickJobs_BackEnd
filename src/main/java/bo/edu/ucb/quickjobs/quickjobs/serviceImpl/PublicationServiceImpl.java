package bo.edu.ucb.quickjobs.quickjobs.serviceImpl;

import bo.edu.ucb.quickjobs.quickjobs.dto.PublicationDTO;
import bo.edu.ucb.quickjobs.quickjobs.dto.PublicationResponse;
import bo.edu.ucb.quickjobs.quickjobs.entity.Publication;
import bo.edu.ucb.quickjobs.quickjobs.exceptions.ResourceNotFoundException;
import bo.edu.ucb.quickjobs.quickjobs.repository.PublicationRepository;
import bo.edu.ucb.quickjobs.quickjobs.service.PublicationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PublicationServiceImpl implements PublicationService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PublicationRepository publicationRepository;

    @Override
    public PublicationDTO addPublication(PublicationDTO publicationDTO) {
        //Convert DTO to Entity
        Publication publication = mapperEntity(publicationDTO);
        Publication newPublication = publicationRepository.save(publication);
        //Convert Entity to DTO
        PublicationDTO publicationResponse = mapperDTO(newPublication);
        return publicationResponse;
    }

    @Override
    public PublicationResponse getAllPublications(int numberPage, int sizePage, String sortBy, String sortType) {
        Sort sort = sortType.equalsIgnoreCase(Sort.Direction.ASC.name())? Sort.by(sortBy).ascending(): Sort.by(sortBy).descending();
        Pageable pegeable = PageRequest.of(numberPage, sizePage, sort);
        Page<Publication> publications = publicationRepository.findAll(pegeable);


        List<Publication> listPublications = publications.getContent();
        List<PublicationDTO> content = listPublications.stream().map(publication -> mapperDTO(publication)).collect(Collectors.toList());

        PublicationResponse publicationResponse = new PublicationResponse();
        publicationResponse.setContent(content);
        publicationResponse.setNumberPage(publications.getNumber());
        publicationResponse.setSizePage(publications.getSize());
        publicationResponse.setTotalElements(publications.getTotalElements());
        publicationResponse.setTotalPages(publications.getTotalPages());
        publicationResponse.setLast(publications.isLast());

        return publicationResponse;
    }

    @Override
    public PublicationDTO getPublicationById(long id) {
        Publication publication = publicationRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Publication", "id", id));
        return mapperDTO(publication);
    }

    @Override
    public PublicationDTO updatePublication(PublicationDTO publicationDTO, long id) {
        Publication publication = publicationRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Publication", "id", id));
        publication.setTitle(publicationDTO.getTitle());
        publication.setDescription(publicationDTO.getDescription());
        publication.setContent(publicationDTO.getContent());

        Publication publicationUpdated = publicationRepository.save(publication);
        return mapperDTO(publicationUpdated);
    }

    @Override
    public void deletePublication(long id) {
        Publication publication = publicationRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Publication", "id", id));
        publicationRepository.delete(publication);
    }

    //Convert Entity to DTO
    private PublicationDTO mapperDTO(Publication publication){
        PublicationDTO publicationDTO = modelMapper.map(publication, PublicationDTO.class);
        return publicationDTO;
    }

    //Convert DTO to Entity
    private Publication mapperEntity(PublicationDTO publicationDTO){
        Publication publication = modelMapper.map(publicationDTO, Publication.class);
        return publication;
    }
}
