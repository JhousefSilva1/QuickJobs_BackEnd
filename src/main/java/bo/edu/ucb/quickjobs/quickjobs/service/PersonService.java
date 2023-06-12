package bo.edu.ucb.quickjobs.quickjobs.service;

import bo.edu.ucb.quickjobs.quickjobs.dto.PersonDTO;

public interface PersonService {

    public PersonDTO addPerson(PersonDTO personDTO);

    public PersonDTO getPersonById(Long personId);

    public PersonDTO updatePerson(Long personId, PersonDTO personRequest);

    public void deletePerson(Long personId);


}
