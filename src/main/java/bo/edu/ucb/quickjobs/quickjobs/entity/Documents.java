package bo.edu.ucb.quickjobs.quickjobs.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "qj_Documents")
public class Documents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Documents_Id_Documents")
    private Long  idDocuments;

    @ManyToOne
    @JoinColumn(name = "qj_Person_qj_Person_Id_Person", nullable = false)
    private Person person;

    @Column(name = "qj_Documents_CI_Front", nullable = false)
    private String ciFront;

    @Column(name = "qj_Documents_CI_Reverse", nullable = false)
    private String ciReverse;

    @Column(name = "qj_Documents_License_Front")
    private String licenseFront;

    @Column(name = "qj_Document_License_Back")
    private String licenseBack;

    @Column(name = "qj_Documents_Proof_Home")
    private String proofHome;

    @Column(name = "qj_Documents_Police_Records")
    private String policeRecords;

    @Column(name = "qj_Documents_Status", nullable = false)
    private boolean status;

    @Column(name = "qj_Documents_Version", nullable = false)
    private int version;

    @Column(name = "qj_Documents_tx_User", nullable = false)
    private String txUser;

    @Column(name = "qj_Documents_tx_Host", nullable = false)
    private String txHost;

    @Column(name = "qj_Documents_tx_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date txDate;

    public Documents() {
    }

    public Documents(Long  idDocuments, Person person, String ciFront, String ciReverse, String licenseFront, String licenseBack, String proofHome, String policeRecords, boolean status, int version, String txUser, String txHost, Date txDate) {
        this.idDocuments = idDocuments;
        this.person = person;
        this.ciFront = ciFront;
        this.ciReverse = ciReverse;
        this.licenseFront = licenseFront;
        this.licenseBack = licenseBack;
        this.proofHome = proofHome;
        this.policeRecords = policeRecords;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    public Long  getIdDocuments() {
        return idDocuments;
    }

    public void setIdDocuments(Long  idDocuments) {
        this.idDocuments = idDocuments;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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

    public String getLicenseBack() {
        return licenseBack;
    }

    public void setLicenseBack(String licenseBack) {
        this.licenseBack = licenseBack;
    }

    public String getProofHome() {
        return proofHome;
    }

    public void setProofHome(String proofHome) {
        this.proofHome = proofHome;
    }

    public String getPoliceRecords() {
        return policeRecords;
    }

    public void setPoliceRecords(String policeRecords) {
        this.policeRecords = policeRecords;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
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

    @Override
    public String toString() {
        return "Documents{" +
                "idDocuments=" + idDocuments +
                ", person=" + person +
                ", ciFront='" + ciFront + '\'' +
                ", ciReverse='" + ciReverse + '\'' +
                ", licenseFront='" + licenseFront + '\'' +
                ", licenseBack='" + licenseBack + '\'' +
                ", proofHome='" + proofHome + '\'' +
                ", policeRecords='" + policeRecords + '\'' +
                ", status=" + status +
                ", version=" + version +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate=" + txDate +
                '}';
    }

    // Constructor, getters, and setters...

    // Additional methods...
}
