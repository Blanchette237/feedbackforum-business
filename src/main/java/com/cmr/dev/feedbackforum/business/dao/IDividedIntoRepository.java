package com.cmr.dev.feedbackforum.business.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cmr.dev.feedbackforum.business.entity.DividedInto;
import com.cmr.dev.feedbackforum.business.tools.FeedbackforumConstantes.FeedbackforumConstantesDAO;
 
@Repository(FeedbackforumConstantesDAO.DIVIDED_INTO_DAO_KEY) 
public interface IDividedIntoRepository extends JpaRepository<DividedInto, Integer> {  

}