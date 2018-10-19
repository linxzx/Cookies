package com.etc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.etc.dao.ICommentMapper;
import com.etc.service.ICommentService;


@Service(value = "commentService")
public class CommentServiceImpl implements ICommentService {
	
	@Autowired
	@Qualifier("commentMapper")
	private ICommentMapper commentMapper;

}
