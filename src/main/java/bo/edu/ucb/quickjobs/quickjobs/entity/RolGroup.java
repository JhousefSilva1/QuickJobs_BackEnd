package bo.edu.ucb.quickjobs.quickjobs.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "qj_Rol_Group")
public class RolGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Rol_Group_Id_Group_Rol")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "qj_Rol_qj_Rol_id_Rol")
    private Rol rol;

    @ManyToOne
    @JoinColumn(name = "qj_Group_qj_Group_Id_group")
    private Group group;

    @Column(name = "qj_Rol_Group_Status")
    private int status;

    @Column(name = "qj_Rol_Group_tx_user")
    private String user;

    @Column(name = "qj_Rol_Group_tx_host")
    private String host;

    @Column(name = "qj_Rol_Group_Version")
    private int version;

    @Column(name = "qj_Rol_Group_tx_date")
    private Date date;

    public RolGroup() {
        // Constructor vacío
    }

    // Agrega el constructor con todos los parámetros según tus necesidades

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "RolGroup{" +
                "id=" + id +
                ", rol=" + rol +
                ", group=" + group +
                ", status=" + status +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", version=" + version +
                ", date=" + date +
                '}';
    }
}
