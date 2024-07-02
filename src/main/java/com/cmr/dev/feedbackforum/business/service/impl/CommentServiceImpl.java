package com.cmr.dev.feedbackforum.business.service.impl;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 
import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
import com.cmr.dev.feedbackforum.business.dao.ICommentRepository;
import com.cmr.dev.feedbackforum.business.service.ICommentService;
import com.cmr.dev.feedbackforum.business.dto.CommentBasicDTO;
import com.cmr.dev.feedbackforum.business.dto.CommentMediumDTO;
import com.cmr.dev.feedbackforum.business.dto.CommentFullDTO;
import com.cmr.dev.feedbackforum.business.entity.Comment;
import com.cmr.dev.feedbackforum.business.tools.FeedbackforumConstantes.FeedbackforumConstantesService;
  @Service("commentService")
public class CommentServiceImpl extends AbstractFeedbackforumServiceImpl<Comment, CommentBasicDTO, CommentFullDTO, ICommentRepository> implements ICommentService{ 
 @Autowired
  private ICommentRepository CommentRepository; 
	public CommentServiceImpl() {
  super(Comment.class, CommentBasicDTO.class, CommentFullDTO.class); 
  }@Override
 public ICommentRepository getDAO() { return this.CommentRepository; }

	}