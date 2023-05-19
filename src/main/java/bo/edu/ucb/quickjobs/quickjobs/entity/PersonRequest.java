package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Date;

@Entity
@Table(name = "qj_Person_Request")
public class PersonRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Person_Request")
    private Integer id;

    @Column(name = "qj_Person_Request_Status")
    private int status;

    @Column(name = "qj_Person_Request_tx_user")
    private String user;

    @Column(name = "qj_Person_Request_tx_host")
    private String host;

    @Column(name = "qj_Person_Request_tx_date")
    private Date transactionDate;

    @Column(name = "qj_Person_Id_Person")
    private int personId;

    @Column(name = "qj_Request_Id_Request")
    private int requestId;

    // Constructor vacío (requerido por JPA)
    public PersonRequest() {
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }
}
