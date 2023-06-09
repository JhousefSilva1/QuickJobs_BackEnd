package bo.edu.ucb.quickjobs.quickjobs.persistence.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "qj_Group_qj_Rol")
public class GroupRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Group_qj_Rol_Id_GroupRol")
    private Integer groupRoleId;

    @Column(name = "qj_Group_qj_Group_Id_Group")
    private Integer groupId;

    @Column(name = "qj_Rol_qj_Rol_Id_Rol")
    private Integer roleId;

    @Column(name = "qj_Group_qj_Rol_Status")
    private Integer status;

    @Column(name = "qj_Group_qj_Rol_Version")
    private Integer version;

    @Column(name = "qj_Group_qj_Rol_tx_User")
    private String user;

    @Column(name = "qj_Group_qj_Rol_tx_Host")
    private String host;

    @Column(name = "qj_Group_qj_Rol_tx_Date")
    private Date date;

    //this section is for the DataBase relationship
    @ManyToOne
    @JoinColumn(name = "qj_Group_Id_Group",updatable = false,insertable = false)
    private Group group;



    @ManyToOne
    @JoinColumn(name = "qj_Rol_Id_Rol",updatable = false,insertable = false)
    private Rol rol;
    public GroupRole() {
    }

    public GroupRole(Integer groupId, Integer roleId, Integer status, Integer version, String user, String host, Date date) {
        this.groupId = groupId;
        this.roleId = roleId;
        this.status = status;
        this.version = version;
        this.user = user;
        this.host = host;
        this.date = date;
    }

    public Integer getGroupRoleId() {
        return groupRoleId;
    }

    public void setGroupRoleId(Integer groupRoleId) {
        this.groupRoleId = groupRoleId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "GroupRole{" +
                "groupRoleId=" + groupRoleId +
                ", groupId=" + groupId +
                ", roleId=" + roleId +
                ", status=" + status +
                ", version=" + version +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                '}';
    }
}
