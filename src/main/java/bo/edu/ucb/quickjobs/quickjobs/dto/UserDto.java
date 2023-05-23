package bo.edu.ucb.quickjobs.quickjobs.dto;

public class UserDto {

    private Integer id_user;
    private String user;

    public UserDto() {
    }

    public UserDto(Integer id_user, String user) {
        this.id_user = id_user;
        this.user = user;
    }



    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id_user='" + id_user + '\'' +
                ", user='" + user + '\'' +
                '}';
    }

}
