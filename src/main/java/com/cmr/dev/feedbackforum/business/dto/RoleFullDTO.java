package com.cmr.dev.feedbackforum.business.dto;
import java.util.List;
 
public class RoleFullDTO extends RoleMediumDTO {

	 	   
	private List<UserBasicDTO> users;  
	 	    
	public List<UserBasicDTO> getUsers() {
		return this.users;
	 }

   
	
	public void setUsers(List<UserBasicDTO> users) { 
		this.users = users;
	 }

}