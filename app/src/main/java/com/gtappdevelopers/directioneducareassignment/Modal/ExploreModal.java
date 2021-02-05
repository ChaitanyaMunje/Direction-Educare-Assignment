package com.gtappdevelopers.directioneducareassignment.Modal;

public class ExploreModal {

    private String title;
    private String description;
    private int img;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public ExploreModal(String title, String description, int img) {
        this.title = title;
        this.description = description;
        this.img = img;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
