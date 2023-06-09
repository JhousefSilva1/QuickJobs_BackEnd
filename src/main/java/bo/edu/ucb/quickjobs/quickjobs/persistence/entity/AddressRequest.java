package bo.edu.ucb.quickjobs.quickjobs.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "qj_Addredd_qj_Request")
public class AddressRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Address_qj_Request_Id_AddressRequest")
    private Integer id;

    @Column(name = "qj_Address_qj_Address_Id_Address")
    private Integer addressId;

    @Column(name = "qj_Request_qj_Request_Id_Request")
    private Integer requestId;

    @Column(name = "qj_Address_qj_Request_Status")
    private Integer status;

    @Column(name = "qj_Address_qj_Request_Version")
    private Integer version;

    @Column(name = "qj_Address_qj_Request_tx_User")
    private String user;

    @Column(name = "qj_Address_qj_Request_tx_Host")
    private String host;

    @Column(name = "qj_Address_qj_Request_tx_Date")
    private Date date;

    // Getters and setters, and any additional methods


    @ManyToOne
    @JoinColumn(name = "Request_Id_Request",insertable = false, updatable = false)
    private Request request;

    public AddressRequest() {
    }

    public AddressRequest(Integer id, Integer addressId, Integer requestId, Integer status, Integer version, String user, String host, Date date) {
        this.id = id;
        this.addressId = addressId;
        this.requestId = requestId;
        this.status = status;
        this.version = version;
        this.user = user;
        this.host = host;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "AddressRequest{" +
                "id=" + id +
                ", addressId=" + addressId +
                ", requestId=" + requestId +
                ", status=" + status +
                ", version=" + version +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                '}';
    }
}
