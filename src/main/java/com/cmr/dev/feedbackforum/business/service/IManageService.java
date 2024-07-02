package com.cmr.dev.feedbackforum.business.service;
 
import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
import com.cmr.dev.feedbackforum.business.dao.IManageRepository;
import com.cmr.dev.feedbackforum.business.dto.ManageBasicDTO;
import com.cmr.dev.feedbackforum.business.dto.ManageMediumDTO;
import com.cmr.dev.feedbackforum.business.dto.ManageFullDTO;
import com.cmr.dev.feedbackforum.business.entity.Manage;
  
public interface IManageService extends IAbstractFeedbackforumService<Manage, ManageBasicDTO, ManageFullDTO, IManageRepository> { 

	}