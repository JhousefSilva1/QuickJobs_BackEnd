package bo.edu.ucb.quickjobs.quickjobs.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "qj_Person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qj_Person_Id_Person")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "qj_User_qj_User_Id_User")
    private User user;

    @ManyToOne
    @JoinColumn(name = "qj_Documents_qj_Documents_Id_Docuement")
    private Document document;

    @Column(name = "qj_Person_Names")
    private String names;

    @Column(name = "qj_Person_Surnames")
    private String surnames;

    @Column(name = "qj_Person_Birth_of_Day")
    private String birthOfDay;

    @Column(name = "qj_Person_Dni")
    private String dni;

    @Column(name = "qj_Person_Img_Profile")
    private String imgProfile;

    @Column(name = "qj_Person_Cellphone")
    private String cellphone;

    @Column(name = "qj_Person_Status")
    private int status;

    @Column(name = "qj_Person_tx_user")
    private String userauth;

    @Column(name = "qj_Person_tx_host")
    private String host;

    @Column(name = "qj_Person_tx_date")
    private Date date;

    @Column(name = "qj_Person_Version")
    private int version;

    public Person() {
        // Constructor vacío
    }

    public Person(User user, Document document, String names, String surnames, String birthOfDay, String dni,
                  String imgProfile, String cellphone, int status, String userauth, String host, Date date, int version) {
        this.user = user;
        this.document = document;
        this.names = names;
        this.surnames = surnames;
        this.birthOfDay = birthOfDay;
        this.dni = dni;
        this.imgProfile = imgProfile;
        this.cellphone = cellphone;
        this.status = status;
        this.userauth = userauth;
        this.host = host;
        this.date = date;
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Document getDocuments() {
        return document;
    }

    public void setDocuments(Document document) {
        this.document = document;
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

    public String getBirthOfDay() {
        return birthOfDay;
    }

    public void setBirthOfDay(String birthOfDay) {
        this.birthOfDay = birthOfDay;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(String imgProfile) {
        this.imgProfile = imgProfile;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUserauth() {
        return userauth;
    }

    public void setUser(String userauth) {
        this.userauth = userauth;
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

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", user=" + user +
                ", documents=" + document +
                ", names='" + names + '\'' +
                ", surnames='" + surnames + '\'' +
                ", birthOfDay='" + birthOfDay + '\'' +
                ", dni=" + dni +
                ", imgProfile='" + imgProfile + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", status=" + status +
                ", userauth='" + userauth + '\'' +
                ", host='" + host + '\'' +
                ", date=" + date +
                ", version=" + version +
                '}';
    }
}
