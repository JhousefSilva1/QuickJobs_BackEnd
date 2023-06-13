package bo.edu.ucb.quickjobs.quickjobs.entity;

import java.util.Date;

public class Documents {
    private int idDocuments;
    private int personId;
    private String ciFront;
    private String ciReverse;
    private String licenseFront;
    private String licenseBack;
    private String proofHome;
    private String policeRecords;
    private boolean status;
    private int version;
    private String txUser;
    private String txHost;
    private Date txDate;

    public Documents() {
    }

    // Constructor
    public Documents(int idDocuments, int personId, String ciFront, String ciReverse, String licenseFront,
                     String licenseBack, String proofHome, String policeRecords, boolean status, int version,
                     String txUser, String txHost, Date txDate) {
        this.idDocuments = idDocuments;
        this.personId = personId;
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

    // Getters and Setters
    public int getIdDocuments() {
        return idDocuments;
    }

    public void setIdDocuments(int idDocuments) {
        this.idDocuments = idDocuments;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
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
                ", personId=" + personId +
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
}
