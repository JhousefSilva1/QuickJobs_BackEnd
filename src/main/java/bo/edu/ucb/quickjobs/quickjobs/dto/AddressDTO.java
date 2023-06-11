package bo.edu.ucb.quickjobs.quickjobs.dto;

import java.util.Date;

public class AddressDTO {

    private int id;
    private int personId;
    private int countryId;
    private String alias;
    private String avenue;
    private String street;
    private String number;
    private String building;
    private String apartment;
    private int status;
    private int version;
    private String txUser;
    private String txHost;
    private Date txDate;

    // Constructor sin argumentos
    public AddressDTO() {
    }

    // Constructor con todos los campos
    public AddressDTO(int id, int personId, int countryId, String alias, String avenue, String street, String number,
                      String building, String apartment, int status, int version, String txUser, String txHost, Date txDate) {
        this.id = id;
        this.personId = personId;
        this.countryId = countryId;
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

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
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
        return "AddressDTO{" +
                "id=" + id +
                ", personId=" + personId +
                ", countryId=" + countryId +
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
