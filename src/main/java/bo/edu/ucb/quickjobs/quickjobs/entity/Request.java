package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;


import java.util.Date;

@Entity
@Table(name = "qj_Request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Request_Id_Request")
    private Long  idRequest;

    @Column(name = "qj_Person_qj_Person_Id_Person", nullable = false)
    private int personId;

    @Column(name = "qj_Person_2_qj_Person_Id_Person", nullable = false)
    private int person2Id;

    @Column(name = "qj_Service_qj_Servide_Id_Service", nullable = false)
    private int serviceId;

    @Column(name = "qj_Address_qj_Address_Id_Address", nullable = false)
    private int addressId;

    @Column(name = "qj_Request_Begin_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date beginDate;

    @Column(name = "qj_Request_End_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    @Column(name = "qj_Request_Order_Status", nullable = false)
    private int orderStatus;

    @Column(name = "qj_Request_Status", nullable = false)
    private boolean status;

    @Column(name = "qj_Request_Version", nullable = false)
    private int version;

    @Column(name = "qj_Request_tx_User", nullable = false)
    private String txUser;

    @Column(name = "qj_Request_tx_Host", nullable = false)
    private String txHost;

    @Column(name = "qj_Request_tx_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date txDate;

    @ManyToOne
    @JoinColumn(name = "qj_Service_qj_Servide_Id_Service", referencedColumnName = "qj_Servide_Id_Service", insertable = false, updatable = false)
    private Servicee servicee;
    @ManyToOne
    @JoinColumn(name = "qj_Address_qj_Address_Id_Address", referencedColumnName = "qj_Address_Id_Address", insertable = false, updatable = false)
    private Address address;
    public Request() {
    }

    public Request(Long  idRequest, int personId, int person2Id, int serviceId, int addressId, Date beginDate, Date endDate, int orderStatus, boolean status, int version, String txUser, String txHost, Date txDate) {
        this.idRequest = idRequest;
        this.personId = personId;
        this.person2Id = person2Id;
        this.serviceId = serviceId;
        this.addressId = addressId;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.orderStatus = orderStatus;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    public Long  getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(Long  idRequest) {
        this.idRequest = idRequest;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getPerson2Id() {
        return person2Id;
    }

    public void setPerson2Id(int person2Id) {
        this.person2Id = person2Id;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
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
        return "Request{" +
                "idRequest=" + idRequest +
                ", personId=" + personId +
                ", person2Id=" + person2Id +
                ", serviceId=" + serviceId +
                ", addressId=" + addressId +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", orderStatus=" + orderStatus +
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
