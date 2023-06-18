package bo.edu.ucb.quickjobs.quickjobs.Persistence.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "qj_Group")
public class GroupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Group_Id_Group")
    private Long  idGroup;

    @Column(name = "qj_Group_Name_Group", nullable = false)
    private String groupName;

    @Column(name = "qj_Group_Description_Name_Group", nullable = false)
    private String groupDescription;

    @Column(name = "qj_Group_Status", nullable = false)
    private boolean status;

    @Column(name = "qj_Group_Version", nullable = false)
    private int version;

    @Column(name = "qj_Group_tx_User", nullable = false)
    private String txUser;

    @Column(name = "qj_Group_tx_Host", nullable = false)
    private String txHost;

    @Column(name = "qj_Group_tx_Date", nullable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private String txDate;

  //  @JsonBackReference
    @OneToMany(mappedBy = "group")
    private List<GroupPersonEntity> group;


    //    public GroupEntity() {
//    }
//
//    public GroupEntity(Long  idGroup, String groupName, String groupDescription, boolean status, int version, String txUser, String txHost, String txDate) {
//        this.idGroup = idGroup;
//        this.groupName = groupName;
//        this.groupDescription = groupDescription;
//        this.status = status;
//        this.version = version;
//        this.txUser = txUser;
//        this.txHost = txHost;
//        this.txDate = txDate;
//    }
//
//    public Long  getIdGroup() {
//        return idGroup;
//    }
//
//    public void setIdGroup(Long idGroup) {
//        this.idGroup = idGroup;
//    }
//
//    public String getGroupName() {
//        return groupName;
//    }
//
//    public void setGroupName(String groupName) {
//        this.groupName = groupName;
//    }
//
//    public String getGroupDescription() {
//        return groupDescription;
//    }
//
//    public void setGroupDescription(String groupDescription) {
//        this.groupDescription = groupDescription;
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
//        return "Group{" +
//                "idGroup=" + idGroup +
//                ", groupName='" + groupName + '\'' +
//                ", groupDescription='" + groupDescription + '\'' +
//                ", status=" + status +
//                ", version=" + version +
//                ", txUser='" + txUser + '\'' +
//                ", txHost='" + txHost + '\'' +
//                ", txDate=" + txDate +
//                '}';
//    }


}
