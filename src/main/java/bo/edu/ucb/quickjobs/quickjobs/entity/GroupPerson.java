package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "qj_Group_qj_Person")
public class GroupPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Group_qj_Person_Groupperson")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "qj_Group_qj_Group_Id_Group")
    private Group group;

    @ManyToOne
    @JoinColumn(name = "qj_Person_qj_Person_Id_Person")
    private Person person;

    @Column(name = "qj_Group_qj_Person_Status")
    private int status;

    @Column(name = "qj_Group_qj_Person_Version")
    private int version;

    @Column(name = "qj_Group_qj_Person_tx_User")
    private String txUser;

    @Column(name = "qj_Group_qj_Person_tx_Host")
    private String txHost;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "qj_Group_qj_Person_tx_Date")
    private Date txDate;

    // Constructor sin argumentos (obligatorio para JPA)
    public GroupPerson() {
    }

    // Constructor con todos los campos
    public GroupPerson(Long id, Group group, Person person, int status, int version, String txUser, String txHost, Date txDate) {
        this.id = id;
        this.group = group;
        this.person = person;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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

    // toString
    @Override
    public String toString() {
        return "GroupPerson [id=" + id + ", group=" + group + ", person=" + person +
                ", status=" + status + ", version=" + version + ", txUser=" + txUser +
                ", txHost=" + txHost + ", txDate=" + txDate + "]";
    }
}
