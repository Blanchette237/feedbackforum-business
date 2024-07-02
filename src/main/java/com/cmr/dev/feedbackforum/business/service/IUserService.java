package com.cmr.dev.feedbackforum.business.service;
 
import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
import com.cmr.dev.feedbackforum.business.dao.IUserRepository;
import com.cmr.dev.feedbackforum.business.dto.UserBasicDTO;
import com.cmr.dev.feedbackforum.business.dto.UserMediumDTO;
import com.cmr.dev.feedbackforum.business.dto.UserFullDTO;
import com.cmr.dev.feedbackforum.business.entity.User;
  
public interface IUserService extends IAbstractFeedbackforumService<User, UserBasicDTO, UserFullDTO, IUserRepository> { 

	}