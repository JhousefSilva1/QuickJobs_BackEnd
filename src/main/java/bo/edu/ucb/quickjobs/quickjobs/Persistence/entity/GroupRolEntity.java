package bo.edu.ucb.quickjobs.quickjobs.Persistence.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "qj_Group_qj_Rol")

public class GroupRolEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Group_qj_Rol_Id_GroupRol")
    private Long  idGroupRol;

    @Column(name = "qj_Group_qj_Group_Id_Group", nullable = false)
    private int groupId;

    @Column(name = "qj_Rol_qj_Rol_Id_Rol", nullable = false)
    private int roleId;

    @Column(name = "qj_Group_qj_Rol_Status", nullable = false)
    private boolean status;

    @Column(name = "qj_Group_qj_Rol_Version", nullable = false)
    private int version;

    @Column(name = "qj_Group_qj_Rol_tx_User", nullable = false)
    private String txUser;

    @Column(name = "qj_Group_qj_Rol_tx_Host", nullable = false)
    private String txHost;

    @Column(name = "qj_Group_qj_Rol_tx_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private String txDate;

//    @ManyToOne
//    @JoinColumn(name = "qj_Group_qj_Group_Id_Group", referencedColumnName = "qj_Group_Id_Group", insertable = false,updatable = false)
//    private RolEntity rolEntity;
//
//    @ManyToOne
//    @JoinColumn(name = "qj_Group_qj_Rol_Id_Rol", referencedColumnName = "qj_Rol_Id_Rol", insertable = false,updatable = false)
//    private GroupEntity groupEntity1;

    public GroupRolEntity() {
    }

    public GroupRolEntity(Long idGroupRol, int groupId, int roleId, boolean status, int version, String txUser, String txHost, String txDate) {
        this.idGroupRol = idGroupRol;
        this.groupId = groupId;
        this.roleId = roleId;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    public Long getIdGroupRol() {
        return idGroupRol;
    }

    public void setIdGroupRol(Long idGroupRol) {
        this.idGroupRol = idGroupRol;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
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

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public String getTxDate() {
        return txDate;
    }

    public void setTxDate(String txDate) {
        this.txDate = txDate;
    }

    @Override
    public String toString() {
        return "GroupRol{" +
                "idGroupRol=" + idGroupRol +
                ", groupId=" + groupId +
                ", roleId=" + roleId +
                ", status=" + status +
                ", version=" + version +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate=" + txDate +
                '}';
    }
}
