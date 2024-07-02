package com.cmr.dev.feedbackforum.business.service.impl;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
import com.cmr.dev.feedbackforum.business.dao.IFeedbackRepository;
import com.cmr.dev.feedbackforum.business.service.IFeedbackService;
import com.cmr.dev.feedbackforum.business.dto.FeedbackBasicDTO;
import com.cmr.dev.feedbackforum.business.dto.FeedbackMediumDTO;
import com.cmr.dev.feedbackforum.business.dto.FeedbackFullDTO;
import com.cmr.dev.feedbackforum.business.entity.Feedback;
import com.cmr.dev.feedbackforum.business.tools.FeedbackforumConstantes.FeedbackforumConstantesService;
  @Service("feedbackService")
public class FeedbackServiceImpl extends AbstractFeedbackforumServiceImpl<Feedback, FeedbackBasicDTO, FeedbackFullDTO, IFeedbackRepository> implements IFeedbackService{ 
 @Autowired
  private IFeedbackRepository FeedbackRepository; 
	public FeedbackServiceImpl() {
  super(Feedback.class, FeedbackBasicDTO.class, FeedbackFullDTO.class); 
  }@Override
 public IFeedbackRepository getDAO() { return this.FeedbackRepository; }

	}