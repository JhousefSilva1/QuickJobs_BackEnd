package bo.edu.ucb.quickjobs.quickjobs.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "qj_Rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Rol_Id_Rol")
    private Long  idRol;

    @Column(name = "qj_Rol_Name_Rol", nullable = false)
    private String nameRol;

    @Column(name = "qj_Rol_Description_Name_Rol", nullable = false)
    private String descriptionNameRol;

    @Column(name = "qj_Rol_Status", nullable = false)
    private boolean status;

    @Column(name = "qj_Rol_Version", nullable = false)
    private int version;

    @Column(name = "qj_Rol_tx_User", nullable = false)
    private int txUser;

    @Column(name = "qj_Rol_tx_Host", nullable = false)
    private String txHost;

    @Column(name = "qj_Rol_tx_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date txDate;



    public Rol() {
    }

    public Rol(Long  idRol, String nameRol, String descriptionNameRol, boolean status, int version, int txUser, String txHost, Date txDate) {
        this.idRol = idRol;
        this.nameRol = nameRol;
        this.descriptionNameRol = descriptionNameRol;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    public Long  getIdRol() {
        return idRol;
    }

    public void setIdRol(Long  idRol) {
        this.idRol = idRol;
    }

    public String getNameRol() {
        return nameRol;
    }

    public void setNameRol(String nameRol) {
        this.nameRol = nameRol;
    }

    public String getDescriptionNameRol() {
        return descriptionNameRol;
    }

    public void setDescriptionNameRol(String descriptionNameRol) {
        this.descriptionNameRol = descriptionNameRol;
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

    @Override
    public String toString() {
        return "Rol{" +
                "idRol=" + idRol +
                ", nameRol='" + nameRol + '\'' +
                ", descriptionNameRol='" + descriptionNameRol + '\'' +
                ", status=" + status +
                ", version=" + version +
                ", txUser=" + txUser +
                ", txHost='" + txHost + '\'' +
                ", txDate=" + txDate +
                '}';
    }

    // Constructor, getters, and setters...

    // toString() method...

    // Additional methods...
}
