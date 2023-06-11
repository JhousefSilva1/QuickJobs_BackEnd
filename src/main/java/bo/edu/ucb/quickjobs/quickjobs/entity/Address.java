package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "qj_Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Address_Id_Address")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "qj_Person_qj_Person_Id_Person")
    private Person person;

    @ManyToOne
    @JoinColumn(name = "qj_Country_qj_Country_Id_Country")
    private Country country;

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
    private int status;

    @Column(name = "qj_Address_Version")
    private int version;

    @Column(name = "qj_Address_tx_User")
    private String txUser;

    @Column(name = "qj_Address_tx_Host")
    private String txHost;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "qj_Address_tx_Date")
    private Date txDate;

    // Constructor sin argumentos (obligatorio para JPA)
    public Address() {
    }

    // Constructor con todos los campos
    public Address(Long id, Person person, Country country, String alias, String avenue, String street,
                   String number, String building, String apartment, int status, int version, String txUser,
                   String txHost, Date txDate) {
        this.id = id;
        this.person = person;
        this.country = country;
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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
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
        return "Address [id=" + id + ", person=" + person + ", country=" + country + ", alias=" + alias +
                ", avenue=" + avenue + ", street=" + street + ", number=" + number + ", building=" + building +
                ", apartment=" + apartment + ", status=" + status + ", version=" + version +
                ", txUser=" + txUser + ", txHost=" + txHost + ", txDate=" + txDate + "]";
    }
}
