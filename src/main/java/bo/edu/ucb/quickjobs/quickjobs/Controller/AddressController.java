package bo.edu.ucb.quickjobs.quickjobs.Controller;

import bo.edu.ucb.quickjobs.quickjobs.Persistence.entity.AddressEntity;
import bo.edu.ucb.quickjobs.quickjobs.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/addresses")
public class AddressController {

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    //1. Obtener una direccion por su id
    @GetMapping("/{addressId}")
    public ResponseEntity<AddressEntity> get(@PathVariable Long AddressId){
        return ResponseEntity.ok(this.addressService.get(AddressId));
    }

    //2. Obtener todas las direcciones
    @GetMapping
    public ResponseEntity<List<AddressEntity>> getAll(){
        return ResponseEntity.ok(this.addressService.getAll());
    }

    //4. Agregar una direccion a una persona
    @PostMapping("/persons/{personId}")
    public ResponseEntity<AddressEntity> add(@RequestBody AddressEntity address){
        if (address.getIdAddress() == null || !this.addressService.exists(address.getIdAddress())){
            return ResponseEntity.ok(this.addressService.save(address));
        }
        else {
            return ResponseEntity.badRequest().build();
        }
//        return ResponseEntity.ok(this.addressService.save(address));
    }
    //5. Actualizar una direccion de una persona
    @PutMapping
    public ResponseEntity<AddressEntity> update(@RequestBody AddressEntity address) {
        if (address.getIdAddress() == null || !this.addressService.exists(address.getIdAddress())) {
            return ResponseEntity.ok(this.addressService.save(address));
        } else {
            return ResponseEntity.badRequest().build();
        }
    }




}
