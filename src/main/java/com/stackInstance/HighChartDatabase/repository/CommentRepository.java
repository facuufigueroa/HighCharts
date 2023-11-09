package com.stackInstance.HighChartDatabase.repository;



import com.stackInstance.HighChartDatabase.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Integer> {

}
