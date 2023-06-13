package bo.edu.ucb.quickjobs.quickjobs.dto;



import java.util.Date;

public class PersonDTO {
    private int idPerson;
    private String names;
    private String surnames;
    private String dni;
    private String born;
    private String gender;
    private String cellPhone;
    private String email;
    private String imgProfile;

    public PersonDTO() {
    }

    public PersonDTO(int idPerson, String names, String surnames, String dni, String born, String gender, String cellPhone,
                     String email, String imgProfile) {
        this.idPerson = idPerson;
        this.names = names;
        this.surnames = surnames;
        this.dni = dni;
        this.born = born;
        this.gender = gender;
        this.cellPhone = cellPhone;
        this.email = email;
        this.imgProfile = imgProfile;
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

    public String getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(String imgProfile) {
        this.imgProfile = imgProfile;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "idPerson=" + idPerson +
                ", names='" + names + '\'' +
                ", surnames='" + surnames + '\'' +
                ", dni='" + dni + '\'' +
                ", born='" + born + '\'' +
                ", gender='" + gender + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                ", email='" + email + '\'' +
                ", imgProfile='" + imgProfile + '\'' +
                '}';
    }
}
