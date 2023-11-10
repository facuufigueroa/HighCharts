package com.stackInstance.HighChartDatabase.service;


import com.stackInstance.HighChartDatabase.model.Comment;
import com.stackInstance.HighChartDatabase.model.UserLikesDislikesDTO;
import com.stackInstance.HighChartDatabase.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ICommentServiceImp  {

    @Autowired
    public CommentRepository commentRepository;

    public List<Comment> getAllComments()
    {
        return commentRepository.findAll();
    }
    public List<UserLikesDislikesDTO> getLikesAndDislikesPerUser() {
        return commentRepository.getLikesAndDislikesPerUser();
    }
    public List<Comment> getLikesAndDislikesByDate() {
        List<Object[]> result = commentRepository.getLikesAndDislikesByDate();
        return result.stream()
                .map(row -> new Comment((Date) row[0], ((Number) row[1]).intValue(), ((Number) row[2]).intValue()))
                .collect(Collectors.toList());
    }
    public List<Object[]> getLikesAndDislikesByDate(Date filterDate) {
        return commentRepository.getLikesAndDislikesByDate(filterDate);
    }

}
