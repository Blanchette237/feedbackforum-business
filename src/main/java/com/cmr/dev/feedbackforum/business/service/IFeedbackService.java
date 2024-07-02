package com.cmr.dev.feedbackforum.business.service;
 
import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
import com.cmr.dev.feedbackforum.business.dao.IFeedbackRepository;
import com.cmr.dev.feedbackforum.business.dto.FeedbackBasicDTO;
import com.cmr.dev.feedbackforum.business.dto.FeedbackMediumDTO;
import com.cmr.dev.feedbackforum.business.dto.FeedbackFullDTO;
import com.cmr.dev.feedbackforum.business.entity.Feedback;
  
public interface IFeedbackService extends IAbstractFeedbackforumService<Feedback, FeedbackBasicDTO, FeedbackFullDTO, IFeedbackRepository> { 

	}