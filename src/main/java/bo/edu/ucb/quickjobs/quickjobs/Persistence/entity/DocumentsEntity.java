package bo.edu.ucb.quickjobs.quickjobs.Persistence.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "qj_Documents")


public class DocumentsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Documents_Id_Documents")
    private Long  idDocuments;

    @Column(name = "qj_Documents_CI_Front", nullable = false)
    private String ciFront;

    @Column(name = "qj_Documents_CI_Reverse", nullable = false)
    private String ciReverse;

    @Column(name = "qj_Documents_License_Front")
    private String licenseFront;

    @Column(name = "qj_Document_License_Back")
    private String licenseBack;

    @Column(name = "qj_Documents_Proof_Home")
    private String proofHome;

    @Column(name = "qj_Documents_Police_Records")
    private String policeRecords;

    @Column(name = "qj_Documents_Status", nullable = false)
    private boolean status;

    @Column(name = "qj_Documents_Version", nullable = false)
    private int version;

    @Column(name = "qj_Documents_tx_User", nullable = false)
    private String txUser;

    @Column(name = "qj_Documents_tx_Host", nullable = false)
    private String txHost;

    @Column(name = "qj_Documents_tx_Date", nullable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private String txDate;

    @OneToOne
    @JoinColumn(name = "qj_Person_qj_Person_Id_Person", updatable = false, insertable = false)
    private PersonEntity person;




}
