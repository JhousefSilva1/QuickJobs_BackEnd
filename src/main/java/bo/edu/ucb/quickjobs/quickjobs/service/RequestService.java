package bo.edu.ucb.quickjobs.quickjobs.service;

import bo.edu.ucb.quickjobs.quickjobs.dto.RequestDTO;

public interface RequestService {

    public RequestDTO addRequest(RequestDTO requestDTO);

    public RequestDTO getRequestById(Long requestId);

    public RequestDTO updateRequest(Long requestId, RequestDTO requestRequest);

    public void deleteRequest(Long requestId);
}
