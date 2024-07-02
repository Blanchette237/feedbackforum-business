package com.cmr.dev.feedbackforum.business.service;
 
import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
import com.cmr.dev.feedbackforum.business.dao.IQuestionRepository;
import com.cmr.dev.feedbackforum.business.dto.QuestionBasicDTO;
import com.cmr.dev.feedbackforum.business.dto.QuestionMediumDTO;
import com.cmr.dev.feedbackforum.business.dto.QuestionFullDTO;
import com.cmr.dev.feedbackforum.business.entity.Question;
  
public interface IQuestionService extends IAbstractFeedbackforumService<Question, QuestionBasicDTO, QuestionFullDTO, IQuestionRepository> { 

	}