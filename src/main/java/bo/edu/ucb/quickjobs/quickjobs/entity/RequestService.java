package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "qj_Request_qj_Service")
public class RequestService {

    @Id
    @Column(name = "qj_Request_qj_Service_Id_RequestService")
    private int id;

    @ManyToOne
    @JoinColumn(name = "qj_Request_qj_Request_Id_Request")
    private Request request;

    @ManyToOne
    @JoinColumn(name = "qj_Service_qj_Servide_Id_Service")
    private Service service;

    @Column(name = "qj_Request_qj_Service_Status")
    private int status;

    @Column(name = "qj_Request_qj_Service_Version")
    private int version;

    @Column(name = "qj_Request_qj_Service_tx_User")
    private String txUser;

    @Column(name = "qj_Request_qj_Service_tx_Host")
    private String txHost;

    @Column(name = "qj_Request_qj_Service_tx_Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date txDate;

    // Constructor sin argumentos (obligatorio para JPA)
    public RequestService() {
    }

    // Constructor con todos los campos
    public RequestService(int id, Request request, Service service, int status, int version, String txUser,
                          String txHost, Date txDate) {
        this.id = id;
        this.request = request;
        this.service = service;
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

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
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
        return "RequestService [id=" + id + ", request=" + request + ", service=" + service + ", status=" + status
                + ", version=" + version + ", txUser=" + txUser + ", txHost=" + txHost + ", txDate=" + txDate + "]";
    }
}
