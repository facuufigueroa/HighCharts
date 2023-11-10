package com.stackInstance.HighChartDatabase.controller;

import com.stackInstance.HighChartDatabase.model.Post;
import com.stackInstance.HighChartDatabase.service.IPostServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PostController {

    @Autowired
    private IPostServiceImp postServiceImp;


    @GetMapping("/lineChart")
    public String getPosts() {
        return "lineChart";
    }

}
