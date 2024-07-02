package com.cmr.dev.feedbackforum.business.dto;
import java.util.List;
 
public class UserFullDTO extends UserMediumDTO {

	 	   
	private List<ManageBasicDTO> manages;  
	 	    
	public List<ManageBasicDTO> getManages() {
		return this.manages;
	 }

   
	
	public void setManages(List<ManageBasicDTO> manages) { 
		this.manages = manages;
	 }

}