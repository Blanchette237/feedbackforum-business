package com.cmr.dev.feedbackforum.business.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cmr.dev.feedbackforum.business.entity.Role;
import com.cmr.dev.feedbackforum.business.tools.FeedbackforumConstantes.FeedbackforumConstantesDAO;
 
@Repository(FeedbackforumConstantesDAO.ROLE_DAO_KEY) 
public interface IRoleRepository extends JpaRepository<Role, Integer> {  

}