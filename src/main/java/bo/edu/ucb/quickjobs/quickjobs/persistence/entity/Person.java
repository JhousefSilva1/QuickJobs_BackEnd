package bo.edu.ucb.quickjobs.quickjobs.persistence.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "qj_Person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Person_Id_Person")
    private Integer personId;

    @Column(name = "qj_User_qj_User_Id_User")
    private Integer userId;

    @Column(name = "qj_Person_Names")
    private String names;

    @Column(name = "qj_Person_Surnames")
    private String surnames;

    @Column(name = "qj_Person_Born")
    private String born;

    @Column(name = "qj_Person_Dni")
    private String dni;

    @Column(name = "qj_Person_Email")
    private String email;

    @Column(name = "qj_Person_ImgProfile")
    private String imgProfile;

    @Column(name = "qj_Person_CellPhone")
    private String cellPhone;

    @Column(name = "qj_Person_Status")
    private Integer status;

    @Column(name = "qj_Person_Version")
    private Integer version;

    @Column(name = "qj_Person_tx_User")
    private String user;

    @Column(name = "qj_Person_tx_Host")
    private String host;

    @Column(name = "qj_Person_tx_Date")
    private Date date;

    //this section is for the DataBase relationship


    @OneToOne
    @JoinColumn(name = "qj_User_qj_User_Id_User", insertable = false, updatable = false)
    private User users;
    //
    @OneToOne
    @JoinColumn(name = "qj_Person_qj_Person_Id_Person", insertable = false, updatable = false)
    private Documents documents;

    //
    @OneToMany(mappedBy = "person")
    private List<Address> addresses;

    @OneToMany(mappedBy = "person")
    private List<GroupPerson> groupPersons;

    @OneToMany(mappedBy = "person")
    private List<Request> requests;

    public Person() {
    }

    public Person(Integer userId, String names, String surnames, String born, String dni, String email, String imgProfile, String cellPhone, Integer status, Integer version, String user, String host, Date date) {
        this.userId = userId;
        this.names = names;
        this.surnames = surnames;
        this.born = born;
        this.dni = dni;
        this.email = email;
        this.imgProfile = imgProfile;
        this.cellPhone = cellPhone;
        this.status = status;
        this.version = version;
        this.user = user;
        this.host = host;
        this.date = date;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", userId=" + userId +
                ", names='" + names + '\'' +
                ", surnames='" + surnames + '\'' +
                ", born='" + born + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", imgProfile='" + imgProfile + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", status=" + status +
                ", version=" + version +
                ", user='" + user + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                '}';
    }
}
