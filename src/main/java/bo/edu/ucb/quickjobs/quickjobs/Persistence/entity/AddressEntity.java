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
@Table(name = "qj_Address")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Address_Id_Address")
    private Long  idAddress;

    @Column(name = "qj_Person_qj_Person_Id_Person", nullable = false)
    private int personId;

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
  //  @Temporal(TemporalType.TIMESTAMP)
    private String txDate;

    @ManyToOne
    @JoinColumn(name = "qj_Person_qj_Person_Id_Person",insertable = false, updatable = false)
    private PersonEntity person;

}
