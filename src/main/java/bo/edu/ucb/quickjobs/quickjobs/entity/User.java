package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "qj_User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_User")
    private int id;

    @Column(name = "User")
    private String username;

    @Column(name = "Password")
    private String password;

    @Column(name = "qj_User_Status")
    private int status;

    @Column(name = "qj_User_tx_user")
    private String user;

    @Column(name = "qj_User_tx_host")
    private String host;

    @Column(name = "qj_User_tx_date")
    private Date date;

    // Constructor, getters, and setters

    // Constructors
    public User() {
    }

    public User(String username, String password, int status, String user, String host, Date date) {
        this.username = username;
        this.password = password;
        this.status = status;
        this.user = user;
        this.host = host;
        this.date = date;
    }

    // Getters and Setters
    // ...

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
