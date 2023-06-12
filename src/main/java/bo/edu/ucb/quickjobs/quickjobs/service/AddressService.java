package bo.edu.ucb.quickjobs.quickjobs.service;
import bo.edu.ucb.quickjobs.quickjobs.dto.AddressDTO;
import java.util.List;


public interface AddressService {

    public AddressDTO addAddress(long personId, AddressDTO addressDTO);

    public List<AddressDTO> getAddressesByPersonId(long personId);

    public AddressDTO getAddressById(Long personId, Long addressId);

    public AddressDTO updateAddress(Long personId, Long addressId, AddressDTO addressRequest);

    public void deleteAddress(Long personId, Long addressId);
}
