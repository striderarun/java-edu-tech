package com.codelearner.response;

import lombok.Data;

@Data
public class LoginResponse {

	private String status;
	private String userId;
	private String role;

}
