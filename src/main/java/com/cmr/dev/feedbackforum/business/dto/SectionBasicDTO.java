
package com.cmr.dev.feedbackforum.business.dto; 
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
//import 
public class SectionBasicDTO  implements IDTO  {

  	private Integer sectionId;

	
	private String description;	

	private Date createdDate;	

	private Date updatedDate;	

	private String title;	
//Properties 

  
	public Integer getSectionId() {
		 return sectionId;
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
	
	public String getTitle() {
		return title;
	}
	//Getters 

  
	public void setSectionId(Integer sectionId) {
		 this.sectionId = sectionId;
	}

 	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return sectionId;
	}

	@Override
	public void setId(Integer sectionId) {
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

	
	public void setTitle(String title) {
		this.title = title;
	}

	//Setters 

 }