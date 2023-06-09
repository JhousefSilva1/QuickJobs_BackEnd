package bo.edu.ucb.quickjobs.quickjobs.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "qj_Payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Payment_Id_Payment")
    private Integer paymentId;

    @Column(name = "qj_Payment_Name_Payment")
    private String paymentName;

    public Payment() {
    }

    public Payment(String paymentName) {
        this.paymentName = paymentName;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", paymentName='" + paymentName + '\'' +
                '}';
    }
}
