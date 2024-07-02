package com.cmr.dev.feedbackforum.business.service;
 
import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
import com.cmr.dev.feedbackforum.business.dao.IResponseRepository;
import com.cmr.dev.feedbackforum.business.dto.ResponseBasicDTO;
import com.cmr.dev.feedbackforum.business.dto.ResponseMediumDTO;
import com.cmr.dev.feedbackforum.business.dto.ResponseFullDTO;
import com.cmr.dev.feedbackforum.business.entity.Response;
  
public interface IResponseService extends IAbstractFeedbackforumService<Response, ResponseBasicDTO, ResponseFullDTO, IResponseRepository> { 

	}