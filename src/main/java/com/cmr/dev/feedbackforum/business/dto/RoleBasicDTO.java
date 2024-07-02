
package com.cmr.dev.feedbackforum.business.dto; 
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
//import 
public class RoleBasicDTO  implements IDTO  {

  	private Integer role;

	
	private String description;	

	private Date createdDate;	

	private Date updatedDate;	

	private String type;	
//Properties 

  
	public Integer getRole() {
		 return role;
	}
 
	public String getDescription() {
		return description;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public Date getUpdatedDate() {
		return updatedDate;
	}
	
	public String getType() {
		return type;
	}
	//Getters 

  
	public void setRole(Integer role) {
		 this.role = role;
	}

 	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return role;
	}

	@Override
	public void setId(Integer role) {
		// TODO Auto-generated method stub
		
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	
	public void setType(String type) {
		this.type = type;
	}

	//Setters 

 }