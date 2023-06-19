package bo.edu.ucb.quickjobs.quickjobs.Persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "qj_Payments")
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Payment_Id_Payment")
    private Long idPayment;

    @Column(name = "qj_Payment_Name_Payment", nullable = false)
    private String namePayment;

    @Column(name = "qj_Payment_Status", nullable = false)
    private boolean status;

    @Column(name = "qj_Payment_Version", nullable = false)
    private int version;

    @Column(name = "qj_Payment_tx_User", nullable = false)
    private String txUser;

    @Column(name = "qj_Payment_tx_Host", nullable = false)
    private String txHost;

    @Column(name = "qj_Payment_tx_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private String txDate;


}
