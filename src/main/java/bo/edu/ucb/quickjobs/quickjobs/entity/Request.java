package bo.edu.ucb.quickjobs.quickjobs.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "qj_Request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Request_Id_Request")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "qj_Contract_qj_Contract_Id_Contract")
    private Contract contract;

    @Column(name = "qj_Request_Begin_Date")
    private Date beginDate;

    @Column(name = "qj_Request_End_Date")
    private Date endDate;

    @Column(name = "qj_Request_Begin_Hour")
    private Date beginHour;

    @Column(name = "qj_Request_End_Hour")
    private Date endHour;

    @Column(name = "qj_Request_Hours")
    private int hours;

    @Column(name = "qj_Request_Price_Hour")
    private BigDecimal pricePerHour;

    @Column(name = "qj_Request_Total_Price")
    private BigDecimal totalPrice;

    @Column(name = "qj_Request_Status_Order")
    private String statusOrder;

    @Column(name = "qj_Request_Status")
    private int status;

    @Column(name = "qj_Request_tx_user")
    private String user;

    @Column(name = "qj_Request_tx_host")
    private String host;

    @Column(name = "qj_Request_tx_date")
    private Date date;

    @Column(name = "qj_Request_Version")
    private int version;

    public Request() {
        // Constructor vacío
    }

    // Agrega el constructor con todos los parámetros según tus necesidades

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
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

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public BigDecimal getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(BigDecimal pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(String statusOrder) {
        this.statusOrder = statusOrder;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", contract=" + contract +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", beginHour=" + beginHour +
                ", endHour=" + endHour +
                ", hours=" + hours +
                ", pricePerHour=" + pricePerHour +
                ", totalPrice=" + totalPrice +
                ", statusOrder='" + statusOrder + '\'' +
                ", status=" + status +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                ", version=" + version +
                '}';
    }
}
