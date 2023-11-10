package com.stackInstance.HighChartDatabase.service;



import com.stackInstance.HighChartDatabase.model.Post;
import com.stackInstance.HighChartDatabase.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IPostServiceImp{

    @Autowired
    public PostRepository postRepository;

    public List<Post> getAllPost()
    {
        return postRepository.findAll();
    }


}
