package com.codelearner.response;

import lombok.Data;

import java.util.List;

@Data
public class ProblemCode {

	private String problemId;
	private String problemDesc;
	private String problemTitle;
	private List<String> codeLines;
	private String answeredBy;
	private String className;
	private String feedback;
	private String rating;
	private String grade;
	private String reference;

}
