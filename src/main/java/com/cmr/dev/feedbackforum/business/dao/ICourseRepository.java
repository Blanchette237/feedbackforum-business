package com.cmr.dev.feedbackforum.business.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cmr.dev.feedbackforum.business.entity.Course;
import com.cmr.dev.feedbackforum.business.tools.FeedbackforumConstantes.FeedbackforumConstantesDAO;
 
@Repository(FeedbackforumConstantesDAO.COURSE_DAO_KEY) 
public interface ICourseRepository extends JpaRepository<Course, Integer> {  

}