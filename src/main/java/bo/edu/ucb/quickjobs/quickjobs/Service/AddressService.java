package bo.edu.ucb.quickjobs.quickjobs.Service;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.dao.AddressRepository;
import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.AddressEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

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
