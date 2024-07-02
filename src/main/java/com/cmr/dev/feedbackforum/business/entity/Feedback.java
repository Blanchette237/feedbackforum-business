
package com.cmr.dev.feedbackforum.business.entity; 
import javax.persistence.*;
import java.util.List;
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
 
@Entity 
@Table(name = "feedback")
public class Feedback  implements IEntity  {

  
	  
	  
	  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FEED_ID") 
	private Integer feedId;

	
	@Column(name = "DESCRIPTION")
	private String description;
	

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;
	

	@Column(name = "GENERATED_DATE")
	private Date generatedDate;
	
	@ManyToOne
	@JoinColumn(name = "COMMENT_ID")
	private Comment comment;

	
	@ManyToOne
	@JoinColumn(name = "COURSE_ID")
	private Course course;

	
 
	@OneToMany(mappedBy = "feedback") 
	private List<DividedInto> dividedIntos; 
	@OneToMany(mappedBy = "feedback") 
	private List<Course> courses; 
	@OneToMany(mappedBy = "feedback") 
	private List<Comment> comments; 

  
	  
	  
	  
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
	   
	public Comment getComment() {
		return this.comment;
	}
	    
	public Course getCourse() {
		return this.course;
	}
	 
  
	public List<DividedInto> getDividedIntos() {
		return this.dividedIntos;
	 }

  
	public List<Course> getCourses() {
		return this.courses;
	 }

  
	public List<Comment> getComments() {
		return this.comments;
	 }

 

  
	  
	  
	  
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

	 
	public void setComment(Comment comment) {
		this.comment = comment;
	}
	 
	public void setCourse(Course course) {
		this.course = course;
	}
	
  
	public void setDividedInto(List<DividedInto> dividedIntos) {
		this.dividedIntos = dividedIntos;
	 }  
	public void setCourse(List<Course> courses) {
		this.courses = courses;
	 }  
	public void setComment(List<Comment> comments) {
		this.comments = comments;
	 } 

 }