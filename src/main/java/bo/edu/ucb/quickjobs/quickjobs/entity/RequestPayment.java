package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Date;

@Entity
@Table(name = "qj_Request_Payment")
public class RequestPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Request_Payment")
    private Integer id;

    @Column(name = "qj_Request_Payment_Status")
    private int status;

    @Column(name = "qj_Request_Payment_tx_user")
    private String user;

    @Column(name = "qj_Request_Payment_tx_host")
    private String host;

    @Column(name = "qj_Request_Payment_tx_date")
    private Date transactionDate;

    @Column(name = "qj_Payment_Id_Payment")
    private Integer paymentId;

    @Column(name = "qj_Request_Id_Request")
    private Integer requestId;

    // Constructor vacío (requerido por JPA)
    public RequestPayment() {
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
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
}
