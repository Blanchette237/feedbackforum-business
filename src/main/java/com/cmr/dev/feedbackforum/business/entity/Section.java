
package com.cmr.dev.feedbackforum.business.entity; 
import javax.persistence.*;
import java.util.List;
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
 
@Entity 
@Table(name = "section")
public class Section  implements IEntity  {

  
	  
	  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SECTION_ID") 
	private Integer sectionId;

	
	@Column(name = "DESCRIPTION")
	private String description;
	

	@Column(name = "CREATED_DATE")
	private Date createdDate;
	

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;
	

	@Column(name = "TITLE")
	private String title;
	
 
	@OneToMany(mappedBy = "section") 
	private List<Question> questions; 
	@OneToMany(mappedBy = "section") 
	private List<DividedInto> dividedIntos; 

  
	  
	  
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
	
  
	public List<Question> getQuestions() {
		return this.questions;
	 }

  
	public List<DividedInto> getDividedIntos() {
		return this.dividedIntos;
	 }

 

  
	  
	  
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

	
  
	public void setQuestion(List<Question> questions) {
		this.questions = questions;
	 }  
	public void setDividedInto(List<DividedInto> dividedIntos) {
		this.dividedIntos = dividedIntos;
	 } 

 }