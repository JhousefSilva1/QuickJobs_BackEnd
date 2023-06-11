package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "qj_Service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Servide_Id_Service")
    private int id;

    @Column(name = "qj_Service_Name_Service")
    private String name;

    @Column(name = "qj_Service_Description_Name_Service")
    private String description;

    @Column(name = "qj_Service_PriceHourBase")
    private int priceHourBase;

    @Column(name = "qj_Service_ImagenIcon")
    private String imagenIcon;

    @Column(name = "qj_Service_Status")
    private int status;

    @Column(name = "qj_Service_Version")
    private int version;

    @Column(name = "qj_Service_tx_User")
    private String txUser;

    @Column(name = "qj_Service_tx_Host")
    private int txHost;

    @Column(name = "qj_Service_tx_Date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date txDate;

    // Constructor sin argumentos (obligatorio para JPA)
    public Service() {
    }

    // Constructor con todos los campos
    public Service(int id, String name, String description, int priceHourBase, String imagenIcon, int status,
                   int version, String txUser, int txHost, Date txDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.priceHourBase = priceHourBase;
        this.imagenIcon = imagenIcon;
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

    public int getPriceHourBase() {
        return priceHourBase;
    }

    public void setPriceHourBase(int priceHourBase) {
        this.priceHourBase = priceHourBase;
    }

    public String getImagenIcon() {
        return imagenIcon;
    }

    public void setImagenIcon(String imagenIcon) {
        this.imagenIcon = imagenIcon;
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

    public int getTxHost() {
        return txHost;
    }

    public void setTxHost(int txHost) {
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
        return "Service [id=" + id + ", name=" + name + ", description=" + description + ", priceHourBase="
                + priceHourBase + ", imagenIcon=" + imagenIcon + ", status=" + status + ", version=" + version
                + ", txUser=" + txUser + ", txHost=" + txHost + ", txDate=" + txDate + "]";
    }
}
