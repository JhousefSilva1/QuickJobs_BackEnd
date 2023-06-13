package bo.edu.ucb.quickjobs.quickjobs.entity;

import java.util.Date;

public class Address {
    private int idAddress;
    private int personId;
    private String city;
    private String alias;
    private String avenue;
    private String street;
    private String number;
    private String building;
    private String apartment;
    private boolean status;
    private int version;
    private String txUser;
    private String txHost;
    private Date txDate;

    public Address() {
    }

    // Constructor
    public Address(int idAddress, int personId, String city, String alias, String avenue, String street,
                   String number, String building, String apartment, boolean status, int version,
                   String txUser, String txHost, Date txDate) {
        this.idAddress = idAddress;
        this.personId = personId;
        this.city = city;
        this.alias = alias;
        this.avenue = avenue;
        this.street = street;
        this.number = number;
        this.building = building;
        this.apartment = apartment;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    // Getters and Setters
    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAvenue() {
        return avenue;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
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
        return "Address{" +
                "idAddress=" + idAddress +
                ", personId=" + personId +
                ", city='" + city + '\'' +
                ", alias='" + alias + '\'' +
                ", avenue='" + avenue + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                ", status=" + status +
                ", version=" + version +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate=" + txDate +
                '}';
    }
}


