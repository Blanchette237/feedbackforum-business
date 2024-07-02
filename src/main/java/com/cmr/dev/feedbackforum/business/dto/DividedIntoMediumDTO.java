package com.cmr.dev.feedbackforum.business.dto;
public class DividedIntoMediumDTO  extends DividedIntoBasicDTO {

	private FeedbackBasicDTO feedback;

	private SectionBasicDTO section;

	// Getters and setters

  	public FeedbackBasicDTO getFeedbackBasicDTO() {
		return this.feedback;
	}

 	public void setFeedbackBasicDTO(FeedbackBasicDTO feedbackBasicDTO) {
		this.feedback = feedbackBasicDTO;
	}

  	public SectionBasicDTO getSectionBasicDTO() {
		return this.section;
	}

 	public void setSectionBasicDTO(SectionBasicDTO sectionBasicDTO) {
		this.section = sectionBasicDTO;
	}

}