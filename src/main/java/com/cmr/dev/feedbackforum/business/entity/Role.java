
package com.cmr.dev.feedbackforum.business.entity; 
import javax.persistence.*;
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
 
@Entity 
@Table(name = "role")
public class Role  implements IEntity  {

  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ROLE") 
	private Integer role;

	
	@Column(name = "DESCRIPTION")
	private String description;
	

	@Column(name = "CREATED_DATE")
	private Date createdDate;
	

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;
	

	@Column(name = "TYPE")
	private String type;
	
 

  
	public Integer getRole() {
		 return role;
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
	
	public String getType() {
		return type;
	}
	
 

  
	public void setRole(Integer role) {
		 this.role = role;
	}

 	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return role;
	}

	@Override
	public void setId(Integer role) {
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

	
	public void setType(String type) {
		this.type = type;
	}

	
 

 }