package bo.edu.ucb.quickjobs.quickjobs.entity;

import java.util.Date;

public class RequestPayment {
    private int idRequestPayment;
    private int idPayment;
    private int idRequest;
    private boolean status;
    private int version;
    private String txUser;
    private String txHost;
    private Date txDate;

    public RequestPayment() {
    }

    // Constructor
    public RequestPayment(int idRequestPayment, int idPayment, int idRequest, boolean status, int version,
                          String txUser, String txHost, Date txDate) {
        this.idRequestPayment = idRequestPayment;
        this.idPayment = idPayment;
        this.idRequest = idRequest;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    // Getters and Setters
    public int getIdRequestPayment() {
        return idRequestPayment;
    }

    public void setIdRequestPayment(int idRequestPayment) {
        this.idRequestPayment = idRequestPayment;
    }

    public int getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(int idPayment) {
        this.idPayment = idPayment;
    }

    public int getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
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
        return "RequestPayment{" +
                "idRequestPayment=" + idRequestPayment +
                ", idPayment=" + idPayment +
                ", idRequest=" + idRequest +
                ", status=" + status +
                ", version=" + version +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate=" + txDate +
                '}';
    }
}
