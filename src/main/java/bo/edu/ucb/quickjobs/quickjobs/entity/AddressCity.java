package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

import java.util.Date;

@Entity
@Table(name = "qj_Address_City")
public class AddressCity {
    @Id
    @Column(name = "qj_Id_Address_City")
    private String id;

    @Column(name = "qj_Address_City_Status")
    private int status;

    @Column(name = "qj_Address_City_tx_user")
    private String user;

    @Column(name = "qj_Address_City_tx_host")
    private String host;

    @Column(name = "qj_Address_City_tx_date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "qj_Address_Id_Address")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "qj_City_id_City")
    private City city;

    // Constructor vacío (requerido por JPA)
    public AddressCity() {
    }

    //Constructor con parámetros
    public AddressCity(String id, int status, String user, String host, Date date, Address address, City city) {
        this.id = id;
        this.status = status;
        this.user = user;
        this.host = host;
        this.date = date;
        this.address = address;
        this.city = city;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
