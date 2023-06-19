package bo.edu.ucb.quickjobs.quickjobs.Persistence.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "qj_Group")
public class GroupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Group_Id_Group")
    private Long  idGroup;

    @Column(name = "qj_Group_Name_Group", nullable = false)
    private String groupName;

    @Column(name = "qj_Group_Description_Name_Group", nullable = false)
    private String groupDescription;

    @Column(name = "qj_Group_Status", nullable = false)
    private boolean status;

    @Column(name = "qj_Group_Version", nullable = false)
    private int version;

    @Column(name = "qj_Group_tx_User", nullable = false)
    private String txUser;

    @Column(name = "qj_Group_tx_Host", nullable = false)
    private String txHost;

    @Column(name = "qj_Group_tx_Date", nullable = false)
    //@Temporal(TemporalType.TIMESTAMP)
    private String txDate;

//    @JsonBackReference
//    @OneToMany(mappedBy = "group")
//    private List<GroupPersonEntity> group;



}
