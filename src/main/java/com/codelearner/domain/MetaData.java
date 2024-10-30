package com.codelearner.domain;

import lombok.Data;

import java.util.List;

@Data
public class MetaData {

	private String questionId;
	private String description;
	private String language;
	private String title;
	private Integer adminId;
	private String adminUserName;
	private List<String> participants;
	private String answeredBy;
	private String feedback;
	private String rating;
	private String grade;
	private String reference;

}
