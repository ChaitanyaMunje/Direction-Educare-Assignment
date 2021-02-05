package com.gtappdevelopers.directioneducareassignment.Modal;

public class InterestModal {

    private int imgId;
    private String title;
    private int backgroundColor;

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public InterestModal(int imgId, String title, int backgroundColor) {
        this.imgId = imgId;
        this.title = title;
        this.backgroundColor = backgroundColor;
    }
}
