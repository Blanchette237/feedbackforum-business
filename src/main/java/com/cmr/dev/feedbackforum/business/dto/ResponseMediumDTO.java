package com.cmr.dev.feedbackforum.business.dto;
public class ResponseMediumDTO  extends ResponseBasicDTO {

	private QuestionBasicDTO question;

	// Getters and setters

  	public QuestionBasicDTO getQuestionBasicDTO() {
		return this.question;
	}

 	public void setQuestionBasicDTO(QuestionBasicDTO questionBasicDTO) {
		this.question = questionBasicDTO;
	}

}