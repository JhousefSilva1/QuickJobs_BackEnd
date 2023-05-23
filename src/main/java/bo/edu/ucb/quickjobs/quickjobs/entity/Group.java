package bo.edu.ucb.quickjobs.quickjobs.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "qj_Group")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Group_Id_group")
    private Integer id;

    @Column(name = "qj_Group_Group")
    private String group;

    @Column(name = "qj_Group_Status")
    private int status;

    @Column(name = "qj_Group_tx_user")
    private String user;

    @Column(name = "qj_Group_tx_host")
    private String host;

    @Column(name = "qj_Group_tx_date")
    private Date date;

    @Column(name = "qj_Grroup_Version")
    private int version;

    public Group() {
        // Constructor vacío
    }

    public Group(String group, int status, String user, String host, Date date, int version) {
        this.group = group;
        this.status = status;
        this.user = user;
        this.host = host;
        this.date = date;
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
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
        return "Group{" +
                "id=" + id +
                ", group='" + group + '\'' +
                ", status=" + status +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                ", version=" + version +
                '}';
    }
}
