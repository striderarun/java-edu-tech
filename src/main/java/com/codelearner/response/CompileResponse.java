package com.codelearner.response;

import lombok.Data;

import java.util.List;

@Data
public class CompileResponse {

	private List<String> compiledOutput;
	private boolean flag;

}
