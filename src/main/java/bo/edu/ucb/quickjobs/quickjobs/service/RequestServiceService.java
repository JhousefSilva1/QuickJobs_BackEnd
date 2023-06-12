package bo.edu.ucb.quickjobs.quickjobs.service;

import bo.edu.ucb.quickjobs.quickjobs.dto.RequestServiceDTO;

public interface RequestServiceService {

    public RequestServiceDTO addRequestService(RequestServiceDTO requestServiceDTO);

    public RequestServiceDTO getRequestServiceById(Long requestServiceId);

    public RequestServiceDTO updateRequestService(Long requestServiceId, RequestServiceDTO requestServiceRequest);

    public void deleteRequestService(Long requestServiceId);

}
