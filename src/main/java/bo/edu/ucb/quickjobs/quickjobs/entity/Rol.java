package bo.edu.ucb.quickjobs.quickjobs.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "qj_Rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Rol_id_Rol")
    private Integer id;

    @Column(name = "qj_Rol_Rol")
    private String rol;

    @Column(name = "qj_Rol_Status")
    private int status;

    @Column(name = "qj_Rol_tx_user")
    private String user;

    @Column(name = "qj_Rol_tx_host")
    private String host;

    @Column(name = "qj_Rol_tx_date")
    private Date date;

    @Column(name = "qj_Rol_Version")
    private int version;

    public Rol() {
        // Constructor vacío
    }

    // Agrega el constructor con todos los parámetros según tus necesidades

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "id=" + id +
                ", rol='" + rol + '\'' +
                ", status=" + status +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                ", version=" + version +
                '}';
    }
}
