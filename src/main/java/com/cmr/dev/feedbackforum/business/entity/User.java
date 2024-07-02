
package com.cmr.dev.feedbackforum.business.entity; 
import javax.persistence.*;
import java.util.List;
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
 
@Entity 
@Table(name = "user")
public class User  implements IEntity  {

  
	  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID") 
	private Integer userId;

	
	@Column(name = "PASSWORD")
	private String password;
	

	@Column(name = "CREATED_DATE")
	private Date createdDate;
	

	@Column(name = "UPDATED_DATE")
	private Date updatedDate;
	

	@Column(name = "LOGIN")
	private String login;
	

	@Column(name = "SPECIALITY")
	private Integer speciality;
	

	@Column(name = "LEVEL")
	private Integer level;
	

	@Column(name = "FULLNAME")
	private String fullname;
	
	@ManyToOne
	@JoinColumn(name = "ROLE")
	private Role role;

	
 
	@OneToMany(mappedBy = "user") 
	private List<Manage> manages; 

  
	  
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
	   
	public Role getRole() {
		return this.role;
	}
	 
  
	public List<Manage> getManages() {
		return this.manages;
	 }

 

  
	  
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

	 
	public void setRole(Role role) {
		this.role = role;
	}
	
  
	public void setManage(List<Manage> manages) {
		this.manages = manages;
	 } 

 }