package trackingPortal.example.Intern_project.DTO;

import lombok.Data;
import trackingPortal.example.Intern_project.Entity.RoleEnum;

@Data
public class RegisterRequest {
    private String name;
    private String email;
    private String password;
    private RoleEnum role;
}
