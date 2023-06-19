package bo.edu.ucb.quickjobs.quickjobs.Persistence.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "qj_Group_qj_Rol")

public class GroupRolEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Group_qj_Rol_Id_GroupRol")
    private Long  idGroupRol;

    @Column(name = "qj_Group_qj_Group_Id_Group", nullable = false)
    private int groupId;

    @Column(name = "qj_Rol_qj_Rol_Id_Rol", nullable = false)
    private int roleId;

    @Column(name = "qj_Group_qj_Rol_Status", nullable = false)
    private boolean status;

    @Column(name = "qj_Group_qj_Rol_Version", nullable = false)
    private int version;

    @Column(name = "qj_Group_qj_Rol_tx_User", nullable = false)
    private String txUser;

    @Column(name = "qj_Group_qj_Rol_tx_Host", nullable = false)
    private String txHost;

    @Column(name = "qj_Group_qj_Rol_tx_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private String txDate;

//    @ManyToOne
//    @JoinColumn(name = "qj_Group_qj_Group_Id_Group",insertable = false, updatable = false)
//    private GroupEntity group;
//
//    @ManyToOne
//    @JoinColumn(name = "qj_Rol_qj_Rol_Id_Rol",insertable = false, updatable = false)
//    private RolEntity rol;

}
