package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "qj_Country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Country_Id_Country")
    private Long id;

    @Column(name = "qj_Country_Name_Country")
    private String name;

    @Column(name = "qj_Country_Status")
    private int status;

    @Column(name = "qj_Country_Version")
    private int version;

    @Column(name = "qj_Country_tx_User")
    private String txUser;

    @Column(name = "qj_Country_tx_Host")
    private String txHost;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "qj_Country_tx_Date")
    private Date txDate;

    // Constructor sin argumentos (obligatorio para JPA)
    public Country() {
    }

    // Constructor con todos los campos
    public Country(Long id, String name, int status, int version, String txUser, String txHost, Date txDate) {
        this.id = id;
        this.name = name;
        this.status = status;
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

    // toString
    @Override
    public String toString() {
        return "Country [id=" + id + ", name=" + name + ", status=" + status + ", version=" + version +
                ", txUser=" + txUser + ", txHost=" + txHost + ", txDate=" + txDate + "]";
    }
}
