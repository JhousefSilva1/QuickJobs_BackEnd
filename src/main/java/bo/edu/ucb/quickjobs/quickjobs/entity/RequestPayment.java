package bo.edu.ucb.quickjobs.quickjobs.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "qj_Request_Payment")
public class RequestPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Request_Payment_Id_Request_Payment")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "qj_Payment_qj_Payment_Id_Payment")
    private Payment payment;

    @ManyToOne
    @JoinColumn(name = "qj_Request_qj_Request_Id_Request")
    private Request request;

    @Column(name = "qj_Request_Payment_Status")
    private int status;

    @Column(name = "qj_Request_Payment_tx_user")
    private String user;

    @Column(name = "qj_Request_Payment_tx_host")
    private String host;

    @Column(name = "qj_Request_Payment_tx_date")
    private Date date;

    @Column(name = "qj_Request_Payment_Version")
    private int version;

    public RequestPayment() {
        // Constructor vacío
    }

    // Agrega el constructor con todos los parámetros según tus necesidades

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
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
        return "RequestPayment{" +
                "id=" + id +
                ", payment=" + payment +
                ", request=" + request +
                ", status=" + status +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                ", version=" + version +
                '}';
    }
}
