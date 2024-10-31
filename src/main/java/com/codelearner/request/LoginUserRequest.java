package com.codelearner.request;

import lombok.Data;

@Data
public class LoginUserRequest {

    private String userId;
    private String password;
}
