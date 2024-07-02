package com.cmr.dev.feedbackforum.business.dto;
public class QuestionMediumDTO  extends QuestionBasicDTO {

	private SectionBasicDTO section;

	// Getters and setters

  	public SectionBasicDTO getSectionBasicDTO() {
		return this.section;
	}

 	public void setSectionBasicDTO(SectionBasicDTO sectionBasicDTO) {
		this.section = sectionBasicDTO;
	}

}