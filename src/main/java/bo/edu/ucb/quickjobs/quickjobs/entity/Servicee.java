package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "qj_Service")
public class Servicee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Servide_Id_Service")
    private int idService;

    @Column(name = "qj_Service_Name_Service", nullable = false)
    private String nameService;

    @Column(name = "qj_Service_Description_Name_Service", nullable = false)
    private String descriptionNameService;

    @Column(name = "qj_Service_PriceHourBase", nullable = false)
    private int priceHourBase;

    @Column(name = "qj_Service_ImagenIcon", nullable = false)
    private String imageIcon;

    @Column(name = "qj_Service_Status", nullable = false)
    private boolean status;

    @Column(name = "qj_Service_Version", nullable = false)
    private int version;

    @Column(name = "qj_Service_tx_User", nullable = false)
    private String txUser;

    @Column(name = "qj_Service_tx_Host", nullable = false)
    private int txHost;

    @Column(name = "qj_Service_tx_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date txDate;

    public Servicee() {
    }

    public Servicee(int idService, String nameService, String descriptionNameService, int priceHourBase, String imageIcon, boolean status, int version, String txUser, int txHost, Date txDate) {
        this.idService = idService;
        this.nameService = nameService;
        this.descriptionNameService = descriptionNameService;
        this.priceHourBase = priceHourBase;
        this.imageIcon = imageIcon;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getDescriptionNameService() {
        return descriptionNameService;
    }

    public void setDescriptionNameService(String descriptionNameService) {
        this.descriptionNameService = descriptionNameService;
    }

    public int getPriceHourBase() {
        return priceHourBase;
    }

    public void setPriceHourBase(int priceHourBase) {
        this.priceHourBase = priceHourBase;
    }

    public String getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(String imageIcon) {
        this.imageIcon = imageIcon;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
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

    @Override
    public String toString() {
        return "Servicee{" +
                "idService=" + idService +
                ", nameService='" + nameService + '\'' +
                ", descriptionNameService='" + descriptionNameService + '\'' +
                ", priceHourBase=" + priceHourBase +
                ", imageIcon='" + imageIcon + '\'' +
                ", status=" + status +
                ", version=" + version +
                ", txUser='" + txUser + '\'' +
                ", txHost=" + txHost +
                ", txDate=" + txDate +
                '}';
    }

    // Constructor, getters, and setters...

    // toString() method...

    // Additional methods...
}
