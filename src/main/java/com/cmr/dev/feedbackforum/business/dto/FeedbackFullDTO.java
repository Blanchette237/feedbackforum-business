package com.cmr.dev.feedbackforum.business.dto;
import java.util.List;
 
public class FeedbackFullDTO extends FeedbackMediumDTO {

	 	   	   	   	   
	private List<ManageBasicDTO> manages; 
	private List<DividedIntoBasicDTO> dividedIntos; 
	private List<CourseBasicDTO> courses; 
	private List<CommentBasicDTO> comments;  
	 	   	   	   	    
	public List<ManageBasicDTO> getManages() {
		return this.manages;
	 }

  
	public List<DividedIntoBasicDTO> getDividedIntos() {
		return this.dividedIntos;
	 }

  
	public List<CourseBasicDTO> getCourses() {
		return this.courses;
	 }

  
	public List<CommentBasicDTO> getComments() {
		return this.comments;
	 }

   
	
	public void setManages(List<ManageBasicDTO> manages) { 
		this.manages = manages;
	 }
	public void setDividedIntos(List<DividedIntoBasicDTO> dividedIntos) { 
		this.dividedIntos = dividedIntos;
	 }
	public void setCourses(List<CourseBasicDTO> courses) { 
		this.courses = courses;
	 }
	public void setComments(List<CommentBasicDTO> comments) { 
		this.comments = comments;
	 }

}