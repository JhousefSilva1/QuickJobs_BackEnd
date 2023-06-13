package bo.edu.ucb.quickjobs.quickjobs.entity;

import java.util.Date;

public class Servicee {
    private int idService;
    private String serviceName;
    private String description;
    private int priceHourBase;
    private String imageIcon;
    private boolean status;
    private int version;
    private String txUser;
    private int txHost;
    private Date txDate;

    public Servicee() {
    }

    // Constructor
    public Servicee(int idService, String serviceName, String description, int priceHourBase, String imageIcon,
                    boolean status, int version, String txUser, int txHost, Date txDate) {
        this.idService = idService;
        this.serviceName = serviceName;
        this.description = description;
        this.priceHourBase = priceHourBase;
        this.imageIcon = imageIcon;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    // Getters and Setters
    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
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
        return "Service{" +
                "idService=" + idService +
                ", serviceName='" + serviceName + '\'' +
                ", description='" + description + '\'' +
                ", priceHourBase=" + priceHourBase +
                ", imageIcon='" + imageIcon + '\'' +
                ", status=" + status +
                ", version=" + version +
                ", txUser='" + txUser + '\'' +
                ", txHost=" + txHost +
                ", txDate=" + txDate +
                '}';
    }
}
