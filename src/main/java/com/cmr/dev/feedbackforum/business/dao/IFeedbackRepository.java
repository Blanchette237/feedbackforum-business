package com.cmr.dev.feedbackforum.business.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cmr.dev.feedbackforum.business.entity.Feedback;
import com.cmr.dev.feedbackforum.business.tools.FeedbackforumConstantes.FeedbackforumConstantesDAO;
 
@Repository(FeedbackforumConstantesDAO.FEEDBACK_DAO_KEY) 
public interface IFeedbackRepository extends JpaRepository<Feedback, Integer> {  

}