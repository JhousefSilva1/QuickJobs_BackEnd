package bo.edu.ucb.quickjobs.quickjobs.entity;

import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "qj_Group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Group_Id_Group")
    private Long id;

    @Column(name = "qj_Group_Name_Group", length = 500, nullable = false)
    private String name;

    @Column(name = "qj_Group_Description_Name_Group", length = 500, nullable = false)
    private String description;

    @Column(name = "qj_Group_Status", nullable = false)
    private int status;

    @Column(name = "qj_Group_Version", nullable = false)
    private int version;

    @Column(name = "qj_Group_tx_User", length = 500, nullable = false)
    private String user;

    @Column(name = "qj_Group_tx_Host", length = 500, nullable = false)
    private String host;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "qj_Group_tx_Date", nullable = false)
    private Date date;

    // Getters and setters (omitted for brevity)

    public Group() {
    }

    public Group(Long id, String name, String description, int status, int version, String user, String host, Date date) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.version = version;
        this.user = user;
        this.host = host;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
