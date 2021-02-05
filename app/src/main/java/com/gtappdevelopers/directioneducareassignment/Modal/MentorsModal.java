package com.gtappdevelopers.directioneducareassignment.Modal;

public class MentorsModal {
    private String imgUrl;
    private String teacherName;
    private String teacherDescription;
    private String likes;
    private int backgroundColor;

    public MentorsModal(String imgUrl, String teacherName, String teacherDescription, String likes, int backgroundColor) {
        this.imgUrl = imgUrl;
        this.teacherName = teacherName;
        this.teacherDescription = teacherDescription;
        this.likes = likes;
        this.backgroundColor = backgroundColor;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherDescription() {
        return teacherDescription;
    }

    public void setTeacherDescription(String teacherDescription) {
        this.teacherDescription = teacherDescription;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}
