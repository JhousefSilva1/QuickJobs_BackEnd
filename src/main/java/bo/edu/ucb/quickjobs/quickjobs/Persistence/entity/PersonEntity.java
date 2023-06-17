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

    @JsonBackReference
    @OneToMany(mappedBy = "idPerson")
    private List<PersonEntity> persons;



    //
//
//    public PersonEntity() {
//    }
//
//    public PersonEntity(Long idPerson, String names, String surnames, String dni, String born, String gender, String cellPhone, String email, String password, String imgProfile, boolean status, int version, String txUser, String txHost, String txDate) {
//        this.idPerson = idPerson;
//        this.names = names;
//        this.surnames = surnames;
//        this.dni = dni;
//        this.born = born;
//        this.gender = gender;
//        this.cellPhone = cellPhone;
//        this.email = email;
//        this.password = password;
//        this.imgProfile = imgProfile;
//        this.status = status;
//        this.version = version;
//        this.txUser = txUser;
//        this.txHost = txHost;
//        this.txDate = txDate;
//    }
//
//    public Long getIdPerson() {
//        return idPerson;
//    }
//
//    public void setIdPerson(Long idPerson) {
//        this.idPerson = idPerson;
//    }
//
//    public String getNames() {
//        return names;
//    }
//
//    public void setNames(String names) {
//        this.names = names;
//    }
//
//    public String getSurnames() {
//        return surnames;
//    }
//
//    public void setSurnames(String surnames) {
//        this.surnames = surnames;
//    }
//
//    public String getDni() {
//        return dni;
//    }
//
//    public void setDni(String dni) {
//        this.dni = dni;
//    }
//
//    public String getBorn() {
//        return born;
//    }
//
//    public void setBorn(String born) {
//        this.born = born;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public String getCellPhone() {
//        return cellPhone;
//    }
//
//    public void setCellPhone(String cellPhone) {
//        this.cellPhone = cellPhone;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getImgProfile() {
//        return imgProfile;
//    }
//
//    public void setImgProfile(String imgProfile) {
//        this.imgProfile = imgProfile;
//    }
//
//    public boolean isStatus() {
//        return status;
//    }
//
//    public void setStatus(boolean status) {
//        this.status = status;
//    }
//
//    public int getVersion() {
//        return version;
//    }
//
//    public void setVersion(int version) {
//        this.version = version;
//    }
//
//    public String getTxUser() {
//        return txUser;
//    }
//
//    public void setTxUser(String txUser) {
//        this.txUser = txUser;
//    }
//
//    public String getTxHost() {
//        return txHost;
//    }
//
//    public void setTxHost(String txHost) {
//        this.txHost = txHost;
//    }
//
//    public String getTxDate() {
//        return txDate;
//    }
//
//    public void setTxDate(String txDate) {
//        this.txDate = txDate;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "idPerson=" + idPerson +
//                ", names='" + names + '\'' +
//                ", surnames='" + surnames + '\'' +
//                ", dni='" + dni + '\'' +
//                ", born='" + born + '\'' +
//                ", gender='" + gender + '\'' +
//                ", cellPhone='" + cellPhone + '\'' +
//                ", email='" + email + '\'' +
//                ", password=" + password +
//                ", imgProfile='" + imgProfile + '\'' +
//                ", status=" + status +
//                ", version=" + version +
//                ", txUser='" + txUser + '\'' +
//                ", txHost='" + txHost + '\'' +
//                ", txDate=" + txDate +
//                '}';
//    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PersonEntity person = (PersonEntity) o;
//        return Objects.equals(idPerson, person.idPerson) &&
//                Objects.equals(email, person.email) &&
//                Objects.equals(names, person.names) &&
//                Objects.equals(surnames, person.surnames) &&
//                Objects.equals(password, person.password) &&
//                Objects.equals(cellPhone, person.cellPhone) &&
//                Objects.equals(imgProfile, person.imgProfile)&&
//                Objects.equals(dni, person.dni) &&
//                Objects.equals(version, person.version) &&
//                Objects.equals(born, person.born) &&
//                Objects.equals(status, person.status) &&
//                Objects.equals(txDate, person.txDate) &&
//                Objects.equals(txUser, person.txUser) &&
//                Objects.equals(txHost, person.txHost);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(idPerson, email, names, surnames, password, cellPhone, status, txDate, txUser, txHost);
    }

}
