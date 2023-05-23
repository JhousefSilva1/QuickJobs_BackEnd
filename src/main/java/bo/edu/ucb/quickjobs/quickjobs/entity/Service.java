package bo.edu.ucb.quickjobs.quickjobs.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "qj_Service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Service_Id_Service",nullable = false, unique = true)
    private Long id;

    @Column(name = "qj_Service_Service")
    private String service;

    @Column(name = "qj_Service_Price_Hour")
    private double pricePerHour;

    @Column(name = "qj_Service_ImageIcon")
    private String imageIcon;

    @Column(name = "qj_Service_Status")
    private int status;

    @Column(name = "qj_Service_tx_user")
    private String user;

    @Column(name = "qj_Service_tx_host")
    private String host;

    @Column(name = "qj_Service_tx_date")
    private Date date;

    @Column(name = "qj_Service_Version")
    private int version;

    public Service() {
        // Constructor vacío
    }

    // Agrega el constructor con todos los parámetros según tus necesidades

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public String getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(String imageIcon) {
        this.imageIcon = imageIcon;
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
        return "Service{" +
                "id=" + id +
                ", service='" + service + '\'' +
                ", pricePerHour=" + pricePerHour +
                ", imageIcon='" + imageIcon + '\'' +
                ", status=" + status +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                ", version=" + version +
                '}';
    }
}
