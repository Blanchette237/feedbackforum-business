package com.cmr.dev.feedbackforum.business.service;
 
import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
import com.cmr.dev.feedbackforum.business.dao.IRoleRepository;
import com.cmr.dev.feedbackforum.business.dto.RoleBasicDTO;
import com.cmr.dev.feedbackforum.business.dto.RoleMediumDTO;
import com.cmr.dev.feedbackforum.business.dto.RoleFullDTO;
import com.cmr.dev.feedbackforum.business.entity.Role;
  
public interface IRoleService extends IAbstractFeedbackforumService<Role, RoleBasicDTO, RoleFullDTO, IRoleRepository> { 

	}