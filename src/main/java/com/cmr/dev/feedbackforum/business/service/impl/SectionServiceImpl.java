package com.cmr.dev.feedbackforum.business.service.impl;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
import com.cmr.dev.feedbackforum.business.dao.ISectionRepository;
import com.cmr.dev.feedbackforum.business.service.ISectionService;
import com.cmr.dev.feedbackforum.business.dto.SectionBasicDTO;
import com.cmr.dev.feedbackforum.business.dto.SectionMediumDTO;
import com.cmr.dev.feedbackforum.business.dto.SectionFullDTO;
import com.cmr.dev.feedbackforum.business.entity.Section;
import com.cmr.dev.feedbackforum.business.tools.FeedbackforumConstantes.FeedbackforumConstantesService;
  @Service("sectionService")
public class SectionServiceImpl extends AbstractFeedbackforumServiceImpl<Section, SectionBasicDTO, SectionFullDTO, ISectionRepository> implements ISectionService{ 
 @Autowired
  private ISectionRepository SectionRepository; 
	public SectionServiceImpl() {
  super(Section.class, SectionBasicDTO.class, SectionFullDTO.class); 
  }@Override
 public ISectionRepository getDAO() { return this.SectionRepository; }

	}