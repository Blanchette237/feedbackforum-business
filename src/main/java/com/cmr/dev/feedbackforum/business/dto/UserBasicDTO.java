
package com.cmr.dev.feedbackforum.business.dto; 
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
//import 
public class UserBasicDTO  implements IDTO  {

  	private Integer userId;

	
	private String password;	

	private Date createdDate;	

	private Date updatedDate;	

	private String login;	

	private Integer speciality;	

	private Integer level;	

	private String fullname;	
//Properties 

  
	public Integer getUserId() {
		 return userId;
	}
 
	public String getPassword() {
		return password;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public Date getUpdatedDate() {
		return updatedDate;
	}
	
	public String getLogin() {
		return login;
	}
	
	public Integer getSpeciality() {
		return speciality;
	}
	
	public Integer getLevel() {
		return level;
	}
	
	public String getFullname() {
		return fullname;
	}
	//Getters 

  
	public void setUserId(Integer userId) {
		 this.userId = userId;
	}

 	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return userId;
	}

	@Override
	public void setId(Integer userId) {
		// TODO Auto-generated method stub
		
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	
	public void setLogin(String login) {
		this.login = login;
	}

	
	public void setSpeciality(Integer speciality) {
		this.speciality = speciality;
	}

	
	public void setLevel(Integer level) {
		this.level = level;
	}

	
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	//Setters 

 }