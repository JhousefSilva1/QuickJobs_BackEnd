package bo.edu.ucb.quickjobs.quickjobs.Persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "qj_Service")
public class ServiceeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Servide_Id_Service")
    private Long  idService;

    @Column(name = "qj_Service_Name_Service", nullable = false)
    private String nameService;

    @Column(name = "qj_Service_Description_Name_Service", nullable = false)
    private String descriptionNameService;

    @Column(name = "qj_Service_Pricehourbase", nullable = false)
    private int priceHourBase;

    @Column(name = "qj_Service_Imagenicon", nullable = false)
    private String imageIcon;

    @Column(name = "qj_Service_Status", nullable = false)
    private boolean status;

    @Column(name = "qj_Service_Version", nullable = false)
    private int version;

    @Column(name = "qj_Service_tx_User", nullable = false)
    private String txUser;

    @Column(name = "qj_Service_tx_Host", nullable = false)
    private String txHost;

    @Column(name = "qj_Service_tx_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private String txDate;


}
