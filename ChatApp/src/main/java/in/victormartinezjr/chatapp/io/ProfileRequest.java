package in.victormartinezjr.chatapp.io;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfileRequest {
    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Email(message = "Please enter a valid email")
    @NotNull(message = "Email cannot be empty")
    private String email;

    @Size(min = 6, message = "Password must be at least 6 characters long")
    private String password;
    @NotBlank(message = "Username cannot be empty")
    private String username;
}
