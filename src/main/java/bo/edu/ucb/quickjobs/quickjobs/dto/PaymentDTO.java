package bo.edu.ucb.quickjobs.quickjobs.dto;

public class PaymentDTO {

    private int paymentId;
    private String paymentName;

    // Constructor sin argumentos
    public PaymentDTO() {
    }

    // Constructor con todos los campos
    public PaymentDTO(int paymentId, String paymentName) {
        this.paymentId = paymentId;
        this.paymentName = paymentName;
    }

    // Getter y Setter para paymentId
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    // Getter y Setter para paymentName
    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    // toString
    @Override
    public String toString() {
        return "PaymentDTO{" +
                "paymentId=" + paymentId +
                ", paymentName='" + paymentName + '\'' +
                '}';
    }
}
