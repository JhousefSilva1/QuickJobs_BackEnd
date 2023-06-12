package bo.edu.ucb.quickjobs.quickjobs.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.sql.Timestamp;

public class ServiceDTO {
    private int idService;
    @NotEmpty
    @Size(min = 15, message = "El tamaño debe ser mayor a 15")
    private String nameService;
    @NotEmpty
    @Size(min = 15, message = "El tamaño debe ser mayor a 15")
    private String descriptionService;
    @NotEmpty
    @Size(min = 15, message = "El tamaño debe ser mayor a 15")
    private int priceHourBase;
    private String imageIcon;
    private int status;
    private int version;
    private String txUser;
    private int txHost;
    private Timestamp txDate;

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

    public String getDescriptionService() {
        return descriptionService;
    }

    public void setDescriptionService(String descriptionService) {
        this.descriptionService = descriptionService;
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

    public Timestamp getTxDate() {
        return txDate;
    }

    public void setTxDate(Timestamp txDate) {
        this.txDate = txDate;
    }

    @Override
    public String toString() {
        return "ServiceDTO{" +
                "idService=" + idService +
                ", nameService='" + nameService + '\'' +
                ", descriptionService='" + descriptionService + '\'' +
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
