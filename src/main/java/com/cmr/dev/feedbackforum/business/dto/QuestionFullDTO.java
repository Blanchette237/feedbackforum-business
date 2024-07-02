package com.cmr.dev.feedbackforum.business.dto;
import java.util.List;
 
public class QuestionFullDTO extends QuestionMediumDTO {

	 	   
	private List<ResponseBasicDTO> responses;  
	 	    
	public List<ResponseBasicDTO> getResponses() {
		return this.responses;
	 }

   
	
	public void setResponses(List<ResponseBasicDTO> responses) { 
		this.responses = responses;
	 }

}