
package com.cmr.dev.feedbackforum.business.entity; 
import javax.persistence.*;
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
 
@Entity 
@Table(name = "course")
public class Course  implements IEntity  {

  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COURSE_ID") 
	private Integer courseId;

	
	@Column(name = "DESCRIPTION")
	private String description;
	

	@Column(name = "CREATED_DATE")
	private Date createdDate;
	

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;
	

	@Column(name = "TITLE")
	private String title;
	
	@ManyToOne
	@JoinColumn(name = "FEED_ID")
	private Feedback feedback;

	
 

  
	public Integer getCourseId() {
		 return courseId;
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
	   
	public Feedback getFeedback() {
		return this.feedback;
	}
	 
 

  
	public void setCourseId(Integer courseId) {
		 this.courseId = courseId;
	}

 	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return courseId;
	}

	@Override
	public void setId(Integer courseId) {
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

	 
	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}
	
 

 }