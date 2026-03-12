package com.jobportal.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserDTO {

    @NotBlank(message = "Name cannot be empty")
    private String name;
    @NotBlank(message = "Username cannot be empty")
    @Size(min = 4 , max = 20, message = "Username must be between 4 and 20 character")
    private String username;
     @NotBlank(message = "Email is required")
     @Email(message = "Invalid Email format")
    private String email;
    @NotBlank(message = "Password cannot be empty")
    @Pattern(
            regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$",
            message = "Password must contain uppercase, lowercase, number, special character and minimum 8 characters"
    )
    private String password;

    private String role;

}
