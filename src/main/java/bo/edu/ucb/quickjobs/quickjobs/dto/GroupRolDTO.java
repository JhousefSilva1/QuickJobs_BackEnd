package bo.edu.ucb.quickjobs.quickjobs.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class GroupRolDTO {

    private int groupRolId;
    private int groupId;

    private int rolId;
    private int status;
    private int version;
    private String txUser;
    private String txHost;
    private Date txDate;

    // Constructor sin argumentos
    public GroupRolDTO() {
    }

    // Constructor con todos los campos
    public GroupRolDTO(int groupRolId, int groupId, int rolId, int status, int version, String txUser, String txHost, Date txDate) {
        this.groupRolId = groupRolId;
        this.groupId = groupId;
        this.rolId = rolId;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    // Getters y Setters
    public int getGroupRolId() {
        return groupRolId;
    }

    public void setGroupRolId(int groupRolId) {
        this.groupRolId = groupRolId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getRolId() {
        return rolId;
    }

    public void setRolId(int rolId) {
        this.rolId = rolId;
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
        return "GroupRolDTO{" +
                "groupRolId=" + groupRolId +
                ", groupId=" + groupId +
                ", rolId=" + rolId +
                ", status=" + status +
                ", version=" + version +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate=" + txDate +
                '}';
    }
}
