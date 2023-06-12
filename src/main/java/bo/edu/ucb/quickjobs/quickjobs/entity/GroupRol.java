package bo.edu.ucb.quickjobs.quickjobs.entity;

import bo.edu.ucb.quickjobs.quickjobs.entity.Group;
import bo.edu.ucb.quickjobs.quickjobs.entity.Rol;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "qj_Group_qj_Rol")
public class GroupRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Group_qj_Rol_Id_GroupRol")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "qj_Group_qj_Group_Id_Group")
    private Group group;

    @ManyToOne
    @JoinColumn(name = "qj_Rol_qj_Rol_Id_Rol")
    private Rol rol;

    @Column(name = "qj_Group_qj_Rol_Status")
    private int status;

    @Column(name = "qj_Group_qj_Rol_Version")
    private int version;

    @Column(name = "qj_Group_qj_Rol_tx_User")
    private String txUser;

    @Column(name = "qj_Group_qj_Rol_tx_Host")
    private String txHost;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "qj_Group_qj_Rol_tx_Date")
    private Date txDate;

    // Constructor sin argumentos (obligatorio para JPA)
    public GroupRol() {
    }

    // Constructor con todos los campos
    public GroupRol(Long id, Group group, Rol rol, int status, int version, String txUser, String txHost, Date txDate) {
        this.id = id;
        this.group = group;
        this.rol = rol;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
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

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    // toString
    @Override
    public String toString() {
        return "GroupRol [id=" + id + ", group=" + group + ", rol=" + rol +
                ", status=" + status + ", version=" + version + ", txUser=" + txUser +
                ", txHost=" + txHost + ", txDate=" + txDate + "]";
    }
}
