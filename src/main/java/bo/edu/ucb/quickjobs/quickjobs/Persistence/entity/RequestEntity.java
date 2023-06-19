package bo.edu.ucb.quickjobs.quickjobs.Persistence.entity;

import jakarta.persistence.*;
import lombok.*;


import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "qj_Request")
public class RequestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Request_Id_Request")
    private Long  idRequest;

    @Column(name = "qj_Person_qj_Person_Id_Person", nullable = false)
    private int personId;

    @Column(name = "qj_Person_2_qj_Person_Id_Person", nullable = false)
    private int person2Id;

    @Column(name = "qj_Service_qj_Servide_Id_Service", nullable = false)
    private int serviceId;

    @Column(name = "qj_Address_qj_Address_Id_Address", nullable = false)
    private int addressId;

    @Column(name = "qj_Request_Begin_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private String beginDate;

    @Column(name = "qj_Request_End_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private String endDate;

    @Column(name = "qj_Request_Order_Status", nullable = false)
    private int orderStatus;

    @Column(name = "qj_Request_Status", nullable = false)
    private boolean status;

    @Column(name = "qj_Request_Version", nullable = false)
    private int version;

    @Column(name = "qj_Request_tx_User", nullable = false)
    private String txUser;

    @Column(name = "qj_Request_tx_Host", nullable = false)
    private String txHost;

    @Column(name = "qj_Request_tx_Date", nullable = false)
    private String txDate;

    @ManyToOne
    @JoinColumn(name = "qj_Service_qj_Service_Id_Service",insertable = false, updatable = false)
    private ServiceeEntity servicee;

    @ManyToOne
    @JoinColumn(name = "qj_Address_qj_Address_Id_Address",insertable = false, updatable = false)
    private AddressEntity address;

    @ManyToOne
    @JoinColumn(name = "qj_Person_qj_Person_Id_Person",insertable = false, updatable = false)
    private PersonEntity person;

    @ManyToOne
    @JoinColumn(name = "qj_Person_qj_Person_Id_Person",insertable = false, updatable = false)
    private PersonEntity person1;


}
