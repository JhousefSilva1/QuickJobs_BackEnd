package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "qj_Group")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Group_Id_Group")
    private Long id;

    @Column(name = "qj_Group_Name_Group")
    private String name;

    @Column(name = "qj_Group_Description_Name_Group")
    private String description;

    @Column(name = "qj_Group_Status")
    private int status;

    @Column(name = "qj_Group_Version")
    private int version;

    @Column(name = "qj_Group_tx_User")
    private String txUser;

    @Column(name = "qj_Group_tx_Host")
    private String txHost;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "qj_Group_tx_Date")
    private Date txDate;

    // Constructor sin argumentos (obligatorio para JPA)
    public Group() {
    }

    // Constructor con todos los campos
    public Group(Long id, String name, String description, int status, int version, String txUser, String txHost, Date txDate) {
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
        return "Group [id=" + id + ", name=" + name + ", description=" + description +
                ", status=" + status + ", version=" + version + ", txUser=" + txUser +
                ", txHost=" + txHost + ", txDate=" + txDate + "]";
    }
}
