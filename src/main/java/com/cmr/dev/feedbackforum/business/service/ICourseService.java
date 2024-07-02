package com.cmr.dev.feedbackforum.business.service;
 
import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
import com.cmr.dev.feedbackforum.business.dao.ICourseRepository;
import com.cmr.dev.feedbackforum.business.dto.CourseBasicDTO;
import com.cmr.dev.feedbackforum.business.dto.CourseMediumDTO;
import com.cmr.dev.feedbackforum.business.dto.CourseFullDTO;
import com.cmr.dev.feedbackforum.business.entity.Course;
  
public interface ICourseService extends IAbstractFeedbackforumService<Course, CourseBasicDTO, CourseFullDTO, ICourseRepository> { 

	}