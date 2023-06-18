package bo.edu.ucb.quickjobs.quickjobs.Persistence.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "qj_Group_qj_Person")
public class GroupPersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Group_qj_Person_GroupPerson")
    private Long groupPersonId;

    @Column(name = "qj_Group_qj_Group_Id_Group", nullable = false)
    private int groupId;

    @Column(name = "qj_Person_qj_Person_Id_Person", nullable = false)
    private int personId;

    @Column(name = "qj_Group_qj_Person_Status", nullable = false)
    private boolean status;

    @Column(name = "qj_Group_qj_Person_Version", nullable = false)
    private int version;

    @Column(name = "qj_Group_qj_Person_tx_User", nullable = false)
    private String txUser;

    @Column(name = "qj_Group_qj_Person_tx_Host", nullable = false)
    private String txHost;

    @Column(name = "qj_Group_qj_Person_tx_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private String txDate;

    //relationship

    @ManyToOne
    @JoinColumn(name = "qj_Person_qj_Person_Id_Person",insertable = false, updatable = false)
    private PersonEntity person;

    @ManyToOne
    @JoinColumn(name = "qj_Group_qj_Group_Id_Group",insertable = false, updatable = false)
    private GroupEntity group;







    //
//    public GroupPersonEntity() {
//    }
//
//    public GroupPersonEntity(Long  groupPersonId, int groupId, int personId, boolean status, int version, String txUser, String txHost, String txDate) {
//        this.groupPersonId = groupPersonId;
//        this.groupId = groupId;
//        this.personId = personId;
//        this.status = status;
//        this.version = version;
//        this.txUser = txUser;
//        this.txHost = txHost;
//        this.txDate = txDate;
//    }
//
//    public Long  getGroupPersonId() {
//        return groupPersonId;
//    }
//
//    public void setGroupPersonId(Long  groupPersonId) {
//        this.groupPersonId = groupPersonId;
//    }
//
//    public int getGroupId() {
//        return groupId;
//    }
//
//    public void setGroupId(int groupId) {
//        this.groupId = groupId;
//    }
//
//    public int getPersonId() {
//        return personId;
//    }
//
//    public void setPersonId(int personId) {
//        this.personId = personId;
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
//        return "GroupPerson{" +
//                "groupPersonId=" + groupPersonId +
//                ", groupId=" + groupId +
//                ", personId=" + personId +
//                ", status=" + status +
//                ", version=" + version +
//                ", txUser='" + txUser + '\'' +
//                ", txHost='" + txHost + '\'' +
//                ", txDate=" + txDate +
//                '}';
//    }
//
//    // Constructor, getters, and setters...
//
//    // Additional methods...
}
