package bo.edu.ucb.quickjobs.quickjobs.service;

import bo.edu.ucb.quickjobs.quickjobs.dto.PaymentDTO;

public interface PaymentService {

    public PaymentDTO addPayment(PaymentDTO paymentDTO);

    public PaymentDTO getPaymentById(Long paymentId);

    public PaymentDTO updatePayment(Long paymentId, PaymentDTO paymentRequest);

    public void deletePayment(Long paymentId);
}
