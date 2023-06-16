package bo.edu.ucb.quickjobs.quickjobs.Persistence.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "qj_Address")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Address_Id_Address")
    private Long  idAddress;


    @Column(name = "qj_Address_City", nullable = false)
    private String city;

    @Column(name = "qj_Address_Alias", nullable = false)
    private String alias;

    @Column(name = "qj_Address_Avenue", nullable = false)
    private String avenue;

    @Column(name = "qj_Address_Street", nullable = false)
    private String street;

    @Column(name = "qj_Address_Number", nullable = false)
    private String number;

    @Column(name = "qj_Address_Building", nullable = false)
    private String building;

    @Column(name = "qj_Address_Apartment", nullable = false)
    private String apartment;

    @Column(name = "qj_Address_Status", nullable = false)
    private boolean status;

    @Column(name = "qj_Address_Version", nullable = false)
    private int version;

    @Column(name = "qj_Address_tx_User", nullable = false)
    private String txUser;

    @Column(name = "qj_Address_tx_Host", nullable = false)
    private String txHost;

    @Column(name = "qj_Address_tx_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private String txDate;

//    @ManyToOne
//    @JoinColumn(name = "qj_Person_qj_Person_Id_Person", referencedColumnName = "qj_Person_Id_Person", insertable = false, updatable = false)
//    private PersonEntity person;
//
//    @OneToMany(mappedBy = "AddressEntity")
//    private List<AddressEntity> addressEntityList;

    public AddressEntity() {
    }

    public AddressEntity(Long  idAddress,/* PersonEntity person,*/ String city, String alias, String avenue, String street, String number, String building, String apartment, boolean status, int version, String txUser, String txHost, String txDate) {
        this.idAddress = idAddress;
        //this.person = person;
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

    public Long  getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Long  idAddress) {
        this.idAddress = idAddress;
    }

//    public PersonEntity getPerson() {
//        return person;
//    }
//
//    public void setPerson(PersonEntity person) {
//        this.person = person;
//    }

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

    public String getTxDate() {
        return txDate;
    }

    public void setTxDate(String txDate) {
        this.txDate = txDate;
    }

    @Override
    public String toString() {
        return "Address{" +
                "idAddress=" + idAddress +
//                ", person=" + person +
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

    // Constructor, getters, and setters...

    // Additional methods...
}
