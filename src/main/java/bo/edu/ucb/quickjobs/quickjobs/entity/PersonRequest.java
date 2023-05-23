package bo.edu.ucb.quickjobs.quickjobs.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "qj_Person_Request")
public class PersonRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Person_Request_Id_Person_Request")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "qj_Request_qj_Request_Id_Request")
    private Request request;

    @ManyToOne
    @JoinColumn(name = "qj_Person_qj_Person_Id_Person")
    private Person person;

    @Column(name = "qj_Person_Request_Status")
    private int status;

    @Column(name = "qj_Person_Request_tx_user")
    private String user;

    @Column(name = "qj_Person_Request_tx_host")
    private String host;

    @Column(name = "qj_Person_Request_tx_date")
    private Date date;

    @Column(name = "qj_Person_Request_Version")
    private int version;

    public PersonRequest() {
        // Constructor vacío
    }

    public PersonRequest(Request request, Person person, int status, String user, String host, Date date, int version) {
        this.request = request;
        this.person = person;
        this.status = status;
        this.user = user;
        this.host = host;
        this.date = date;
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
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
        return "PersonRequest{" +
                "id=" + id +
                ", request=" + request +
                ", person=" + person +
                ", status=" + status +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                ", version=" + version +
                '}';
    }
}
