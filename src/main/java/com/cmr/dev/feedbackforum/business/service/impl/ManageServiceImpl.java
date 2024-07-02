package com.cmr.dev.feedbackforum.business.service.impl;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
import com.cmr.dev.feedbackforum.business.dao.IManageRepository;
import com.cmr.dev.feedbackforum.business.service.IManageService;
import com.cmr.dev.feedbackforum.business.dto.ManageBasicDTO;
import com.cmr.dev.feedbackforum.business.dto.ManageMediumDTO;
import com.cmr.dev.feedbackforum.business.dto.ManageFullDTO;
import com.cmr.dev.feedbackforum.business.entity.Manage;
import com.cmr.dev.feedbackforum.business.tools.FeedbackforumConstantes.FeedbackforumConstantesService;
  @Service("manageService")
public class ManageServiceImpl extends AbstractFeedbackforumServiceImpl<Manage, ManageBasicDTO, ManageFullDTO, IManageRepository> implements IManageService{ 
 @Autowired
  private IManageRepository ManageRepository; 
	public ManageServiceImpl() {
  super(Manage.class, ManageBasicDTO.class, ManageFullDTO.class); 
  }@Override
 public IManageRepository getDAO() { return this.ManageRepository; }

	}