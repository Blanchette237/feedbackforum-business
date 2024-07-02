package com.cmr.dev.feedbackforum.business.service.impl;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
import com.cmr.dev.feedbackforum.business.dao.IDividedIntoRepository;
import com.cmr.dev.feedbackforum.business.service.IDividedIntoService;
import com.cmr.dev.feedbackforum.business.dto.DividedIntoBasicDTO;
import com.cmr.dev.feedbackforum.business.dto.DividedIntoMediumDTO;
import com.cmr.dev.feedbackforum.business.dto.DividedIntoFullDTO;
import com.cmr.dev.feedbackforum.business.entity.DividedInto;
import com.cmr.dev.feedbackforum.business.tools.FeedbackforumConstantes.FeedbackforumConstantesService;
  @Service("dividedIntoService")
public class DividedIntoServiceImpl extends AbstractFeedbackforumServiceImpl<DividedInto, DividedIntoBasicDTO, DividedIntoFullDTO, IDividedIntoRepository> implements IDividedIntoService{ 
 @Autowired
  private IDividedIntoRepository DividedIntoRepository; 
	public DividedIntoServiceImpl() {
  super(DividedInto.class, DividedIntoBasicDTO.class, DividedIntoFullDTO.class); 
  }@Override
 public IDividedIntoRepository getDAO() { return this.DividedIntoRepository; }

	}