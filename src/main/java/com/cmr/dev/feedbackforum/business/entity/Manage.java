
package com.cmr.dev.feedbackforum.business.entity; 
import javax.persistence.*;
import java.lang.Integer;
 
@Entity 
@Table(name = "manage")
public class Manage  implements IEntity  {

  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID") 
	private Integer id;

		@ManyToOne
	@JoinColumn(name = "FEED_ID")
	private Feedback feedback;

	
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;

	
 

 
    
	public Feedback getFeedback() {
		return this.feedback;
	}
	    
	public User getUser() {
		return this.user;
	}
	 
 

   

 	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(Integer id) {
		 this.id = id;
		
	}
 
	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}
	 
	public void setUser(User user) {
		this.user = user;
	}
	
 

 }