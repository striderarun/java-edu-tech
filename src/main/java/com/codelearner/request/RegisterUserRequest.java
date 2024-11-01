package com.codelearner.request;

import lombok.Data;

@Data
public class RegisterUserRequest {

    private String userId;
    private String password;
    private String firstName;
    private String lastName;
    private String role;
    private String email;
}
