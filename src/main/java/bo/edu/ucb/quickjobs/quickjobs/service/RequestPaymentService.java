package bo.edu.ucb.quickjobs.quickjobs.service;

import bo.edu.ucb.quickjobs.quickjobs.dto.RequestPaymentDTO;

public interface RequestPaymentService {

    public RequestPaymentDTO addRequestPayment(RequestPaymentDTO requestPaymentDTO);

    public RequestPaymentDTO getRequestPaymentById(Long requestPaymentId);

    public RequestPaymentDTO updateRequestPayment(Long requestPaymentId, RequestPaymentDTO requestPaymentRequest);

    public void deleteRequestPayment(Long requestPaymentId);


}
