package com.stackInstance.HighChartDatabase.repository;



import com.stackInstance.HighChartDatabase.model.Comment;
import com.stackInstance.HighChartDatabase.model.User;
import com.stackInstance.HighChartDatabase.model.UserLikesDislikesDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Integer> {

    @Query(" SELECT u.name, SUM(c.number_likes) as totalLikes, SUM(c.number_dislikes) as totalDislike FROM Comment c INNER JOIN User as u on c.user.id = u.id GROUP BY u.id, u.name ")
    List<UserLikesDislikesDTO> getLikesAndDislikesPerUser();


     @Query("SELECT c.date, SUM(c.number_likes), SUM(c.number_dislikes) FROM Comment c GROUP BY c.date")
     List<Object[]> getLikesAndDislikesByDate();

    @Query("SELECT c.date, SUM(c.number_likes) AS totalLikes, SUM(c.number_dislikes) AS totalDislikes " +
            "FROM Comment c " +
            "WHERE c.date = :filterDate " +
            "GROUP BY c.date")
    List<Object[]> getLikesAndDislikesByDate(@Param("filterDate") Date filterDate);
}
