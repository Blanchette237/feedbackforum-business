
package com.cmr.dev.feedbackforum.business.dto; 
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
//import 
public class QuestionBasicDTO  implements IDTO  {

  	private Integer questionId;

	
	private String description;	

	private Date createdDate;	

	private Date updatedDate;	

	private String title;	
//Properties 

  
	public Integer getQuestionId() {
		 return questionId;
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

  
	public void setQuestionId(Integer questionId) {
		 this.questionId = questionId;
	}

 	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return questionId;
	}

	@Override
	public void setId(Integer questionId) {
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