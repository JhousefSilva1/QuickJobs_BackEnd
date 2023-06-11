package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "qj_Rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Rol_Id_Rol")
    private int id;

    @Column(name = "qj_Rol_Name_Rol")
    private String name;

    @Column(name = "qj_Rol_Description_Name_Rol")
    private String description;

    @Column(name = "qj_Rol_Status")
    private int status;

    @Column(name = "qj_Rol_Version")
    private int version;

    @Column(name = "qj_Rol_tx_User")
    private int txUser;

    @Column(name = "qj_Rol_tx_Host")
    private String txHost;

    @Column(name = "qj_Rol_tx_Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date txDate;

    // Constructor sin argumentos (obligatorio para JPA)
    public Rol() {
    }

    // Constructor con todos los campos
    public Rol(int id, String name, String description, int status, int version, int txUser, String txHost, Date txDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public int getTxUser() {
        return txUser;
    }

    public void setTxUser(int txUser) {
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
        return "Rol [id=" + id + ", name=" + name + ", description=" + description + ", status=" + status
                + ", version=" + version + ", txUser=" + txUser + ", txHost=" + txHost + ", txDate=" + txDate + "]";
    }
}
