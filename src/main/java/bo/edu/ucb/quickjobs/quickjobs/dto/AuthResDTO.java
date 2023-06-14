package bo.edu.ucb.quickjobs.quickjobs.dto;

public class AuthResDTO {

    private String token;
    private String refresh;

    public AuthResDTO() {
    }

    public AuthResDTO(String token, String refresh) {
        this.token = token;
        this.refresh = refresh;
    }

    public String getToken() {
        return token;
    }

    public String getRefresh() {
        return refresh;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setRefresh(String refresh) {
        this.refresh = refresh;
    }

    @Override
    public String toString() {
        return "AuthResDTO{" +
                "token='" + token + '\'' +
                ", refresh='" + refresh + '\'' +
                '}';
    }
}
