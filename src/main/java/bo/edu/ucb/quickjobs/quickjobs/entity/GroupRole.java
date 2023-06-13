package bo.edu.ucb.quickjobs.quickjobs.entity;

import java.util.Date;

public class GroupRole {
    private int idGroupRole;
    private int groupId;
    private int roleId;
    private boolean status;
    private int version;
    private String txUser;
    private String txHost;
    private Date txDate;

    public GroupRole() {
    }

    // Constructor
    public GroupRole(int idGroupRole, int groupId, int roleId, boolean status, int version, String txUser,
                     String txHost, Date txDate) {
        this.idGroupRole = idGroupRole;
        this.groupId = groupId;
        this.roleId = roleId;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    // Getters and Setters
    public int getIdGroupRole() {
        return idGroupRole;
    }

    public void setIdGroupRole(int idGroupRole) {
        this.idGroupRole = idGroupRole;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
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
        return "GroupRole{" +
                "idGroupRole=" + idGroupRole +
                ", groupId=" + groupId +
                ", roleId=" + roleId +
                ", status=" + status +
                ", version=" + version +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate=" + txDate +
                '}';
    }
}
