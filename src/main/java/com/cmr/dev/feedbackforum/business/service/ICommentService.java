package com.cmr.dev.feedbackforum.business.service;
 
import com.cmr.dev.feedbackforum.business.exception.FeedbackforumBusinessException;
import com.cmr.dev.feedbackforum.business.dao.ICommentRepository;
import com.cmr.dev.feedbackforum.business.dto.CommentBasicDTO;
import com.cmr.dev.feedbackforum.business.dto.CommentMediumDTO;
import com.cmr.dev.feedbackforum.business.dto.CommentFullDTO;
import com.cmr.dev.feedbackforum.business.entity.Comment;
  
public interface ICommentService extends IAbstractFeedbackforumService<Comment, CommentBasicDTO, CommentFullDTO, ICommentRepository> { 

	}