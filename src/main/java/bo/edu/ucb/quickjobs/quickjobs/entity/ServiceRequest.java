package bo.edu.ucb.quickjobs.quickjobs.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "qj_Service_Request")
public class ServiceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Service_Request")
    private int id;

    @Column(name = "qj_Service_Request_Status")
    private int status;

    @Column(name = "qj_Service_Request_tx_user")
    private String user;

    @Column(name = "qj_Service_Request_tx_host")
    private String host;

    @Column(name = "qj_Service_Request_tx_date")
    private Date date;

    @Column(name = "qj_Service_Id_Service")
    private int serviceId;

    @Column(name = "qj_Request_Id_Request")
    private int requestId;

    // Constructor, getters, and setters

    // Constructors
    public ServiceRequest() {
    }

    public ServiceRequest(int status, String user, String host, Date date, int serviceId, int requestId) {
        this.status = status;
        this.user = user;
        this.host = host;
        this.date = date;
        this.serviceId = serviceId;
        this.requestId = requestId;
    }

    // Getters and Setters
    // ...


}
