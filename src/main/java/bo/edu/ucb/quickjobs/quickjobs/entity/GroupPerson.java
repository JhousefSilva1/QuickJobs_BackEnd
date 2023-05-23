package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;

@Entity
@Table(name = "qj_Group_Person")
public class GroupPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Group_Person_Id_Person_Group")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "qj_Person_qj_Person_Id_Person")
    private Person person;

    @ManyToOne
    @JoinColumn(name = "qj_Group_qj_Group_Id_group")
    private Group group;

    @Column(name = "qj_Group_Person_Status")
    private int status;

    @Column(name = "qj_Group_Person_tx_user")
    private String user;

    @Column(name = "qj_Group_Person_tx_host")
    private String host;

    @Column(name = "qj_Group_Person_tx_date")
    private Date date;

    @Column(name = "qj_Group_Person_Version")
    private int version;

    public GroupPerson() {
        // Constructor vacío
    }

    public GroupPerson(Person person, Group group, int status, String user, String host, Date date, int version) {
        this.person = person;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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
        return "GroupPerson{" +
                "id=" + id +
                ", person=" + person +
                ", group=" + group +
                ", status=" + status +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                ", version=" + version +
                '}';
    }
}
