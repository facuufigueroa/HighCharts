package com.stackInstance.HighChartDatabase.repository;


import com.stackInstance.HighChartDatabase.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {


}
