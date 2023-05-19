package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;


import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "qj_Contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Contract")
    private Integer id;

    @Column(name = "Contract")
    private String contract;

    @Column(name = "Date")
    private Date date;

    @Column(name = "Hour")
    private Time hour;

    @Column(name = "Signature_Customer")
    private String signatureCustomer;

    @Column(name = "Signature_Worker")
    private String signatureWorker;

    @Column(name = "qj_Contract_Status")
    private int status;

    @Column(name = "qj_Contract_tx_user")
    private String user;

    @Column(name = "qj_Contract_tx_host")
    private String host;

    @Column(name = "qj_Contract_tx_date")
    private Date transactionDate;

    @ManyToOne
    @JoinColumn(name = "qj_Request_Id_Request")
    private Request request;

    // Constructor vacío (requerido por JPA)
    public Contract() {
    }

    // Constructor con parámetros
    public Contract(Integer id, String contract, Date date, Time hour, String signatureCustomer, String signatureWorker, int status, String user, String host, Date transactionDate, Request request) {
        this.id = id;
        this.contract = contract;
        this.date = date;
        this.hour = hour;
        this.signatureCustomer = signatureCustomer;
        this.signatureWorker = signatureWorker;
        this.status = status;
        this.user = user;
        this.host = host;
        this.transactionDate = transactionDate;
        this.request = request;
    }
    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getHour() {
        return hour;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    public String getSignatureCustomer() {
        return signatureCustomer;
    }

    public void setSignatureCustomer(String signatureCustomer) {
        this.signatureCustomer = signatureCustomer;
    }

    public String getSignatureWorker() {
        return signatureWorker;
    }

    public void setSignatureWorker(String signatureWorker) {
        this.signatureWorker = signatureWorker;
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

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }
}
