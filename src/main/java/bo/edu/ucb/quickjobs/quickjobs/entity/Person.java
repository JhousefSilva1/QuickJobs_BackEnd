package bo.edu.ucb.quickjobs.quickjobs.entity;

import java.util.Date;

public class Person {
    private int idPerson;
    private String names;
    private String surnames;
    private String dni;
    private String born;
    private String gender;
    private String cellPhone;
    private String email;
    private int password;
    private String imgProfile;
    private boolean status;
    private int version;
    private String txUser;
    private String txHost;
    private Date txDate;

    public Person() {
    }

    // Constructor
    public Person(int idPerson, String names, String surnames, String dni, String born, String gender, String cellPhone,
                  String email, int password, String imgProfile, boolean status, int version, String txUser,
                  String txHost, Date txDate) {
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

    // Getters and Setters
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
