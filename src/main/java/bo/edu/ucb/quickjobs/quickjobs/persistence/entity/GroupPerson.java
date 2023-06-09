package bo.edu.ucb.quickjobs.quickjobs.persistence.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "qj_Group_qj_Person")
public class GroupPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Group_qj_Person_GroupPerson")
    private Integer groupPersonId;

    @Column(name = "qj_Group_qj_Group_Id_Group")
    private Integer groupId;

    @Column(name = "qj_Person_qj_Person_Id_Person")
    private Integer personId;

    @Column(name = "qj_Group_qj_Person_Status")
    private Integer status;

    @Column(name = "qj_Group_qj_Person_Version")
    private Integer version;

    @Column(name = "qj_Group_qj_Person_tx_User")
    private String user;

    @Column(name = "qj_Group_qj_Person_tx_Host")
    private String host;

    @Column(name = "qj_Group_qj_Person_tx_Date")
    private Date date;


    //this section is for the DataBase relationship

    @ManyToOne
    @JoinColumn(name = "qj_Person_Id_Person", insertable = false, updatable = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "qj_Group_Id_Group", insertable = false, updatable = false)
    private Group group;
    public GroupPerson() {
    }

    public GroupPerson(Integer groupId, Integer personId, Integer status, Integer version, String user, String host, Date date) {
        this.groupId = groupId;
        this.personId = personId;
        this.status = status;
        this.version = version;
        this.user = user;
        this.host = host;
        this.date = date;
    }

    public Integer getGroupPersonId() {
        return groupPersonId;
    }

    public void setGroupPersonId(Integer groupPersonId) {
        this.groupPersonId = groupPersonId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
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
        return "GroupPerson{" +
                "groupPersonId=" + groupPersonId +
                ", groupId=" + groupId +
                ", personId=" + personId +
                ", status=" + status +
                ", version=" + version +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                '}';
    }
}
