package bo.edu.ucb.quickjobs.quickjobs.serviceImpl;

import bo.edu.ucb.quickjobs.quickjobs.dto.AddressDTO;
import bo.edu.ucb.quickjobs.quickjobs.entity.Address;
import bo.edu.ucb.quickjobs.quickjobs.entity.Person;
import bo.edu.ucb.quickjobs.quickjobs.exceptions.ResourceNotFoundException;
import bo.edu.ucb.quickjobs.quickjobs.repository.AddressRepository;
import bo.edu.ucb.quickjobs.quickjobs.repository.PersonRepository;
import bo.edu.ucb.quickjobs.quickjobs.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private PersonRepository personRepository;



    private AddressDTO mapperDTO(Address address){
        return modelMapper.map(address, AddressDTO.class);
    }

    private Address mapperEntity(AddressDTO addressDTO){
        return modelMapper.map(addressDTO, Address.class);
    }

    @Override
    public AddressDTO addAddress(long personId, AddressDTO addressDTO) {
        Address address = mapperEntity(addressDTO);
        Person person = (Person) personRepository.findById(personId).orElseThrow(()-> new ResourceNotFoundException("Person", "id", personId));
        address.setPerson(person);
        Address newAddress = addressRepository.save(address);
        return mapperDTO(newAddress);
    }

    @Override
    public List<AddressDTO> getAddressesByPersonId(long personId) {
        List<Address> addresses = addressRepository.findByPersonId(personId);
        return addresses.stream().map(address -> mapperDTO((Address) address)).collect(Collectors.toList());
    }

    @Override
    public AddressDTO getAddressById(Long personId, Long addressId) {

        return null;
    }

    @Override
    public AddressDTO updateAddress(Long personId, Long addressId, AddressDTO addressRequest) {
        return null;
    }

    @Override
    public void deleteAddress(Long personId, Long addressId) {

    }
}
