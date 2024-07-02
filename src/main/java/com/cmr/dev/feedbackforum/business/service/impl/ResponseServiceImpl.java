package com.cmr.dev.feedbackforum.business.service.impl;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
import com.cmr.dev.feedbackforum.business.dao.IResponseRepository;
import com.cmr.dev.feedbackforum.business.service.IResponseService;
import com.cmr.dev.feedbackforum.business.dto.ResponseBasicDTO;
import com.cmr.dev.feedbackforum.business.dto.ResponseMediumDTO;
import com.cmr.dev.feedbackforum.business.dto.ResponseFullDTO;
import com.cmr.dev.feedbackforum.business.entity.Response;
import com.cmr.dev.feedbackforum.business.tools.FeedbackforumConstantes.FeedbackforumConstantesService;
  @Service("responseService")
public class ResponseServiceImpl extends AbstractFeedbackforumServiceImpl<Response, ResponseBasicDTO, ResponseFullDTO, IResponseRepository> implements IResponseService{ 
 @Autowired
  private IResponseRepository ResponseRepository; 
	public ResponseServiceImpl() {
  super(Response.class, ResponseBasicDTO.class, ResponseFullDTO.class); 
  }@Override
 public IResponseRepository getDAO() { return this.ResponseRepository; }

	}