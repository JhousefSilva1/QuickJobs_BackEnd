package bo.edu.ucb.quickjobs.quickjobs.controller;

import bo.edu.ucb.quickjobs.quickjobs.dto.PublicationDTO;
import bo.edu.ucb.quickjobs.quickjobs.dto.PublicationResponse;
import bo.edu.ucb.quickjobs.quickjobs.service.PublicationService;
import bo.edu.ucb.quickjobs.quickjobs.utils.AppConstants;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/publication")
public class PublicationController {

    @Autowired
    private PublicationService publicationService;

    @GetMapping
    public PublicationResponse getPublications(@RequestParam(value = "numberPage", defaultValue = AppConstants.NUMBER_PAGE_DEFAULT, required = false) int numberPage, @RequestParam(value = "sizePage", defaultValue = AppConstants.SIZE_PAGE_DEFAULT, required = false) int sizePage, @RequestParam(value = "sortBy", defaultValue = AppConstants.SORT_BY_DEFAULT, required = false) String sortBy, @RequestParam(value = "sortType", defaultValue = AppConstants.SORT_TYPE_DEFAULT, required = false) String sortType){
        return publicationService.getAllPublications(numberPage, sizePage, sortBy, sortType);
    }

    @PostMapping
    public ResponseEntity<PublicationDTO> savePublication(@Valid @RequestBody PublicationDTO publicationDTO){
        return new ResponseEntity<>(publicationService.addPublication(publicationDTO), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PublicationDTO> getPublicationById(@PathVariable(name = "id") long id){
        return ResponseEntity.ok(publicationService.getPublicationById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PublicationDTO> updatePublication(@Valid @RequestBody PublicationDTO publicationDTO, @PathVariable(name = "id") long id){
        PublicationDTO publicationResponse = publicationService.updatePublication(publicationDTO, id);
        return new ResponseEntity<>(publicationResponse, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePublication(@PathVariable(name = "id") long id){
        publicationService.deletePublication(id);
        return  new ResponseEntity<>("Publicacion eliminada con exito", HttpStatus.OK);
    }

}
