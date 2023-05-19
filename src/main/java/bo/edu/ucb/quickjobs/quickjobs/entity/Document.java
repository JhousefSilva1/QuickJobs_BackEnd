package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Date;

@Entity
@Table(name = "qj_Documents")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Docuement")
    private Integer id;

    @Column(name = "DNI_Front")
    private String dniFront;

    @Column(name = "DNI_Back")
    private String dniBack;

    @Column(name = "Licence_Front")
    private String licenceFront;

    @Column(name = "Licence_Back")
    private String licenceBack;

    @Column(name = "Photo_Profile")
    private String photoProfile;

    @Column(name = "qj_Documents_Status")
    private int status;

    @Column(name = "qj_Documents_tx_user")
    private String user;

    @Column(name = "qj_Documents_tx_host")
    private String host;

    @Column(name = "qj_Documents_tx_date")
    private Date transactionDate;

    // Constructor vacío (requerido por JPA)
    public Document() {
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
