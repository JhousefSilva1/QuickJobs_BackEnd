package bo.edu.ucb.quickjobs.quickjobs.dto;

import java.sql.Timestamp;

public class RequestServiceDTO {

    private int requestServiceId;
    private int requestId;
    private int serviceId;
    private int status;
    private int version;
    private String txUser;
    private String txHost;
    private Timestamp txDate;

    // Constructor sin argumentos
    public RequestServiceDTO() {
    }

    // Constructor con todos los campos
    public RequestServiceDTO(int requestServiceId, int requestId, int serviceId, int status,
                             int version, String txUser, String txHost, Timestamp txDate) {
        this.requestServiceId = requestServiceId;
        this.requestId = requestId;
        this.serviceId = serviceId;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    // Getter y Setter para requestServiceId
    public int getRequestServiceId() {
        return requestServiceId;
    }

    public void setRequestServiceId(int requestServiceId) {
        this.requestServiceId = requestServiceId;
    }

    // Getter y Setter para requestId
    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    // Getter y Setter para serviceId
    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
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
        return "RequestServiceDTO{" +
                "requestServiceId=" + requestServiceId +
                ", requestId=" + requestId +
                ", serviceId=" + serviceId +
                ", status=" + status +
                ", version=" + version +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate=" + txDate +
                '}';
    }
}
