package bo.edu.ucb.quickjobs.quickjobs.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class PersonDTO {

    private int personId;
    @NotEmpty
    @Size(min = 4, message = "El nombre deberaia tener al menos 4 caracteres")
    private String names;
    @NotEmpty
    @Size(min = 4, message = "El apellido deberaia tener al menos 4 caracteres")
    private String surnames;
    @NotEmpty
    @Size(min = 4, message = "El nombre de usuario deberaia tener al menos 4 caracteres")
    private String username;
    @NotEmpty
    @Size(min = 8, message = "La contraseña deberaia tener al menos 8 caracteres")
    private String password;
    private String born;
    @NotEmpty
    @Size(min = 7, message = "El DNI deberaia tener al menos 7 caracteres")
    private String dni;
    @NotEmpty
    @Size(min = 4, message = "El correo deberaia tener al menos 4 caracteres")
    private String email;
    private String imgProfile;
    @NotEmpty
    @Size(min = 8, message = "El numero de celular deberaia tener al menos 8 caracteres")
    private String cellPhone;

    // Constructor sin argumentos
    public PersonDTO() {
    }

    // Constructor con todos los campos
    public PersonDTO(int personId, String names, String surnames, String username, String password,
                     String born, String dni, String email, String imgProfile, String cellPhone) {
        this.personId = personId;
        this.names = names;
        this.surnames = surnames;
        this.username = username;
        this.password = password;
        this.born = born;
        this.dni = dni;
        this.email = email;
        this.imgProfile = imgProfile;
        this.cellPhone = cellPhone;
    }

    // Getter y Setter para personId
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    // Getter y Setter para names
    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    // Getter y Setter para surnames
    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    // Getter y Setter para username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter y Setter para password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Getter y Setter para born
    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    // Getter y Setter para dni
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // Getter y Setter para email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter y Setter para imgProfile
    public String getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(String imgProfile) {
        this.imgProfile = imgProfile;
    }

    // Getter y Setter para cellPhone
    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    // toString
    @Override
    public String toString() {
        return "PersonDTO{" +
                "personId=" + personId +
                ", names='" + names + '\'' +
                ", surnames='" + surnames + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", born='" + born + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", imgProfile='" + imgProfile + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                '}';
    }
}
