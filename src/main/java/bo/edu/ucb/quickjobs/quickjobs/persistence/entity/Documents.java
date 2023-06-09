package bo.edu.ucb.quickjobs.quickjobs.persistence.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "qj_Documents")
public class Documents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Documents_Id_Documents")
    private Integer id;

    @Column(name = "qj_Documents_CI_Front")
    private String ciFront;

    @Column(name = "qj_Documents_CI_Reverse")
    private String ciReverse;

    @Column(name = "qj_Documents_License_Front")
    private String licenseFront;

    @Column(name = "qj_Documents_License_Reverse")
    private String licenseReverse;

    @Column(name = "qj_Documents_Certificated_FLCC")
    private String certificatedFLCC;

    @Column(name = "qj_Documents_Proof_Address")
    private String proofAddress;

    @Column(name = "qj_Documents_Status")
    private Integer status;

    @Column(name = "qj_Documents_Version")
    private Integer version;

    @Column(name = "qj_Documents_tx_User")
    private String user;

    @Column(name = "qj_Documents_tx_Host")
    private String host;

    @Column(name = "qj_Documents_tx_Date")
    private Date date;

    @Column(name = "qj_Person_qj_Person_Id_Person")
    private Integer personId;


    //this section is for the DataBase relationship
        @OneToOne
        @JoinColumn(name = "qj_Documents_qj_Person_Id_Person", insertable = false, updatable = false)
        private Person persons;
    //
    public Documents() {
    }

    public Documents(String ciFront, String ciReverse, String licenseFront, String licenseReverse, String certificatedFLCC, String proofAddress, Integer status, Integer version, String user, String host, Date date, Integer personId) {
        this.ciFront = ciFront;
        this.ciReverse = ciReverse;
        this.licenseFront = licenseFront;
        this.licenseReverse = licenseReverse;
        this.certificatedFLCC = certificatedFLCC;
        this.proofAddress = proofAddress;
        this.status = status;
        this.version = version;
        this.user = user;
        this.host = host;
        this.date = date;
        this.personId = personId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCiFront() {
        return ciFront;
    }

    public void setCiFront(String ciFront) {
        this.ciFront = ciFront;
    }

    public String getCiReverse() {
        return ciReverse;
    }

    public void setCiReverse(String ciReverse) {
        this.ciReverse = ciReverse;
    }

    public String getLicenseFront() {
        return licenseFront;
    }

    public void setLicenseFront(String licenseFront) {
        this.licenseFront = licenseFront;
    }

    public String getLicenseReverse() {
        return licenseReverse;
    }

    public void setLicenseReverse(String licenseReverse) {
        this.licenseReverse = licenseReverse;
    }

    public String getCertificatedFLCC() {
        return certificatedFLCC;
    }

    public void setCertificatedFLCC(String certificatedFLCC) {
        this.certificatedFLCC = certificatedFLCC;
    }

    public String getProofAddress() {
        return proofAddress;
    }

    public void setProofAddress(String proofAddress) {
        this.proofAddress = proofAddress;
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

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "Documents{" +
                "id=" + id +
                ", ciFront='" + ciFront + '\'' +
                ", ciReverse='" + ciReverse + '\'' +
                ", licenseFront='" + licenseFront + '\'' +
                ", licenseReverse='" + licenseReverse + '\'' +
                ", certificatedFLCC='" + certificatedFLCC + '\'' +
                ", proofAddress='" + proofAddress + '\'' +
                ", status=" + status +
                ", version=" + version +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                ", personId=" + personId +
                '}';
    }
}
