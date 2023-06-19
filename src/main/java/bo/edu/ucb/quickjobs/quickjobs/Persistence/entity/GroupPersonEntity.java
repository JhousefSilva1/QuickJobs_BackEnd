package bo.edu.ucb.quickjobs.quickjobs.Persistence.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "qj_Group_qj_Person")
public class GroupPersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Group_qj_Person_GroupPerson")
    private Long groupPersonId;

    @Column(name = "qj_Group_qj_Group_Id_Group", nullable = false)
    private int groupId;

    @Column(name = "qj_Person_qj_Person_Id_Person", nullable = false)
    private int personId;

    @Column(name = "qj_Group_qj_Person_Status", nullable = false)
    private boolean status;

    @Column(name = "qj_Group_qj_Person_Version", nullable = false)
    private int version;

    @Column(name = "qj_Group_qj_Person_tx_User", nullable = false)
    private String txUser;

    @Column(name = "qj_Group_qj_Person_tx_Host", nullable = false)
    private String txHost;

    @Column(name = "qj_Group_qj_Person_tx_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private String txDate;

    //relationship

//    @ManyToOne
//    @JoinColumn(name = "qj_Person_qj_Person_Id_Person",insertable = false, updatable = false)
//    private PersonEntity person;
//
//    @ManyToOne
//    @JoinColumn(name = "qj_Group_qj_Group_Id_Group",insertable = false, updatable = false)
//    private GroupEntity group;



}
