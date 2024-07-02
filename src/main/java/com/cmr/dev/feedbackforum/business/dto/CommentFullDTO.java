package com.cmr.dev.feedbackforum.business.dto;
import java.util.List;
 
public class CommentFullDTO extends CommentMediumDTO {

	 	   
	private List<FeedbackBasicDTO> feedbacks;  
	 	    
	public List<FeedbackBasicDTO> getFeedbacks() {
		return this.feedbacks;
	 }

   
	
	public void setFeedbacks(List<FeedbackBasicDTO> feedbacks) { 
		this.feedbacks = feedbacks;
	 }

}