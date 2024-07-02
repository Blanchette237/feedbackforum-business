package com.cmr.dev.feedbackforum.business.service.impl;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
import com.cmr.dev.feedbackforum.business.dao.IUserRepository;
import com.cmr.dev.feedbackforum.business.service.IUserService;
import com.cmr.dev.feedbackforum.business.dto.UserBasicDTO;
import com.cmr.dev.feedbackforum.business.dto.UserMediumDTO;
import com.cmr.dev.feedbackforum.business.dto.UserFullDTO;
import com.cmr.dev.feedbackforum.business.entity.User;
import com.cmr.dev.feedbackforum.business.tools.FeedbackforumConstantes.FeedbackforumConstantesService;
  @Service("userService")
public class UserServiceImpl extends AbstractFeedbackforumServiceImpl<User, UserBasicDTO, UserFullDTO, IUserRepository> implements IUserService{ 
 @Autowired
  private IUserRepository UserRepository; 
	public UserServiceImpl() {
  super(User.class, UserBasicDTO.class, UserFullDTO.class); 
  }@Override
 public IUserRepository getDAO() { return this.UserRepository; }

	}