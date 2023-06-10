package bo.edu.ucb.quickjobs.quickjobs.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "qj_Person")

public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Person_Id_Person")
    private Long idPerson;

    @Column(name = "qj_Person_Names", nullable = false, length = 500)
    private String names;

    @Column(name = "qj_Person_Surnames", nullable = false, length = 500)
    private String surnames;

    @Column(name = "qj_Person_Username", nullable = false, length = 500)
    private String username;

    @Column(name = "qj_Person_Password", nullable = false, length = 500)
    private String password;

    @Column(name = "qj_Person_Born", nullable = false, length = 500)
    private String born;

    @Column(name = "qj_Person_Dni", nullable = false, length = 500)
    private String dni;

    @Column(name = "qj_Person_Email", nullable = false, length = 500)
    private String email;

    @Column(name = "qj_Person_Imgprofile", nullable = false, length = 500)
    private String imgProfile;

    @Column(name = "qj_Person_Cellphone", nullable = false, length = 500)
    private String cellPhone;

    @Column(name = "qj_Person_Status", nullable = false)
    private int status;

    @Column(name = "qj_Person_Version", nullable = false)
    private int version;

    @Column(name = "qj_Person_tx_User", nullable = false, length = 500)
    private String txUser;

    @Column(name = "qj_Person_tx_Host", nullable = false, length = 500)
    private String txHost;

    @Column(name = "qj_Person_tx_Date", nullable = false)
    private Date txDate;

    public Person() {
        // Constructor vacío necesario para JPA
    }

    public Person(String names, String surnames, String username, String password, String born, String dni,
                  String email, String imgProfile, String cellPhone, int status, int version, String txUser,
                  String txHost, Date txDate) {
        this.names = names;
        this.surnames = surnames;
        this.username = username;
        this.password = password;
        this.born = born;
        this.dni = dni;
        this.email = email;
        this.imgProfile = imgProfile;
        this.cellPhone = cellPhone;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(String imgProfile) {
        this.imgProfile = imgProfile;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getTxUser() {
        return txUser;
    }

    public void setTxUser(String txUser) {
        this.txUser = txUser;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idPerson=" + idPerson +
                ", names='" + names + '\'' +
                ", surnames='" + surnames + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", born='" + born + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", imgProfile='" + imgProfile + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", status=" + status +
                ", version=" + version +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate=" + txDate +
                '}';
    }
}
