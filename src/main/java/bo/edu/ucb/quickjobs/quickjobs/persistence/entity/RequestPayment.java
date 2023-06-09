package bo.edu.ucb.quickjobs.quickjobs.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "qj_Request_qj_Payment")
public class RequestPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Request_qj_Payment_Id_RequestPayment")
    private Integer requestPaymentId;

    @Column(name = "qj_Payments_qj_Payment_Id_Payment")
    private Integer paymentId;

    @Column(name = "qj_Request_qj_Request_Id_Request")
    private Integer requestId;

    @Column(name = "qj_Request_qj_Payment_Status")
    private Integer status;

    @Column(name = "qj_Request_qj_Payment_Version")
    private Integer version;

    @Column(name = "qj_Request_qj_Payment_tx_User")
    private String user;

    @Column(name = "qj_Request_qj_Payment_tx_Host")
    private String host;

    @Column(name = "qj_Request_qj_payment_tx_Date")
    private java.util.Date date;

    @ManyToOne
    @JoinColumn(name = "Request_Id_Request",insertable = false, updatable = false)
    private Request request;
    public RequestPayment() {
    }

    public RequestPayment(Integer paymentId, Integer requestId, Integer status, Integer version, String user, String host, java.util.Date date) {
        this.paymentId = paymentId;
        this.requestId = requestId;
        this.status = status;
        this.version = version;
        this.user = user;
        this.host = host;
        this.date = date;
    }

    public Integer getRequestPaymentId() {
        return requestPaymentId;
    }

    public void setRequestPaymentId(Integer requestPaymentId) {
        this.requestPaymentId = requestPaymentId;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "RequestPayment{" +
                "requestPaymentId=" + requestPaymentId +
                ", paymentId=" + paymentId +
                ", requestId=" + requestId +
                ", status=" + status +
                ", version=" + version +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                '}';
    }
}
