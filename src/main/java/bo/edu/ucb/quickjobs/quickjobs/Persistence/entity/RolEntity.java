package bo.edu.ucb.quickjobs.quickjobs.Persistence.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "qj_Rol")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RolEntity {
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
    private String txUser;

    @Column(name = "qj_Rol_tx_Host", nullable = false)
    private String txHost;

    @Column(name = "qj_Rol_tx_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private String txDate;


//
//    public RolEntity() {
//    }
//
//    public RolEntity(Long  idRol, String nameRol, String descriptionNameRol, boolean status, int version, String txUser, String txHost, String txDate) {
//        this.idRol = idRol;
//        this.nameRol = nameRol;
//        this.descriptionNameRol = descriptionNameRol;
//        this.status = status;
//        this.version = version;
//        this.txUser = txUser;
//        this.txHost = txHost;
//        this.txDate = txDate;
//    }
//
//    public Long  getIdRol() {
//        return idRol;
//    }
//
//    public void setIdRol(Long  idRol) {
//        this.idRol = idRol;
//    }
//
//    public String getNameRol() {
//        return nameRol;
//    }
//
//    public void setNameRol(String nameRol) {
//        this.nameRol = nameRol;
//    }
//
//    public String getDescriptionNameRol() {
//        return descriptionNameRol;
//    }
//
//    public void setDescriptionNameRol(String descriptionNameRol) {
//        this.descriptionNameRol = descriptionNameRol;
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
//    public String getTxHost() {
//        return txHost;
//    }
//
//    public void setTxHost(String txHost) {
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
//        return "Rol{" +
//                "idRol=" + idRol +
//                ", nameRol='" + nameRol + '\'' +
//                ", descriptionNameRol='" + descriptionNameRol + '\'' +
//                ", status=" + status +
//                ", version=" + version +
//                ", txUser=" + txUser +
//                ", txHost='" + txHost + '\'' +
//                ", txDate=" + txDate +
//                '}';
//    }
//
//    // Constructor, getters, and setters...
//
//    // toString() method...
//
//    // Additional methods...
}
