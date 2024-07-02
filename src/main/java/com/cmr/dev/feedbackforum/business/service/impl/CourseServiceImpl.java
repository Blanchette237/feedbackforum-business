package com.cmr.dev.feedbackforum.business.service.impl;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
import com.cmr.dev.feedbackforum.business.dao.ICourseRepository;
import com.cmr.dev.feedbackforum.business.service.ICourseService;
import com.cmr.dev.feedbackforum.business.dto.CourseBasicDTO;
import com.cmr.dev.feedbackforum.business.dto.CourseMediumDTO;
import com.cmr.dev.feedbackforum.business.dto.CourseFullDTO;
import com.cmr.dev.feedbackforum.business.entity.Course;
import com.cmr.dev.feedbackforum.business.tools.FeedbackforumConstantes.FeedbackforumConstantesService;
  @Service("courseService")
public class CourseServiceImpl extends AbstractFeedbackforumServiceImpl<Course, CourseBasicDTO, CourseFullDTO, ICourseRepository> implements ICourseService{ 
 @Autowired
  private ICourseRepository CourseRepository; 
	public CourseServiceImpl() {
  super(Course.class, CourseBasicDTO.class, CourseFullDTO.class); 
  }@Override
 public ICourseRepository getDAO() { return this.CourseRepository; }

	}