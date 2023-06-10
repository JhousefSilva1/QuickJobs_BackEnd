package bo.edu.ucb.quickjobs.quickjobs.dto;

public class CreatePersonDto {

    private String names;
    private String surnames;
    private String born;
    private String dni;
    private String email;
    private String cellphone;
    private String username;
    private String password;

    public CreatePersonDto() {
    }

    public CreatePersonDto(String names, String surnames, String born, String dni, String email, String cellphone, String username, String password) {
        this.names = names;
        this.surnames = surnames;
        this.born = born;
        this.dni = dni;
        this.email = email;
        this.cellphone = cellphone;
        this.username = username;
        this.password = password;
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

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
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

    @Override
    public String toString() {
        return "CreatePersonDto{" +
                "names='" + names + '\'' +
                ", surnames='" + surnames + '\'' +
                ", born='" + born + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
