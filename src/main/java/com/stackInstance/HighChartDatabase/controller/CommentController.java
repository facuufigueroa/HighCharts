package com.stackInstance.HighChartDatabase.controller;


import com.stackInstance.HighChartDatabase.model.Comment;
import com.stackInstance.HighChartDatabase.model.UserLikesDislikesDTO;
import com.stackInstance.HighChartDatabase.service.ICommentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.stream.Collectors;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class CommentController {

    @Autowired
    private ICommentServiceImp commentServiceImp;

    @GetMapping("/pieChart")
    public String gettAllComments(Model model) {
        int totalLikes = commentServiceImp.getAllComments().stream()
                .mapToInt(x -> x.getNumber_likes())
                .sum();

        int totalDislikes = commentServiceImp.getAllComments().stream()
                .mapToInt(x -> x.getNumber_dislikes())
                .sum();
        model.addAttribute("number_likes", totalLikes);
        model.addAttribute("number_dislikes", totalDislikes);
        return "pieChart";
    }
    /*@GetMapping("/pieChart")
    public String gettCommentsByDate(@RequestParam("filterDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate filterDate, Model model) {
        List<Comment> comments = commentServiceImp.getAllComments().stream()
                .filter(comment -> comment.getDate().toLocaleString().equals(filterDate))
                .collect(Collectors.toList());

        int totalLikes = comments.stream().mapToInt(Comment::getNumber_likes).sum();
        int totalDislikes = comments.stream().mapToInt(Comment::getNumber_dislikes).sum();

        model.addAttribute("number_likes", totalLikes);
        model.addAttribute("number_dislikes", totalDislikes);

        return "pieChart";
    }*/







}
