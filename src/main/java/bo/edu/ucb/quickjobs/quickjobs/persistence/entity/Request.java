package bo.edu.ucb.quickjobs.quickjobs.persistence.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.sql.Time;
import java.util.List;

@Entity
@Table(name = "qj_Request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Request_Id_Request")
    private Integer requestId;

    @Column(name = "qj_Person_qj_Person_Id_Person")
    private Integer personId;

    @Column(name = "qj_Request_Begin_Date")
    private Date beginDate;

    @Column(name = "qj_Request_End_Date")
    private Date endDate;

    @Column(name = "qj_Request_Begin_Hour")
    private Time beginHour;

    @Column(name = "qj_Request_End_Hour")
    private Time endHour;

    @Column(name = "qj_Request_Totally_Hours")
    private Integer totallyHours;

    @Column(name = "qj_Request_Price_Hour")
    private Integer priceHour;

    @Column(name = "qj_Status_Request")
    private String statusRequest;

    @Column(name = "qj_Request_Status")
    private Integer requestStatus;

    @Column(name = "qj_Request_Version")
    private Integer version;

    @Column(name = "qj_Request_tx_User")
    private String user;

    @Column(name = "qj_Request_tx_Host")
    private String host;

    @Column(name = "qj_Request_tx_Date")
    private Integer date;

    //this section is for the DataBase relationship

    @ManyToOne
    @JoinColumn(name = "qj_Person_Id_Person", insertable = false, updatable = false)
    private Person person;

    @OneToMany(mappedBy = "request")
    private List<RequestService> requestService;

    @OneToMany(mappedBy = "request")
    private List<RequestPayment> requestPayment;

    public Request() {
    }

    public Request(Integer personId, Date beginDate, Date endDate, Time beginHour, Time endHour, Integer totallyHours, Integer priceHour, String statusRequest, Integer requestStatus, Integer version, String user, String host, Integer date) {
        this.personId = personId;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.beginHour = beginHour;
        this.endHour = endHour;
        this.totallyHours = totallyHours;
        this.priceHour = priceHour;
        this.statusRequest = statusRequest;
        this.requestStatus = requestStatus;
        this.version = version;
        this.user = user;
        this.host = host;
        this.date = date;
    }

    public Integer getRequestId() {
        return requestId;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
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

    public Time getBeginHour() {
        return beginHour;
    }

    public void setBeginHour(Time beginHour) {
        this.beginHour = beginHour;
    }

    public Time getEndHour() {
        return endHour;
    }

    public void setEndHour(Time endHour) {
        this.endHour = endHour;
    }

    public Integer getTotallyHours() {
        return totallyHours;
    }

    public void setTotallyHours(Integer totallyHours) {
        this.totallyHours = totallyHours;
    }

    public Integer getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(Integer priceHour) {
        this.priceHour = priceHour;
    }

    public String getStatusRequest() {
        return statusRequest;
    }

    public void setStatusRequest(String statusRequest) {
        this.statusRequest = statusRequest;
    }

    public Integer getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(Integer requestStatus) {
        this.requestStatus = requestStatus;
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

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestId=" + requestId +
                ", personId=" + personId +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", beginHour=" + beginHour +
                ", endHour=" + endHour +
                ", totallyHours=" + totallyHours +
                ", priceHour=" + priceHour +
                ", statusRequest='" + statusRequest + '\'' +
                ", requestStatus=" + requestStatus +
                ", version=" + version +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                '}';
    }
}
