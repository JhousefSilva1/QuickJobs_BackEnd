package bo.edu.ucb.quickjobs.quickjobs.Persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "qj_Service")
public class ServiceeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Servide_Id_Service")
    private Long  idService;

    @Column(name = "qj_Service_Name_Service", nullable = false)
    private String nameService;

    @Column(name = "qj_Service_Description_Name_Service", nullable = false)
    private String descriptionNameService;

    @Column(name = "qj_Service_Pricehourbase", nullable = false)
    private int priceHourBase;

    @Column(name = "qj_Service_Imagenicon", nullable = false)
    private String imageIcon;

    @Column(name = "qj_Service_Status", nullable = false)
    private boolean status;

    @Column(name = "qj_Service_Version", nullable = false)
    private int version;

    @Column(name = "qj_Service_tx_User", nullable = false)
    private String txUser;

    @Column(name = "qj_Service_tx_Host", nullable = false)
    private String txHost;

    @Column(name = "qj_Service_tx_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private String txDate;



//    public ServiceeEntity() {
//    }
//
//    public ServiceeEntity(Long  idService, String nameService, String descriptionNameService, int priceHourBase, String imageIcon, boolean status, int version, String txUser, String  txHost, String txDate) {
//        this.idService = idService;
//        this.nameService = nameService;
//        this.descriptionNameService = descriptionNameService;
//        this.priceHourBase = priceHourBase;
//        this.imageIcon = imageIcon;
//        this.status = status;
//        this.version = version;
//        this.txUser = txUser;
//        this.txHost = txHost;
//        this.txDate = txDate;
//    }
//
//    public Long  getIdService() {
//        return idService;
//    }
//
//    public void setIdService(Long  idService) {
//        this.idService = idService;
//    }
//
//    public String getNameService() {
//        return nameService;
//    }
//
//    public void setNameService(String nameService) {
//        this.nameService = nameService;
//    }
//
//    public String getDescriptionNameService() {
//        return descriptionNameService;
//    }
//
//    public void setDescriptionNameService(String descriptionNameService) {
//        this.descriptionNameService = descriptionNameService;
//    }
//
//    public int getPriceHourBase() {
//        return priceHourBase;
//    }
//
//    public void setPriceHourBase(int priceHourBase) {
//        this.priceHourBase = priceHourBase;
//    }
//
//    public String getImageIcon() {
//        return imageIcon;
//    }
//
//    public void setImageIcon(String imageIcon) {
//        this.imageIcon = imageIcon;
//    }
//
//    public boolean isStatus() {
//        return status;
//    }
//
//    public void setStatus(boolean status) {
//        this.status = status;
//    }
//
//    public int getVersion() {
//        return version;
//    }
//
//    public void setVersion(int version) {
//        this.version = version;
//    }
//
//    public String getTxUser() {
//        return txUser;
//    }
//
//    public void setTxUser(String txUser) {
//        this.txUser = txUser;
//    }
//
//    public String  getTxHost() {
//        return txHost;
//    }
//
//    public void setTxHost(String  txHost) {
//        this.txHost = txHost;
//    }
//
//    public String getTxDate() {
//        return txDate;
//    }
//
//    public void setTxDate(String txDate) {
//        this.txDate = txDate;
//    }
//
//    @Override
//    public String toString() {
//        return "Servicee{" +
//                "idService=" + idService +
//                ", nameService='" + nameService + '\'' +
//                ", descriptionNameService='" + descriptionNameService + '\'' +
//                ", priceHourBase=" + priceHourBase +
//                ", imageIcon='" + imageIcon + '\'' +
//                ", status=" + status +
//                ", version=" + version +
//                ", txUser='" + txUser + '\'' +
//                ", txHost=" + txHost +
//                ", txDate=" + txDate +
//                '}';
//    }


}
