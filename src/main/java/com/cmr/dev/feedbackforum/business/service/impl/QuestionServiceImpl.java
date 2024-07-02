package com.cmr.dev.feedbackforum.business.service.impl;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
import com.cmr.dev.feedbackforum.business.dao.IQuestionRepository;
import com.cmr.dev.feedbackforum.business.service.IQuestionService;
import com.cmr.dev.feedbackforum.business.dto.QuestionBasicDTO;
import com.cmr.dev.feedbackforum.business.dto.QuestionMediumDTO;
import com.cmr.dev.feedbackforum.business.dto.QuestionFullDTO;
import com.cmr.dev.feedbackforum.business.entity.Question;
import com.cmr.dev.feedbackforum.business.tools.FeedbackforumConstantes.FeedbackforumConstantesService;
  @Service("questionService")
public class QuestionServiceImpl extends AbstractFeedbackforumServiceImpl<Question, QuestionBasicDTO, QuestionFullDTO, IQuestionRepository> implements IQuestionService{ 
 @Autowired
  private IQuestionRepository QuestionRepository; 
	public QuestionServiceImpl() {
  super(Question.class, QuestionBasicDTO.class, QuestionFullDTO.class); 
  }@Override
 public IQuestionRepository getDAO() { return this.QuestionRepository; }

	}