package bo.edu.ucb.quickjobs.quickjobs.Service;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.dao.AddressRepository;
import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.AddressEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    public AddressEntity get(Long addressId){
        return this.addressRepository.findById(addressId).orElseThrow();
    }
    public List<AddressEntity> getAll(){
        return this.addressRepository.findAll();
    }

    public String getAllByPerson(Long personId){
        return this.addressRepository.findAllByPersonId(personId);
    }

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    //agregar una direccion
    public AddressEntity save(AddressEntity address){
        return this.addressRepository.save(address);
    }

    public boolean exists(Long addressId){
        return this.addressRepository.existsById(addressId);
    }
}
