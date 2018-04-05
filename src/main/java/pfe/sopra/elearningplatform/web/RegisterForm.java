package pfe.sopra.elearningplatform.web;

import lombok.Data;

@Data
public class RegisterForm {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassword;
}
