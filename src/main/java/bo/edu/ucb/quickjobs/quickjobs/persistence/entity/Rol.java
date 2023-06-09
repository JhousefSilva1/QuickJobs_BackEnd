package bo.edu.ucb.quickjobs.quickjobs.persistence.entity;

import jakarta.persistence.*;

import javax.management.relation.Role;
import java.util.List;

@Entity
@Table(name = "qj_Rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Rol_Id_Rol")
    private Integer roleId;

    @Column(name = "qj_Rol_Name_Rol")
    private String roleName;

    @Column(name = "qj_Rol_Description_Name_Rol")
    private String roleDescription;

    @Column(name = "qj_Rol_Status")
    private Integer status;

    @Column(name = "qj_Rol_Version")
    private Integer version;

    @Column(name = "qj_Rol_tx_User")
    private Integer user;

    @Column(name = "qj_Rol_tx_Host")
    private String host;

    @Column(name = "qj_Rol_tx_Date")
    private java.util.Date date;

    //this section is for the DataBase relationship

    @OneToMany(mappedBy = "rol")
    private List<Rol> role;

    public Rol() {
    }

    public Rol(String roleName, String roleDescription, Integer status, Integer version, Integer user, String host, java.util.Date date) {
        this.roleName = roleName;
        this.roleDescription = roleDescription;
        this.status = status;
        this.version = version;
        this.user = user;
        this.host = host;
        this.date = date;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
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

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
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
        return "Rol{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleDescription='" + roleDescription + '\'' +
                ", status=" + status +
                ", version=" + version +
                ", user=" + user +
                ", host='" + host + '\'' +
                ", date=" + date +
                '}';
    }
}
