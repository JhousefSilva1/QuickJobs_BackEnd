package bo.edu.ucb.quickjobs.quickjobs.entity;

import java.sql.Timestamp;
import java.util.Date;

public class Request {
    private int idRequest;
    private int personId1;
    private int personId2;
    private int serviceId;
    private int addressId;
    private Timestamp beginDate;
    private Timestamp endDate;
    private int orderStatus;
    private boolean status;
    private int version;
    private String txUser;
    private String txHost;
    private Date txDate;

    public Request() {
    }

    // Constructor
    public Request(int idRequest, int personId1, int personId2, int serviceId, int addressId, Timestamp beginDate,
                   Timestamp endDate, int orderStatus, boolean status, int version, String txUser, String txHost,
                   Date txDate) {
        this.idRequest = idRequest;
        this.personId1 = personId1;
        this.personId2 = personId2;
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

    // Getters and Setters
    public int getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
    }

    public int getPersonId1() {
        return personId1;
    }

    public void setPersonId1(int personId1) {
        this.personId1 = personId1;
    }

    public int getPersonId2() {
        return personId2;
    }

    public void setPersonId2(int personId2) {
        this.personId2 = personId2;
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

    public Timestamp getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Timestamp beginDate) {
        this.beginDate = beginDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
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
                ", personId1=" + personId1 +
                ", personId2=" + personId2 +
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
}
