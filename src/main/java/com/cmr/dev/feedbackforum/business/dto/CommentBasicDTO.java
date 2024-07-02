
package com.cmr.dev.feedbackforum.business.dto; 
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
//import 
public class CommentBasicDTO  implements IDTO  {

  	private Integer commentId;

	
	private String description;	

	private Date createdDate;	

	private Date updatedDate;	
//Properties 

  
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
	//Getters 

  
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

	//Setters 

 }