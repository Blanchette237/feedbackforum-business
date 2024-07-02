
package com.cmr.dev.feedbackforum.business.dto; 
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
//import 
public class FeedbackBasicDTO  implements IDTO  {

  	private Integer feedId;

	
	private String description;	

	private Date updatedDate;	

	private Date generatedDate;	
//Properties 

  
	public Integer getFeedId() {
		 return feedId;
	}
 
	public String getDescription() {
		return description;
	}
	
	public Date getUpdatedDate() {
		return updatedDate;
	}
	
	public Date getGeneratedDate() {
		return generatedDate;
	}
	//Getters 

  
	public void setFeedId(Integer feedId) {
		 this.feedId = feedId;
	}

 	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return feedId;
	}

	@Override
	public void setId(Integer feedId) {
		// TODO Auto-generated method stub
		
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	
	public void setGeneratedDate(Date generatedDate) {
		this.generatedDate = generatedDate;
	}

	//Setters 

 }