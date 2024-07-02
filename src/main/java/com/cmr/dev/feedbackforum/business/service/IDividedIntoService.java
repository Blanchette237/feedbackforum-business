package com.cmr.dev.feedbackforum.business.service;
 
import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
import com.cmr.dev.feedbackforum.business.dao.IDividedIntoRepository;
import com.cmr.dev.feedbackforum.business.dto.DividedIntoBasicDTO;
import com.cmr.dev.feedbackforum.business.dto.DividedIntoMediumDTO;
import com.cmr.dev.feedbackforum.business.dto.DividedIntoFullDTO;
import com.cmr.dev.feedbackforum.business.entity.DividedInto;
  
public interface IDividedIntoService extends IAbstractFeedbackforumService<DividedInto, DividedIntoBasicDTO, DividedIntoFullDTO, IDividedIntoRepository> { 

	}