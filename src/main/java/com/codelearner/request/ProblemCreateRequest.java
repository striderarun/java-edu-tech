package com.codelearner.request;

import lombok.Data;

import java.util.List;

@Data
public class ProblemCreateRequest {

	private List<String> code;
	private List<String> autoGraderCode;
	private String problemDescription;
	private String problemTitle;
	private String language;
	private String questionId;
	private String className;
	private String createdBy;
	private List<String> participants;
	private String answeredBy;
	private String reference;

}
