
package com.cmr.dev.feedbackforum.business.entity; 
import javax.persistence.*;
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
 
@Entity 
@Table(name = "response")
public class Response  implements IEntity  {

  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "RESPONSE_ID") 
	private Integer responseId;

	
	@Column(name = "DESCRIPTION")
	private String description;
	

	@Column(name = "CREATED_DATE")
	private Date createdDate;
	

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;
	
	@ManyToOne
	@JoinColumn(name = "QUESTION_ID")
	private Question question;

	
 

  
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
	   
	public Question getQuestion() {
		return this.question;
	}
	 
 

  
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

	 
	public void setQuestion(Question question) {
		this.question = question;
	}
	
 

 }