package bo.edu.ucb.quickjobs.quickjobs.Service.dto;

import lombok.Data;

@Data
public class LoginDto {

    private String email;
    private String password;
    private String AccountType;
}
