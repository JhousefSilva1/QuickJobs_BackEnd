package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "qj_City")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_City_Id_City")
    private Long id;

    @Column(name = "qj_City_Name_City")
    private String name;

    @Column(name = "qj_City_Status")
    private int status;

    @Column(name = "qj_City_Version")
    private int version;

    @Column(name = "qj_City_tx_User")
    private String txUser;

    @Column(name = "qj_City_tx_Host")
    private String txHost;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "qj_City_tx_Date")
    private Date txDate;

    @ManyToOne
    @JoinColumn(name = "qj_Country_qj_Country_Id_Country")
    private Country country;

    // Constructor sin argumentos (obligatorio para JPA)
    public City() {
    }

    // Constructor con todos los campos
    public City(Long id, String name, int status, int version, String txUser, String txHost, Date txDate, Country country) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
        this.country = country;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    // toString
    @Override
    public String toString() {
        return "City [id=" + id + ", name=" + name + ", status=" + status + ", version=" + version +
                ", txUser=" + txUser + ", txHost=" + txHost + ", txDate=" + txDate + ", country=" + country + "]";
    }
}
