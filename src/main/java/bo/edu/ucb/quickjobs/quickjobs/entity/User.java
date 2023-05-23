package bo.edu.ucb.quickjobs.quickjobs.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;


@Entity

@Table(name = "qj_User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_User_Id_User", nullable = false, unique = true)
    private Long id_user;

    @Column(name = "qj_User_User")
    private String user;

    @Column(name = "qj_User_Password")
    private String password;

    @Column(name = "qj_User_Status")
    private int status;

    @Column(name = "qj_User_tx_user")
    private String txUser;

    @Column(name = "qj_User_tx_host")
    private String txHost;

    @Column(name = "qj_User_tx_date")
    private Date txDate;

    @Column(name = "qj_User_Version")
    private int version;

    public User() {
        // Constructor vacío
    }

    public User(Long id_user, String user, String password, int status, String txUser, String txHost, Date txDate, int version) {
        this.id_user = id_user;
        this.user = user;
        this.password = password;
        this.status = status;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
        this.version = version;
    }

    // Agrega el constructor con todos los parámetros según tus necesidades

    public Long getIdUser() {
        return id_user;
    }

    public void setIdUser(Long id_user) {
        this.id_user = id_user;
    }

    public  String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + id_user +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate=" + txDate +
                ", version=" + version +
                '}';
    }
}
