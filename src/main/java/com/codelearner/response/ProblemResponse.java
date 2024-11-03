package com.codelearner.response;

import com.codelearner.domain.MetaData;
import lombok.Data;

@Data
public class ProblemResponse {

	private String problemId;
	private MetaData metadata;

}
