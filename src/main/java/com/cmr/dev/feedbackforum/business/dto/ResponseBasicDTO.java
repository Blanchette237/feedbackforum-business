
package com.cmr.dev.feedbackforum.business.dto; 
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
//import 
public class ResponseBasicDTO  implements IDTO  {

  	private Integer responseId;

	
	private String description;	

	private Date createdDate;	

	private Date updatedDate;	
//Properties 

  
	public Integer getResponseId() {
		 return responseId;
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
	//Getters 

  
	public void setResponseId(Integer responseId) {
		 this.responseId = responseId;
	}

 	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return responseId;
	}

	@Override
	public void setId(Integer responseId) {
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

	//Setters 

 }