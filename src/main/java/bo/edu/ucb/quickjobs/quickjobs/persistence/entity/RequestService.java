package bo.edu.ucb.quickjobs.quickjobs.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "qj_Request_qj_Service")
public class RequestService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Request_qj_Service_Id_RequestService")
    private Integer requestServiceId;

    @Column(name = "qj_Request_qj_Request_Id_Request")
    private Integer requestId;

    @Column(name = "qj_Service_qj_Servide_Id_Service")
    private Integer serviceId;

    @Column(name = "qj_Request_qj_Service_Status")
    private Integer status;

    @Column(name = "qj_Request_qj_Service_Version")
    private Integer version;

    @Column(name = "qj_Request_qj_Service_tx_User")
    private String user;

    @Column(name = "qj_Request_qj_Service_tx_Host")
    private String host;

    @Column(name = "qj_Request_qj_Service_tx_Date")
    private java.util.Date date;

    public RequestService() {
    }

    public RequestService(Integer requestId, Integer serviceId, Integer status, Integer version, String user, String host, java.util.Date date) {
        this.requestId = requestId;
        this.serviceId = serviceId;
        this.status = status;
        this.version = version;
        this.user = user;
        this.host = host;
        this.date = date;
    }

    public Integer getRequestServiceId() {
        return requestServiceId;
    }

    public void setRequestServiceId(Integer requestServiceId) {
        this.requestServiceId = requestServiceId;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
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
        return "RequestService{" +
                "requestServiceId=" + requestServiceId +
                ", requestId=" + requestId +
                ", serviceId=" + serviceId +
                ", status=" + status +
                ", version=" + version +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                '}';
    }
}
