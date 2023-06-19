package bo.edu.ucb.quickjobs.quickjobs.Persistence.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "qj_Rol")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RolEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Rol_Id_Rol")
    private Long  idRol;

    @Column(name = "qj_Rol_Name_Rol", nullable = false)
    private String nameRol;

    @Column(name = "qj_Rol_Description_Name_Rol", nullable = false)
    private String descriptionNameRol;

    @Column(name = "qj_Rol_Status", nullable = false)
    private boolean status;

    @Column(name = "qj_Rol_Version", nullable = false)
    private int version;

    @Column(name = "qj_Rol_tx_User", nullable = false)
    private String txUser;

    @Column(name = "qj_Rol_tx_Host", nullable = false)
    private String txHost;

    @Column(name = "qj_Rol_tx_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private String txDate;


}
