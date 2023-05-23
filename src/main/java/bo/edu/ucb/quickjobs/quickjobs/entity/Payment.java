package bo.edu.ucb.quickjobs.quickjobs.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "qj_Payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Payment_Id_Payment")
    private Long id;

    @Column(name = "qj_Payment_Paymet")
    private String payment;

    @Column(name = "qj_Payment_Status")
    private int status;

    @Column(name = "qj_Payment_tx_user")
    private String user;

    @Column(name = "qj_Payment_tx_host")
    private String host;

    @Column(name = "qj_Payment_tx_date")
    private Date date;

    @Column(name = "qj_Payment_Version")
    private int version;

    public Payment() {
        // Constructor vacío
    }

    public Payment(String payment, int status, String user, String host, Date date, int version) {
        this.payment = payment;
        this.status = status;
        this.user = user;
        this.host = host;
        this.date = date;
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
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
        return "Payment{" +
                "id=" + id +
                ", payment='" + payment + '\'' +
                ", status=" + status +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                ", version=" + version +
                '}';
    }
}
