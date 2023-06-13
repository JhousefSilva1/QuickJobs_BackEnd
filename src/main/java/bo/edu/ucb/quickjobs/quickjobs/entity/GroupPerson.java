package bo.edu.ucb.quickjobs.quickjobs.entity;

import java.util.Date;

public class GroupPerson {
    private int groupPersonId;
    private int groupId;
    private int personId;
    private boolean status;
    private int version;
    private String txUser;
    private String txHost;
    private Date txDate;

    public GroupPerson() {
    }

    // Constructor
    public GroupPerson(int groupPersonId, int groupId, int personId, boolean status, int version, String txUser,
                       String txHost, Date txDate) {
        this.groupPersonId = groupPersonId;
        this.groupId = groupId;
        this.personId = personId;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    // Getters and Setters
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
        return "GroupPerson{" +
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
