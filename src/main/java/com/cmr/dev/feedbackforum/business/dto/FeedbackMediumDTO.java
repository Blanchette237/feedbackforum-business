package com.cmr.dev.feedbackforum.business.dto;
public class FeedbackMediumDTO  extends FeedbackBasicDTO {

	private CommentBasicDTO comment;

	private CourseBasicDTO course;

	// Getters and setters

  	public CommentBasicDTO getCommentBasicDTO() {
		return this.comment;
	}

 	public void setCommentBasicDTO(CommentBasicDTO commentBasicDTO) {
		this.comment = commentBasicDTO;
	}

  	public CourseBasicDTO getCourseBasicDTO() {
		return this.course;
	}

 	public void setCourseBasicDTO(CourseBasicDTO courseBasicDTO) {
		this.course = courseBasicDTO;
	}

}