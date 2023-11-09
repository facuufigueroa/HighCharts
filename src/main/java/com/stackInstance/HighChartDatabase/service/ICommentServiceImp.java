package com.stackInstance.HighChartDatabase.service;


import com.stackInstance.HighChartDatabase.model.Comment;
import com.stackInstance.HighChartDatabase.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ICommentServiceImp  {

    @Autowired
    public CommentRepository commentRepository;

    public List<Comment> getAllComments()
    {
        return commentRepository.findAll();
    }

}
