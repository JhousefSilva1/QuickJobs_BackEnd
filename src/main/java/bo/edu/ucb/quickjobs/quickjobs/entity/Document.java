package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "qj_Documents")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Documents_Id_Docuement")
    private Long id;

    @Column(name = "qj_Documents_DNI_Front", length = 500, nullable = false)
    private String dniFront;

    @Column(name = "qj_Documents_DNI_Back", length = 500, nullable = false)
    private String dniBack;

    @Column(name = "qj_Documents_Licence_Front", length = 500, nullable = false)
    private String licenceFront;

    @Column(name = "qj_Documents_Licence_Back", length = 500, nullable = false)
    private String licenceBack;

    @Column(name = "qj_Documents_Photo_Profile", length = 500, nullable = false)
    private String photoProfile;

    @Column(name = "qj_Documents_Status", nullable = false)
    private int status;

    @Column(name = "qj_Documents_tx_user", length = 500, nullable = false)
    private String user;

    @Column(name = "qj_Documents_tx_host", length = 500, nullable = false)
    private String host;

    @Column(name = "qj_Documents_tx_date", nullable = false)
    private Date transactionDate;

    @Column(name = "qj_Documents_Version", nullable = false)
    private int version;

    public Document() {
        // Constructor vacío
    }

    public Document(String dniFront, String dniBack, String licenceFront, String licenceBack, String photoProfile,
                    int status, String user, String host, Date transactionDate, int version) {
        this.dniFront = dniFront;
        this.dniBack = dniBack;
        this.licenceFront = licenceFront;
        this.licenceBack = licenceBack;
        this.photoProfile = photoProfile;
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

    public String getDniFront() {
        return dniFront;
    }

    public void setDniFront(String dniFront) {
        this.dniFront = dniFront;
    }

    public String getDniBack() {
        return dniBack;
    }

    public void setDniBack(String dniBack) {
        this.dniBack = dniBack;
    }

    public String getLicenceFront() {
        return licenceFront;
    }

    public void setLicenceFront(String licenceFront) {
        this.licenceFront = licenceFront;
    }

    public String getLicenceBack() {
        return licenceBack;
    }

    public void setLicenceBack(String licenceBack) {
        this.licenceBack = licenceBack;
    }

    public String getPhotoProfile() {
        return photoProfile;
    }

    public void setPhotoProfile(String photoProfile) {
        this.photoProfile = photoProfile;
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
        return "Documents{" +
                "id=" + id +
                ", dniFront='" + dniFront + '\'' +
                ", dniBack='" + dniBack + '\'' +
                ", licenceFront='" + licenceFront + '\'' +
                ", licenceBack='" + licenceBack + '\'' +
                ", photoProfile='" + photoProfile + '\'' +
                ", status=" + status +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", transactionDate=" + transactionDate +
                ", version=" + version +
                '}';
    }
}
