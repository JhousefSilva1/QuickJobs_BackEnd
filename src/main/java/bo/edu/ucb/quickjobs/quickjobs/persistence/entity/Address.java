package bo.edu.ucb.quickjobs.quickjobs.persistence.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "qj_Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Address_Id_Address")
    private Integer id;

    @Column(name = "qj_Address_Alias")
    private String alias;

    @Column(name = "qj_Address_Avenue")
    private String avenue;

    @Column(name = "qj_Address_Street")
    private String street;

    @Column(name = "qj_Address_Number")
    private String number;

    @Column(name = "qj_Address_Building")
    private String building;

    @Column(name = "qj_Address_Apartment")
    private String apartment;

    @Column(name = "qj_Address_Status")
    private Integer status;

    @Column(name = "qj_Address_Version")
    private Integer version;

    @Column(name = "qj_Address_tx_User")
    private String user;

    @Column(name = "qj_Address_tx_Host")
    private String host;

    @Column(name = "qj_Address_tx_Date")
    private Date date;

    @Column(name = "qj_Country_qj_Country_Id_Country")
    private Integer countryId;

    //this section is for the DataBase relationship
    @ManyToOne
    @JoinColumn(name = "qj_Address_qj_Person_Id_Person", insertable = false, updatable = false)
    private Person person;


    public Address() {
    }

    public Address(String alias, String avenue, String street, String number, String building, String apartment, Integer status, Integer version, String user, String host, Date date, Integer countryId) {
        this.alias = alias;
        this.avenue = avenue;
        this.street = street;
        this.number = number;
        this.building = building;
        this.apartment = apartment;
        this.status = status;
        this.version = version;
        this.user = user;
        this.host = host;
        this.date = date;
        this.countryId = countryId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", alias='" + alias + '\'' +
                ", avenue='" + avenue + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                ", status=" + status +
                ", version=" + version +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                ", countryId=" + countryId +
                '}';
    }
}
