package bo.edu.ucb.quickjobs.quickjobs.dto;

public class PersonDto {

    private Integer PersonId;

    private String username;

    public PersonDto() {

    }

    public PersonDto(Integer personId, String username) {
        PersonId = personId;
        this.username = username;
    }

    public Integer getPersonId() {
        return PersonId;
    }

    public void setPersonId(Integer personId) {
        PersonId = personId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "PersonId=" + PersonId +
                ", username='" + username + '\'' +
                '}';
    }
}
