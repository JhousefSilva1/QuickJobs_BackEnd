package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "qj_Rol_Group")
public class RolGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_Group_Rol")
    private int id;

    @Column(name = "qj_Rol_Group_Status")
    private int status;

    @Column(name = "qj_Rol_Group_tx_user")
    private String user;

    @Column(name = "qj_Rol_Group_tx_host")
    private String host;

    @Column(name = "qj_Rol_Group_tx_date")
    private Date date;

    @Column(name = "qj_Group_Id_group")
    private int groupId;

    @Column(name = "qj_Rol_id_Rol")
    private int roleId;

    // Constructor, getters, and setters

    // Constructors
    public RolGroup() {
    }

    public RolGroup(int status, String user, String host, Date date, int groupId, int roleId) {
        this.status = status;
        this.user = user;
        this.host = host;
        this.date = date;
        this.groupId = groupId;
        this.roleId = roleId;
    }

    // Getters and Setters
    // ...
}
