package bo.edu.ucb.quickjobs.quickjobs.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "qj_Service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Servide_Id_Service")
    private Integer serviceId;

    @Column(name = "qj_Service_Name_Service")
    private String serviceName;

    @Column(name = "qj_Service_Description_Name_Service")
    private String serviceDescription;

    @Column(name = "qj_Service_PriceHourBase")
    private Integer priceHourBase;

    @Column(name = "qj_Service_ImagenIcon")
    private String imageIcon;

    @Column(name = "qj_Service_Status")
    private Integer status;

    @Column(name = "qj_Service_Version")
    private Integer version;

    @Column(name = "qj_Service_tx_User")
    private String user;

    @Column(name = "qj_Service_tx_Host")
    private Integer host;

    @Column(name = "qj_Service_tx_Date")
    private java.util.Date date;

    public Service() {
    }

    public Service(String serviceName, String serviceDescription, Integer priceHourBase, String imageIcon, Integer status, Integer version, String user, Integer host, java.util.Date date) {
        this.serviceName = serviceName;
        this.serviceDescription = serviceDescription;
        this.priceHourBase = priceHourBase;
        this.imageIcon = imageIcon;
        this.status = status;
        this.version = version;
        this.user = user;
        this.host = host;
        this.date = date;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public Integer getPriceHourBase() {
        return priceHourBase;
    }

    public void setPriceHourBase(Integer priceHourBase) {
        this.priceHourBase = priceHourBase;
    }

    public String getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(String imageIcon) {
        this.imageIcon = imageIcon;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getHost() {
        return host;
    }

    public void setHost(Integer host) {
        this.host = host;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceId=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                ", serviceDescription='" + serviceDescription + '\'' +
                ", priceHourBase=" + priceHourBase +
                ", imageIcon='" + imageIcon + '\'' +
                ", status=" + status +
                ", version=" + version +
                ", user='" + user + '\'' +
                ", host=" + host +
                ", date=" + date +
                '}';
    }
}
