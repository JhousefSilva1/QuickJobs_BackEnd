package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "qj_Request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Request_Id_Request")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "qj_Person_qj_Person_Id_Person")
    private Person person;

    @Column(name = "qj_Request_Begin_Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date beginDate;

    @Column(name = "qj_Request_End_Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    @Column(name = "qj_Request_Begin_Hour")
    @Temporal(TemporalType.TIME)
    private Date beginHour;

    @Column(name = "qj_Request_End_Hour")
    @Temporal(TemporalType.TIME)
    private Date endHour;

    @Column(name = "qj_Request_Totally_Hours")
    private int totallyHours;

    @Column(name = "qj_Request_Price_Hour")
    private int priceHour;

    @Column(name = "qj_Status_Request")
    private String statusRequest;

    @Column(name = "qj_Request_Status")
    private int requestStatus;

    @Column(name = "qj_Request_Version")
    private int version;

    @Column(name = "qj_Request_tx_User")
    private String txUser;

    @Column(name = "qj_Request_tx_Host")
    private String txHost;

    @Column(name = "qj_Request_tx_Date")
    private int txDate;

    // Constructor sin argumentos (obligatorio para JPA)
    public Request() {
    }

    // Constructor con todos los campos
    public Request(Long id, Person person, Date beginDate, Date endDate, Date beginHour, Date endHour,
                   int totallyHours, int priceHour, String statusRequest, int requestStatus, int version,
                   String txUser, String txHost, int txDate) {
        this.id = id;
        this.person = person;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.beginHour = beginHour;
        this.endHour = endHour;
        this.totallyHours = totallyHours;
        this.priceHour = priceHour;
        this.statusRequest = statusRequest;
        this.requestStatus = requestStatus;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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

    public Date getBeginHour() {
        return beginHour;
    }

    public void setBeginHour(Date beginHour) {
        this.beginHour = beginHour;
    }

    public Date getEndHour() {
        return endHour;
    }

    public void setEndHour(Date endHour) {
        this.endHour = endHour;
    }

    public int getTotallyHours() {
        return totallyHours;
    }

    public void setTotallyHours(int totallyHours) {
        this.totallyHours = totallyHours;
    }

    public int getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(int priceHour) {
        this.priceHour = priceHour;
    }

    public String getStatusRequest() {
        return statusRequest;
    }

    public void setStatusRequest(String statusRequest) {
        this.statusRequest = statusRequest;
    }

    public int getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(int requestStatus) {
        this.requestStatus = requestStatus;
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

    public int getTxDate() {
        return txDate;
    }

    public void setTxDate(int txDate) {
        this.txDate = txDate;
    }

    // toString
    @Override
    public String toString() {
        return "Request [id=" + id + ", person=" + person + ", beginDate=" + beginDate + ", endDate=" + endDate
                + ", beginHour=" + beginHour + ", endHour=" + endHour + ", totallyHours=" + totallyHours
                + ", priceHour=" + priceHour + ", statusRequest=" + statusRequest + ", requestStatus=" + requestStatus
                + ", version=" + version + ", txUser=" + txUser + ", txHost=" + txHost + ", txDate=" + txDate + "]";
    }
}
