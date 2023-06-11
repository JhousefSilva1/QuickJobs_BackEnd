package bo.edu.ucb.quickjobs.quickjobs.dto;

import java.util.Date;

public class DocumentsDTO {
//prueba
    private int id;
    private String ciFront;
    private String ciReverse;
    private String licenseFront;
    private String licenseReverse;
    private String certificatedFLCC;
    private String proofAddress;
    private int status;
    private int version;
    private String txUser;
    private String txHost;
    private Date txDate;
    private int personId;

    // Constructor sin argumentos
    public DocumentsDTO() {
    }

    // Constructor con todos los campos
    public DocumentsDTO(int id, String ciFront, String ciReverse, String licenseFront, String licenseReverse, String certificatedFLCC, String proofAddress, int status, int version, String txUser, String txHost, Date txDate, int personId) {
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
        this.personId = personId;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    // toString
    @Override
    public String toString() {
        return "DocumentsDTO{" +
                "id=" + id +
                ", ciFront='" + ciFront + '\'' +
                ", ciReverse='" + ciReverse + '\'' +
                ", licenseFront='" + licenseFront + '\'' +
                ", licenseReverse='" + licenseReverse + '\'' +
                ", certificatedFLCC='" + certificatedFLCC + '\'' +
                ", proofAddress='" + proofAddress + '\'' +
                ", status=" + status +
                ", version=" + version +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate=" + txDate +
                ", personId=" + personId +
                '}';
    }
}
