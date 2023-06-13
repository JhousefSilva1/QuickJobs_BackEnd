package bo.edu.ucb.quickjobs.quickjobs.entity;

import java.util.Date;

public class Rol {
    private int idRol;
    private String nameRol;
    private String description;
    private boolean status;
    private int version;
    private int txUser;
    private String txHost;
    private Date txDate;

    public Rol() {
    }

    // Constructor
    public Rol(int idRol, String nameRol, String description, boolean status, int version, int txUser, String txHost,
               Date txDate) {
        this.idRol = idRol;
        this.nameRol = nameRol;
        this.description = description;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    // Getters and Setters
    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNameRol() {
        return nameRol;
    }

    public void setNameRol(String nameRol) {
        this.nameRol = nameRol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
                ", description='" + description + '\'' +
                ", status=" + status +
                ", version=" + version +
                ", txUser=" + txUser +
                ", txHost='" + txHost + '\'' +
                ", txDate=" + txDate +
                '}';
    }
}
