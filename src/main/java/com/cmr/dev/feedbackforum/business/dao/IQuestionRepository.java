package com.cmr.dev.feedbackforum.business.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cmr.dev.feedbackforum.business.entity.Question;
import com.cmr.dev.feedbackforum.business.tools.FeedbackforumConstantes.FeedbackforumConstantesDAO;
 
@Repository(FeedbackforumConstantesDAO.QUESTION_DAO_KEY) 
public interface IQuestionRepository extends JpaRepository<Question, Integer> {  

}