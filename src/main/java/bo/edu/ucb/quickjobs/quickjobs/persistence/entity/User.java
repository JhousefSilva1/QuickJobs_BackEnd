package bo.edu.ucb.quickjobs.quickjobs.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "qj_User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_User_Id_User")
    private Integer userId;

    @Column(name = "qj_User_Username")
    private String username;

    @Column(name = "qj_User_Password")
    private String password;

    @Column(name = "qj_User_Status")
    private Integer status;

    @Column(name = "qj_Service_Version")
    private Integer version;

    @Column(name = "qj_User_tx_User")
    private String user;

    @Column(name = "qj_User_tx_Host")
    private String host;

    @Column(name = "qj_User_tx_Date")
    private java.util.Date date;

    //this section is for the DataBase relationship

    @OneToOne
    @JoinColumn(name = "qj_User_qj_User_Id_User", insertable = false, updatable = false)
    private User users;

    public User() {
    }

    public User(String username, String password, Integer status, Integer version, String user, String host, java.util.Date date) {
        this.username = username;
        this.password = password;
        this.status = status;
        this.version = version;
        this.user = user;
        this.host = host;
        this.date = date;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", version=" + version +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                '}';
    }
}
