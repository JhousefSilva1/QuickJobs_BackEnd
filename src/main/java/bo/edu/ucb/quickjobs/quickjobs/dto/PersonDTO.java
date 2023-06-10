package bo.edu.ucb.quickjobs.quickjobs.dto;

import java.util.Date;

public class PersonDTO {

    private Long idPerson;
    private String username;
    private String token;
    private String refreshToken;
    private Date txDate;
    private String txHost;
    private String txUser;
    private int version;
    private int status;
    private String cellPhone;
    private String imgProfile;
    private String email;
    private String dni;
    private String born;
    private String password;
    private String surnames;
    private String names;

    public PersonDTO() {
    }

    public PersonDTO(Long idPerson, String username, String token, String refreshToken, Date txDate, String txHost, String txUser, int version, int status, String cellPhone, String imgProfile, String email, String dni, String born, String password, String surnames, String names) {
        this.idPerson = idPerson;
        this.username = username;
        this.token = token;
        this.refreshToken = refreshToken;
        this.txDate = txDate;
        this.txHost = txHost;
        this.txUser = txUser;
        this.version = version;
        this.status = status;
        this.cellPhone = cellPhone;
        this.imgProfile = imgProfile;
        this.email = email;
        this.dni = dni;
        this.born = born;
        this.password = password;
        this.surnames = surnames;
        this.names = names;
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public String getTxUser() {
        return txUser;
    }

    public void setTxUser(String txUser) {
        this.txUser = txUser;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(String imgProfile) {
        this.imgProfile = imgProfile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "PersonaDTO{" +
                "idPerson=" + idPerson +
                ", username='" + username + '\'' +
                ", token='" + token + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                ", txDate=" + txDate +
                ", txHost='" + txHost + '\'' +
                ", txUser='" + txUser + '\'' +
                ", version=" + version +
                ", status=" + status +
                ", cellPhone='" + cellPhone + '\'' +
                ", imgProfile='" + imgProfile + '\'' +
                ", email='" + email + '\'' +
                ", dni='" + dni + '\'' +
                ", born='" + born + '\'' +
                ", password='" + password + '\'' +
                ", surnames='" + surnames + '\'' +
                ", names='" + names + '\'' +
                '}';
    }
}
