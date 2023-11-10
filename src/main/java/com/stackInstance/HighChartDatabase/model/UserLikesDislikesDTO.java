package com.stackInstance.HighChartDatabase.model;

public class UserLikesDislikesDTO {
    private String userName;
    private int totalLikes;
    private int totalDislikes;

    public UserLikesDislikesDTO(String userName, int totalLikes, int totalDislikes) {
        this.userName = userName;
        this.totalLikes = totalLikes;
        this.totalDislikes = totalDislikes;
    }

    // Getters y setters

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public int getTotalDislikes() {
        return totalDislikes;
    }

    public void setTotalDislikes(int totalDislikes) {
        this.totalDislikes = totalDislikes;
    }
}
