package com.codelearner.request;

import lombok.Data;

import java.io.File;
import java.util.List;

@Data
public class FileSaveRequest {

	private String questionId;
	private File code;
	private File autoGraderCode;
	private String problemDescription;
	private String problemTitle;
	private String language;
	private String createdBy;
	private List<String> participants;
	private String answeredBy;
	private String reference;

}
