package bo.edu.ucb.quickjobs.quickjobs.Persistence.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "qj_Person")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Person_Id_Person")
    private Long idPerson;

    @Column(name = "qj_Person_Names", nullable = false)
    private String names;

    @Column(name = "qj_Person_Surnames", nullable = false)
    private String surnames;

    @Column(name = "qj_Person_Dni", nullable = false)
    private String dni;

    @Column(name = "qj_Person_Born", nullable = false)
    private String born;

    @Column(name = "qj_Person_Gender", nullable = false)
    private String gender;

    @Column(name = "qj_Person_Cellphone", nullable = false )
    private String cellPhone;

    @Column(name = "qj_Person_Email", nullable = false)
    private String email;

    @Column(name = "qj_Person_Password", nullable = false)
    private String password;

    @Column(name = "qj_Person_ImgProfile")
    private String imgProfile;

    @Column(name = "qj_Person_Account_Type", nullable = false)
    private String accountType;

    @Column(name = "qj_Person_Status", nullable = false)
    private boolean status;

    @Column(name = "qj_Person_Version", nullable = false)
    private int version;

    @Column(name = "qj_Person_tx_User", nullable = false)
    private String txUser;

    @Column(name = "qj_Person_tx_Host", nullable = false)
    private String txHost;

    @Column(name = "qj_Person_tx_Date", nullable = false)
    private String txDate;

//    @JsonBackReference
//    @OneToMany(mappedBy = "person")
//    private List<GroupPersonEntity> person;


    @Override
    public int hashCode() {
        return Objects.hash(idPerson, email, names, surnames, password, cellPhone, status, txDate, txUser, txHost);
    }

}
