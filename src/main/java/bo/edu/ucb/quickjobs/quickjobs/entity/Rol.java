package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "qj_Rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Rol")
    private int id;

    @Column(name = "Rol")
    private String rol;

    @Column(name = "qj_Rol_Status")
    private int status;

    @Column(name = "qj_Rol_tx_user")
    private String user;

    @Column(name = "qj_Rol_tx_host")
    private String host;

    @Column(name = "qj_Rol_tx_date")
    private Date date;

    // Constructor, getters, and setters

    // Constructors
    public Rol() {
    }

    public Rol(String rol, int status, String user, String host, Date date) {
        this.rol = rol;
        this.status = status;
        this.user = user;
        this.host = host;
        this.date = date;
    }

    // Getters and Setters
    // ...
}
