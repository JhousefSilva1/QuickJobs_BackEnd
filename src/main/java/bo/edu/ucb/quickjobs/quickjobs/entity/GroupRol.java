package bo.edu.ucb.quickjobs.quickjobs.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "qj_Group_qj_Rol")

public class GroupRol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Group_qj_Rol_Id_GroupRol")
    private int idGroupRol;

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
    private Date txDate;

    public GroupRol() {
    }

    // Constructor, getters, and setters...

    // Additional methods...
}
