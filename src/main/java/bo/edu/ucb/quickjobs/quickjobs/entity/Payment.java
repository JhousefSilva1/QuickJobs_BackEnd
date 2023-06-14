package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;


import java.util.Date;

@Entity
@Table(name = "qj_Payments")
public class Payment {
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
    private Date txDate;

    public Payment() {
    }

    public Payment(Long  idPayment, String namePayment, boolean status, int version, String txUser, String txHost, Date txDate) {
        this.idPayment = idPayment;
        this.namePayment = namePayment;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    public Long  getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(Long  idPayment) {
        this.idPayment = idPayment;
    }

    public String getNamePayment() {
        return namePayment;
    }

    public void setNamePayment(String namePayment) {
        this.namePayment = namePayment;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getTxUser() {
        return txUser;
    }

    public void setTxUser(String txUser) {
        this.txUser = txUser;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "idPayment=" + idPayment +
                ", namePayment='" + namePayment + '\'' +
                ", status=" + status +
                ", version=" + version +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate=" + txDate +
                '}';
    }

    // Constructor, getters, and setters...

    // Additional methods...
}
