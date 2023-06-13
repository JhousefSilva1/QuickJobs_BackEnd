package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;


import java.util.Date;

@Entity
@Table(name = "qj_Request_qj_Payment")
public class RequestPayment {
    @Id
    @Column(name = "qj_Request_qj_Payment_Id_RequestPayment")
    private int idRequestPayment;

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
    private Date txDate;

    public RequestPayment() {
    }

    public RequestPayment(int idRequestPayment, int idPayment, int idRequest, boolean status, int version, String txUser, String txHost, Date txDate) {
        this.idRequestPayment = idRequestPayment;
        this.idPayment = idPayment;
        this.idRequest = idRequest;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    public int getIdRequestPayment() {
        return idRequestPayment;
    }

    public void setIdRequestPayment(int idRequestPayment) {
        this.idRequestPayment = idRequestPayment;
    }

    public int getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }

    public int getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
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
        return "RequestPayment{" +
                "idRequestPayment=" + idRequestPayment +
                ", idPayment=" + idPayment +
                ", idRequest=" + idRequest +
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
