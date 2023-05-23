package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "qj_Contract")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Contract_Id_Contract")
    private Long id;

    @Column(name = "qj_Contract_Contract", length = 5000, nullable = false)
    private String contract;

    @Column(name = "qj_Contract_Date", nullable = false)
    private Date date;

    @Column(name = "qj_Contract_Hour", nullable = false)
    private Date hour;

    @Column(name = "qj_Contract_Signature_Customer", length = 500, nullable = false)
    private String signatureCustomer;

    @Column(name = "qj_Contract_Signature_Worker", length = 500, nullable = false)
    private String signatureWorker;

    @Column(name = "qj_Contract_Status", nullable = false)
    private int status;

    @Column(name = "qj_Contract_tx_user", length = 500, nullable = false)
    private String user;

    @Column(name = "qj_Contract_tx_host", length = 500, nullable = false)
    private String host;

    @Column(name = "qj_Contract_tx_date", nullable = false)
    private Date transactionDate;

    @Column(name = "qj_Contract_Version", nullable = false)
    private int version;

    public Contract() {
        // Constructor vacío
    }

    public Contract(String contract, Date date, Date hour, String signatureCustomer, String signatureWorker,
                    int status, String user, String host, Date transactionDate, int version) {
        this.contract = contract;
        this.date = date;
        this.hour = hour;
        this.signatureCustomer = signatureCustomer;
        this.signatureWorker = signatureWorker;
        this.status = status;
        this.user = user;
        this.host = host;
        this.transactionDate = transactionDate;
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Date getHour() {
        return hour;
    }

    public void setHour(Date hour) {
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

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", contract='" + contract + '\'' +
                ", date=" + date +
                ", hour=" + hour +
                ", signatureCustomer='" + signatureCustomer + '\'' +
                ", signatureWorker='" + signatureWorker + '\'' +
                ", status=" + status +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", transactionDate=" + transactionDate +
                ", version=" + version +
                '}';
    }
}
