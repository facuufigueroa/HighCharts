package com.stackInstance.HighChartDatabase.model;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "usuario")
public class User {

    @Id
    private Long id;
    private String name;
    private String picture;
    private Date date;
    private int number_friends;

    public User() {
    }

    public User(Long id, String name, String picture, Date date, int number_friends) {
        this.id = id;
        this.name = name;
        this.picture = picture;
        this.date = date;
        this.number_friends = number_friends;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumber_friends() {
        return number_friends;
    }

    public void setNumber_friends(int number_friends) {
        this.number_friends = number_friends;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
