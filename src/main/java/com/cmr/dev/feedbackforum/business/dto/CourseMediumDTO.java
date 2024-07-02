package com.cmr.dev.feedbackforum.business.dto;
public class CourseMediumDTO  extends CourseBasicDTO {

	private FeedbackBasicDTO feedback;

	// Getters and setters

  	public FeedbackBasicDTO getFeedbackBasicDTO() {
		return this.feedback;
	}

 	public void setFeedbackBasicDTO(FeedbackBasicDTO feedbackBasicDTO) {
		this.feedback = feedbackBasicDTO;
	}

}