
package com.cmr.dev.feedbackforum.business.entity; 
import javax.persistence.*;
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
 
@Entity 
@Table(name = "comment")
public class Comment  implements IEntity  {

  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COMMENT_ID") 
	private Integer commentId;

	
	@Column(name = "DESCRIPTION")
	private String description;
	

	@Column(name = "CREATED_DATE")
	private Date createdDate;
	

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;
	
	@ManyToOne
	@JoinColumn(name = "FEED_ID")
	private Feedback feedback;

	
 

  
	public Integer getCommentId() {
		 return commentId;
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
	   
	public Feedback getFeedback() {
		return this.feedback;
	}
	 
 

  
	public void setCommentId(Integer commentId) {
		 this.commentId = commentId;
	}

 	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return commentId;
	}

	@Override
	public void setId(Integer commentId) {
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

	 
	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}
	
 

 }