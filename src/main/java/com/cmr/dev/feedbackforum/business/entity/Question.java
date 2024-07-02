
package com.cmr.dev.feedbackforum.business.entity; 
import javax.persistence.*;
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
 
@Entity 
@Table(name = "question")
public class Question  implements IEntity  {

  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "QUESTION_ID") 
	private Integer questionId;

	
	@Column(name = "DESCRIPTION")
	private String description;
	

	@Column(name = "CREATED_DATE")
	private Date createdDate;
	

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;
	

	@Column(name = "TITLE")
	private String title;
	
	@ManyToOne
	@JoinColumn(name = "SECTION_ID")
	private Section section;

	
 

  
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
	   
	public Section getSection() {
		return this.section;
	}
	 
 

  
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

	 
	public void setSection(Section section) {
		this.section = section;
	}
	
 

 }