package com.stackInstance.HighChartDatabase.model;



import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="comentario")
public class Comment {
    @Id
    private Long id;
    private String content;
    private Date date;
    private int number_likes;
    private int number_dislikes;


    public Comment() {
    }

    public Comment(Long id, String content, Date date, int number_likes, int number_dislikes) {
        this.id = id;
        this.content = content;
        this.date = date;
        this.number_likes = number_likes;
        this.number_dislikes = number_dislikes;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumber_likes() {
        return number_likes;
    }

    public void setNumber_likes(int number_likes) {
        this.number_likes = number_likes;
    }

    public int getNumber_dislikes() {
        return number_dislikes;
    }

    public void setNumber_dislikes(int number_dislikes) {
        this.number_dislikes = number_dislikes;
    }



}
