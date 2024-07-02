package com.cmr.dev.feedbackforum.business.exception;

public class FeedbackforumBusinessException extends Exception {  
	  
	private static final long serialVersionUID = 1L; 

	public FeedbackforumBusinessException(String message, Throwable cause) {
	 super(message, cause);
	}
	public FeedbackforumBusinessException(String message) {
	 super(message);
	}
}