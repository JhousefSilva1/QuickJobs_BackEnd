package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "qj_Request_Quality")
public class RequestQuality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Reques_Quality")
    private int id;

    @Column(name = "qj_Request_Quality_Status")
    private int status;

    @Column(name = "qj_Request_Quality_tx_user")
    private String user;

    @Column(name = "qj_Request_Quality_tx_host")
    private String host;

    @Column(name = "qj_Request_Quality_tx_date")
    private Date date;

    @Column(name = "qj_Request_Id_Request")
    private int requestId;

    @Column(name = "qj_Quality_id_Quality")
    private int qualityId;

    // Constructor, getters, and setters

    // Constructors
    public RequestQuality() {
    }

    public RequestQuality(int status, String user, String host, Date date, int requestId, int qualityId) {
        this.status = status;
        this.user = user;
        this.host = host;
        this.date = date;
        this.requestId = requestId;
        this.qualityId = qualityId;
    }

    // Getters and Setters
    // ...
}
