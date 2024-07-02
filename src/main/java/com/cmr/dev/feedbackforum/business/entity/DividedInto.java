
package com.cmr.dev.feedbackforum.business.entity; 
import javax.persistence.*;
import java.lang.Integer;
 
@Entity 
@Table(name = "divided_into")
public class DividedInto  implements IEntity  {

  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID") 
	private Integer id;

		@ManyToOne
	@JoinColumn(name = "FEED_ID")
	private Feedback feedback;

	
	@ManyToOne
	@JoinColumn(name = "SECTION_ID")
	private Section section;

	
 

  
    
	public Feedback getFeedback() {
		return this.feedback;
	}
	    
	public Section getSection() {
		return this.section;
	}
	 
 

 

 	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		this.id = id;
	}
 
	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}
	 
	public void setSection(Section section) {
		this.section = section;
	}
	
 

 }