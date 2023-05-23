package bo.edu.ucb.quickjobs.quickjobs.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "qj_Country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Country_id_Country")
    private Long id;

    @Column(name = "qj_Country_Country")
    private String country;

    @Column(name = "Country_Area_Code")
    private String areaCode;

    @Column(name = "qj_Country_Status")
    private int status;

    @Column(name = "qj_Country_tx_user")
    private String user;

    @Column(name = "qj_Country_tx_host")
    private String host;

    @Column(name = "qj_Country_tx_date")
    private Date date;

    @Column(name = "qj_Country_Version")
    private int version;

    public Country() {
        // Constructor vacío
    }

    public Country(String country, String areaCode, int status, String user, String host, Date date, int version) {
        this.country = country;
        this.areaCode = areaCode;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
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
        return "Country{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", status=" + status +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                ", version=" + version +
                '}';
    }
}
