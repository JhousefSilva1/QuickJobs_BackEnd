package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "qj_Documents")
public class Documents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Documents_Id_Documents")
    private Long id;

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
    private int status;

    @Column(name = "qj_Documents_Version")
    private int version;

    @Column(name = "qj_Documents_tx_User")
    private String txUser;

    @Column(name = "qj_Documents_tx_Host")
    private String txHost;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "qj_Documents_tx_Date")
    private Date txDate;

    @ManyToOne
    @JoinColumn(name = "qj_Person_qj_Person_Id_Person")
    private Person person;

    // Constructor sin argumentos (obligatorio para JPA)
    public Documents() {
    }

    // Constructor con todos los campos
    public Documents(Long id, String ciFront, String ciReverse, String licenseFront, String licenseReverse,
                     String certificatedFLCC, String proofAddress, int status, int version, String txUser,
                     String txHost, Date txDate, Person person) {
        this.id = id;
        this.ciFront = ciFront;
        this.ciReverse = ciReverse;
        this.licenseFront = licenseFront;
        this.licenseReverse = licenseReverse;
        this.certificatedFLCC = certificatedFLCC;
        this.proofAddress = proofAddress;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
        this.person = person;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    // toString
    @Override
    public String toString() {
        return "Documents [id=" + id + ", ciFront=" + ciFront + ", ciReverse=" + ciReverse +
                ", licenseFront=" + licenseFront + ", licenseReverse=" + licenseReverse +
                ", certificatedFLCC=" + certificatedFLCC + ", proofAddress=" + proofAddress +
                ", status=" + status + ", version=" + version + ", txUser=" + txUser +
                ", txHost=" + txHost + ", txDate=" + txDate + ", person=" + person + "]";
    }
}
