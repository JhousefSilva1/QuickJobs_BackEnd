package bo.edu.ucb.quickjobs.quickjobs.dto;

import java.util.Date;

public class GroupPersonDTO {

    private int groupPersonId;
    private int groupId;
    private int personId;
    private int status;
    private int version;
    private String txUser;
    private String txHost;
    private Date txDate;

    // Constructor sin argumentos
    public GroupPersonDTO() {
    }

    // Constructor con todos los campos
    public GroupPersonDTO(int groupPersonId, int groupId, int personId, int status, int version, String txUser, String txHost, Date txDate) {
        this.groupPersonId = groupPersonId;
        this.groupId = groupId;
        this.personId = personId;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    // Getters y Setters
    public int getGroupPersonId() {
        return groupPersonId;
    }

    public void setGroupPersonId(int groupPersonId) {
        this.groupPersonId = groupPersonId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
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

    // toString
    @Override
    public String toString() {
        return "GroupPersonDTO{" +
                "groupPersonId=" + groupPersonId +
                ", groupId=" + groupId +
                ", personId=" + personId +
                ", status=" + status +
                ", version=" + version +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate=" + txDate +
                '}';
    }
}
