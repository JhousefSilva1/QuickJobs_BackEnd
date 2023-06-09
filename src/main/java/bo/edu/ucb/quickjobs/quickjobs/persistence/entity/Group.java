package bo.edu.ucb.quickjobs.quickjobs.persistence.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "qj_Group")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Group_Id_Group")
    private Integer id;

    @Column(name = "qj_Group_Name_Group")
    private String name;

    @Column(name = "qj_Group_Description_Name_Group")
    private String description;

    @Column(name = "qj_Group_Status")
    private Integer status;

    @Column(name = "qj_Group_Version")
    private Integer version;

    @Column(name = "qj_Group_tx_User")
    private String user;

    @Column(name = "qj_Group_tx_Host")
    private String host;

    @Column(name = "qj_Group_tx_Date")
    private Date date;

    //this section is for the DataBase relationship

    @OneToMany(mappedBy = "group")
    private List<GroupPerson> groupPerson;

    @OneToMany(mappedBy = "group")
    private List<GroupRole> groupRole;

    public Group() {
    }

    public Group(String name, String description, Integer status, Integer version, String user, String host, Date date) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.version = version;
        this.user = user;
        this.host = host;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", version=" + version +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                '}';
    }
}
