package com.cmr.dev.feedbackforum.business.dto;
import java.util.List;
 
public class SectionFullDTO extends SectionMediumDTO {

	 	   	   
	private List<QuestionBasicDTO> questions; 
	private List<DividedIntoBasicDTO> dividedIntos;  
	 	   	    
	public List<QuestionBasicDTO> getQuestions() {
		return this.questions;
	 }

  
	public List<DividedIntoBasicDTO> getDividedIntos() {
		return this.dividedIntos;
	 }

   
	
	public void setQuestions(List<QuestionBasicDTO> questions) { 
		this.questions = questions;
	 }
	public void setDividedIntos(List<DividedIntoBasicDTO> dividedIntos) { 
		this.dividedIntos = dividedIntos;
	 }

}