
package com.cmr.dev.feedbackforum.business.dto; 
import java.lang.Integer;
//import 
public class DividedIntoBasicDTO  implements IDTO  {

  	private static final long serialVersionUID = 1L;
	private Integer id;

	//Properties 

  	@Override
	public Integer getId() {
		 return id;
	}
 //Getters 

	@Override
	public void setId(Integer id) {
		 this.id = id;
	}

 
//Setters 

 }