package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import java.util.Date;
//import java.security.Timestamp;

@Entity
@Table(name = "qj_Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Address")
    private Integer id;

    @Column(name = "Street")
    private String street;

    @Column(name = "Avenue")
    private String avenue;

    @Column(name = "Neighbor")
    private String neighbor;

    @Column(name = "Number")
    private String number;

    @Column(name = "Floor")
    private String floor;

    @Column(name = "Apartment_Number")
    private String apartmentNumber;

    @Column(name = "\"References\"")
    private String references;

    @Column(name = "qj_Address_Status")
    private int status;

    @Column(name = "qj_Address_tx_user")
    private String user;

    @Column(name = "qj_Address_tx_host")
    private String host;

    @Column(name = "qj_Address_tx_date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "qj_Person_Id_Person")
    private Person person;

    // Constructor vacío (requerido por JPA)
    public Address() {
    }

    // Constructor con parámetros
    public Address(Integer id, String street, String avenue, String neighbor, String number, String floor, String apartmentNumber, String references, int status, String user, String host, Date date, Person person) {
        this.id = id;
        this.street = street;
        this.avenue = avenue;
        this.neighbor = neighbor;
        this.number = number;
        this.floor = floor;
        this.apartmentNumber = apartmentNumber;
        this.references = references;
        this.status = status;
        this.user = user;
        this.host = host;
        this.date = date;
        this.person = person;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAvenue() {
        return avenue;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}