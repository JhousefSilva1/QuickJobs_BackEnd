package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
@Entity
@Table(name = "qj_Service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Service")
    private int id;

    @Column(name = "Service")
    private String service;

    @Column(name = "Price_Hour")
    private BigDecimal priceHour;

    @Column(name = "ImageIcon")
    private String imageIcon;

    @Column(name = "qj_Service_Status")
    private int status;

    @Column(name = "qj_Service_tx_user")
    private String user;

    @Column(name = "qj_Service_tx_host")
    private String host;

    @Column(name = "qj_Service_tx_date")
    private Date date;

    // Constructor, getters, and setters

    // Constructors
    public Service() {
    }

    public Service(String service, BigDecimal priceHour, String imageIcon, int status, String user, String host, Date date) {
        this.service = service;
        this.priceHour = priceHour;
        this.imageIcon = imageIcon;
        this.status = status;
        this.user = user;
        this.host = host;
        this.date = date;
    }

    // Getters and Setters
    // ...
}
