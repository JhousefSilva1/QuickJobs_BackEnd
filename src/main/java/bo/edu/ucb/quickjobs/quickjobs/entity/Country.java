package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.Date;

@Entity
@Table(name = "qj_Country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Country")
    private Integer id;

    @Column(name = "Country")
    private String country;

    @Column(name = "Country_Area_Code")
    private String countryAreaCode;

    @Column(name = "qj_Country_Status")
    private int status;

    @Column(name = "qj_Country_tx_user")
    private String user;

    @Column(name = "qj_Country_tx_host")
    private String host;

    @Column(name = "qj_Country_tx_date")
    private Date transactionDate;

    // Constructor vacío (requerido por JPA)
    public Country() {
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryAreaCode() {
        return countryAreaCode;
    }

    public void setCountryAreaCode(String countryAreaCode) {
        this.countryAreaCode = countryAreaCode;
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

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}
