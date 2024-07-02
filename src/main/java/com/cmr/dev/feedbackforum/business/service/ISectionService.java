package com.cmr.dev.feedbackforum.business.service;
 
import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
import com.cmr.dev.feedbackforum.business.dao.ISectionRepository;
import com.cmr.dev.feedbackforum.business.dto.SectionBasicDTO;
import com.cmr.dev.feedbackforum.business.dto.SectionMediumDTO;
import com.cmr.dev.feedbackforum.business.dto.SectionFullDTO;
import com.cmr.dev.feedbackforum.business.entity.Section;
  
public interface ISectionService extends IAbstractFeedbackforumService<Section, SectionBasicDTO, SectionFullDTO, ISectionRepository> { 

	}