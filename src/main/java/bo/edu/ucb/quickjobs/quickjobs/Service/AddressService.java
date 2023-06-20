package bo.edu.ucb.quickjobs.quickjobs.Service;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.dao.AddressRepository;
import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.AddressEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;

    }
    // 1. Obtener una direccion por su id
    public AddressEntity get(Long addressId){
        return this.addressRepository.findById(addressId).orElseThrow();
    }

    // 1.1 obtener una direccion por su id de persona

    // 2. Obtener todas las direcciones
    public List<AddressEntity> getAll(){
        return this.addressRepository.findAll();
    }
    // 3 Obtener todas las direcciones de una persona

    //4. Agregar una direccion
    public AddressEntity save(AddressEntity address){
        return this.addressRepository.save(address);
    }
    //5. Verificar si existe una direccion
    public boolean exists(Long addressId){
        return this.addressRepository.existsById(addressId);
    }

    //6. Obtener Direcciones Activas
    public List<AddressEntity> getAvailable(){
        return this.addressRepository.findAllByStatusTrue();
    }

    //7. Obtener Direcciones Inactivas

    public List<AddressEntity> getUnavailable(){
        return this.addressRepository.findAllByStatusFalse();
    }

    //8. Eliminar una direccion
    public void delete(Long addressId){
        this.addressRepository.deleteById(addressId);
    }


}
