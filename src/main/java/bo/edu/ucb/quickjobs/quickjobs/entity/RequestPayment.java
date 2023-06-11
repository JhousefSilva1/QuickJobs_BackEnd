package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "qj_Request_qj_Payment")
public class RequestPayment {

    @Id
    @Column(name = "qj_Request_qj_Payment_Id_RequestPayment")
    private int id;

    @ManyToOne
    @JoinColumn(name = "qj_Payments_qj_Payment_Id_Payment")
    private Payment payment;

    @ManyToOne
    @JoinColumn(name = "qj_Request_qj_Request_Id_Request")
    private Request request;

    @Column(name = "qj_Request_qj_Payment_Status")
    private int status;

    @Column(name = "qj_Request_qj_Payment_Version")
    private int version;

    @Column(name = "qj_Request_qj_Payment_tx_User")
    private String txUser;

    @Column(name = "qj_Request_qj_Payment_tx_Host")
    private String txHost;

    @Column(name = "qj_Request_qj_payment_tx_Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date txDate;

    // Constructor sin argumentos (obligatorio para JPA)
    public RequestPayment() {
    }

    // Constructor con todos los campos
    public RequestPayment(int id, Payment payment, Request request, int status, int version, String txUser,
                          String txHost, Date txDate) {
        this.id = id;
        this.payment = payment;
        this.request = request;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
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

    // toString
    @Override
    public String toString() {
        return "RequestPayment [id=" + id + ", payment=" + payment + ", request=" + request + ", status=" + status
                + ", version=" + version + ", txUser=" + txUser + ", txHost=" + txHost + ", txDate=" + txDate + "]";
    }
}
