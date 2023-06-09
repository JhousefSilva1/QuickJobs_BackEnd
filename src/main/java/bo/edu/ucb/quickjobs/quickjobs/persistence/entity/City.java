package bo.edu.ucb.quickjobs.quickjobs.persistence.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "qj_City")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_City_Id_City")
    private Integer id;

    @Column(name = "qj_City_Name_City")
    private String name;

    @Column(name = "qj_City_Status")
    private Integer status;

    @Column(name = "qj_City_Version")
    private Integer version;

    @Column(name = "qj_City_tx_User")
    private String user;

    @Column(name = "qj_City_tx_Host")
    private String host;

    @Column(name = "qj_City_tx_Date")
    private Date date;

    @Column(name = "qj_Country_qj_Country_Id_Country")
    private Integer countryId;

    public City() {
    }

    public City(String name, Integer status, Integer version, String user, String host, Date date, Integer countryId) {
        this.name = name;
        this.status = status;
        this.version = version;
        this.user = user;
        this.host = host;
        this.date = date;
        this.countryId = countryId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", version=" + version +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                ", countryId=" + countryId +
                '}';
    }
}
