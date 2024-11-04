package com.codelearner.request;

import lombok.Data;

@Data
public class UpdateRequest {

	private String answerId;
	private String feedback;
	private String rating;
	private String grade;

}
