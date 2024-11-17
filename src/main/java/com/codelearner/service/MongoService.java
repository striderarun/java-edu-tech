package com.codelearner.service;

import com.codelearner.domain.Problem;
import com.codelearner.request.FileSaveRequest;
import com.codelearner.request.UpdateRequest;
import com.codelearner.response.ProblemResponse;

import java.util.List;

public interface MongoService {

	
	List<String> fetchCode(String id, String criteria);

	List<String> fetchAutoGraderCode(String questionId);

	String saveCodeFile(FileSaveRequest fileSaveRequest, String userRole);

	Problem fetchFilesById(String id);

	List<ProblemResponse> fetchProblemsByLanguage(String language);

	List<ProblemResponse> fetchReferenceProblemsByLanguage(String language);

	List<Problem> fetchAnswersforQuestion(String id);

	void updateFeedbackAndRating(UpdateRequest updateRequest);

	void updateGrade(String answerId, String grade);

}
