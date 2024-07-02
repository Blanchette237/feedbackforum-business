package com.cmr.dev.feedbackforum.business.dto;
public class ManageMediumDTO  extends ManageBasicDTO {

	private FeedbackBasicDTO feedback;

	private UserBasicDTO user;

	// Getters and setters

  	public FeedbackBasicDTO getFeedbackBasicDTO() {
		return this.feedback;
	}

 	public void setFeedbackBasicDTO(FeedbackBasicDTO feedbackBasicDTO) {
		this.feedback = feedbackBasicDTO;
	}

  	public UserBasicDTO getUserBasicDTO() {
		return this.user;
	}

 	public void setUserBasicDTO(UserBasicDTO userBasicDTO) {
		this.user = userBasicDTO;
	}

}