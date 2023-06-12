package bo.edu.ucb.quickjobs.quickjobs.service;

import bo.edu.ucb.quickjobs.quickjobs.dto.ServiceDTO;

public interface ServiceService {

    public ServiceDTO addService(ServiceDTO serviceDTO);

    public ServiceDTO getServiceById(Long serviceId);

    public ServiceDTO updateService(Long serviceId, ServiceDTO serviceRequest);

    public void deleteService(Long serviceId);


}
