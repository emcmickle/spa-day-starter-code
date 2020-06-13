package org.launchcode.spaday.models;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
    @NotBlank(message = "Username is required")
    @Size(min = 5, max = 15, message = "Username must be 5-15 characters")
    private String userName;
    @Email(message = "Must be a valid email address")
    private String email;
    @NotBlank(message = "Password is required")
    @Size(min=6, message = "Password must be at least 6 characters long")
    private String password;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }



}
