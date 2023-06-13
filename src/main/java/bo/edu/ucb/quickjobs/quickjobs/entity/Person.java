package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "qj_Person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Person_Id_Person")
    private int idPerson;

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

    @Column(name = "qj_Person_CellPhone", nullable = false)
    private String cellPhone;

    @Column(name = "qj_Person_Email", nullable = false)
    private String email;

    @Column(name = "qj_Person_Password", nullable = false)
    private int password;

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
    @Temporal(TemporalType.TIMESTAMP)
    private Date txDate;

    public Person() {
    }

    public Person(int idPerson, String names, String surnames, String dni, String born, String gender, String cellPhone, String email, int password, String imgProfile, boolean status, int version, String txUser, String txHost, Date txDate) {
        this.idPerson = idPerson;
        this.names = names;
        this.surnames = surnames;
        this.dni = dni;
        this.born = born;
        this.gender = gender;
        this.cellPhone = cellPhone;
        this.email = email;
        this.password = password;
        this.imgProfile = imgProfile;
        this.status = status;
        this.version = version;
        this.txUser = txUser;
        this.txHost = txHost;
        this.txDate = txDate;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(String imgProfile) {
        this.imgProfile = imgProfile;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
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
                ", dni='" + dni + '\'' +
                ", born='" + born + '\'' +
                ", gender='" + gender + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                ", imgProfile='" + imgProfile + '\'' +
                ", status=" + status +
                ", version=" + version +
                ", txUser='" + txUser + '\'' +
                ", txHost='" + txHost + '\'' +
                ", txDate=" + txDate +
                '}';
    }


}
