package com.cmr.dev.feedbackforum.business.dto;
public class CommentMediumDTO  extends CommentBasicDTO {

	private FeedbackBasicDTO feedback;

	// Getters and setters

  	public FeedbackBasicDTO getFeedbackBasicDTO() {
		return this.feedback;
	}

 	public void setFeedbackBasicDTO(FeedbackBasicDTO feedbackBasicDTO) {
		this.feedback = feedbackBasicDTO;
	}

}