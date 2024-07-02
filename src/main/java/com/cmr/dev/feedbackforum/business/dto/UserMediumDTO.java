package com.cmr.dev.feedbackforum.business.dto;
public class UserMediumDTO  extends UserBasicDTO {

	private RoleBasicDTO role;

	// Getters and setters

  	public RoleBasicDTO getRoleBasicDTO() {
		return this.role;
	}

 	public void setRoleBasicDTO(RoleBasicDTO roleBasicDTO) {
		this.role = roleBasicDTO;
	}

}