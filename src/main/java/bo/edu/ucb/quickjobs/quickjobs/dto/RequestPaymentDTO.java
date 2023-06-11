package bo.edu.ucb.quickjobs.quickjobs.dto;

import java.sql.Timestamp;

public class RequestPaymentDTO {

    private int requestPaymentId;
    private int paymentId;
    private int requestId;
    private int status;
    private int version;
    private String txUser;
    private String txHost;
    private Timestamp txDate;

    // Constructor sin argumentos
    public RequestPaymentDTO() {
    }

    // Constructor con todos los campos
    public RequestPaymentDTO(int requestPaymentId, int paymentId, int requestId, int status,
                             int version, String txUser, String txHost, Timestamp txDate) {
        this.requestPaymentId = requestPaymentId;
        this.paymentId = paymentId;
        this.requestId = requestId;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    // Getter y Setter para requestPaymentId
    public int getRequestPaymentId() {
        return requestPaymentId;
    }

    public void setRequestPaymentId(int requestPaymentId) {
        this.requestPaymentId = requestPaymentId;
    }

    // Getter y Setter para paymentId
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    // Getter y Setter para requestId
    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    // Getter y Setter para status
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    // Getter y Setter para version
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    // Getter y Setter para txUser
    public String getTxUser() {
        return txUser;
    }

    public void setTxUser(String txUser) {
        this.txUser = txUser;
    }

    // Getter y Setter para txHost
    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    // Getter y Setter para txDate
    public Timestamp getTxDate() {
        return txDate;
    }

    public void setTxDate(Timestamp txDate) {
        this.txDate = txDate;
    }

    // toString
    @Override
    public String toString() {
        return "RequestPaymentDTO{" +
                "requestPaymentId=" + requestPaymentId +
                ", paymentId=" + paymentId +
                ", requestId=" + requestId +
                ", status=" + status +
                ", version=" + version +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate=" + txDate +
                '}';
    }
}
