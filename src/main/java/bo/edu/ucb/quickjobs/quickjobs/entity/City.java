package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

import java.security.Timestamp;

@Entity
@Table(name = "qj_City")
public class City {
    @Id
    @Column(name = "id_City")
    private Integer id;

    @Column(name = "City")
    private String cityName;

    @Column(name = "qj_City_Status")
    private int status;

    @Column(name = "qj_City_tx_user")
    private String user;

    @Column(name = "qj_City_tx_host")
    private String host;

    @Column(name = "qj_City_tx_date")
    private Timestamp date;

    // Constructor vacío (requerido por JPA)
    public City() {
    }

    //Constructor con parámetros
    public City(Integer id, String cityName, int status, String user, String host, Timestamp date) {
        this.id = id;
        this.cityName = cityName;
        this.status = status;
        this.user = user;
        this.host = host;
        this.date = date;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
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

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
