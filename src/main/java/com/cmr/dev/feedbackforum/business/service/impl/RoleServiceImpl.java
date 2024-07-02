package com.cmr.dev.feedbackforum.business.service.impl;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
import com.cmr.dev.feedbackforum.business.dao.IRoleRepository;
import com.cmr.dev.feedbackforum.business.service.IRoleService;
import com.cmr.dev.feedbackforum.business.dto.RoleBasicDTO;
import com.cmr.dev.feedbackforum.business.dto.RoleMediumDTO;
import com.cmr.dev.feedbackforum.business.dto.RoleFullDTO;
import com.cmr.dev.feedbackforum.business.entity.Role;
import com.cmr.dev.feedbackforum.business.tools.FeedbackforumConstantes.FeedbackforumConstantesService;
  @Service("roleService")
public class RoleServiceImpl extends AbstractFeedbackforumServiceImpl<Role, RoleBasicDTO, RoleFullDTO, IRoleRepository> implements IRoleService{ 
 @Autowired
  private IRoleRepository RoleRepository; 
	public RoleServiceImpl() {
  super(Role.class, RoleBasicDTO.class, RoleFullDTO.class); 
  }@Override
 public IRoleRepository getDAO() { return this.RoleRepository; }

	}