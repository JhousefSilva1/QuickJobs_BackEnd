package bo.edu.ucb.quickjobs.quickjobs.Persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Table(name = "qj_Request_qj_Payment")
public class RequestPaymentEntity {
    @Id
    @Column(name = "qj_Request_qj_Payment_Id_RequestPayment")
    private Long  idRequestPayment;

    @Column(name = "qj_Payments_qj_Payment_Id_Payment", nullable = false)
    private int idPayment;

    @Column(name = "qj_Request_qj_Request_Id_Request", nullable = false)
    private int idRequest;

    @Column(name = "qj_Request_qj_Payment_Status", nullable = false)
    private boolean status;

    @Column(name = "qj_Request_qj_Payment_Version", nullable = false)
    private int version;

    @Column(name = "qj_Request_qj_Payment_tx_User", nullable = false)
    private String txUser;

    @Column(name = "qj_Request_qj_Payment_tx_Host", nullable = false)
    private String txHost;

    @Column(name = "qj_Request_qj_payment_tx_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private String txDate;

    @ManyToOne
    @JoinColumn(name = "qj_Payments_qj_Payment_Id_Payment",insertable = false, updatable = false)
    private PersonEntity payment;

    @ManyToOne
    @JoinColumn(name = "qj_Request_qj_Request_Id_Request",insertable = false, updatable = false)
    private RequestEntity request;

}
