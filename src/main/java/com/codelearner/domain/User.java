package com.codelearner.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class User {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String email;
    private String role;
    private String userId;
    private String password;

}
