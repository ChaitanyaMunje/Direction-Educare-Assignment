package com.gtappdevelopers.directioneducareassignment.Modal;

public class LookingForModal {
    private int imgId;
    private String messageName;
    private int color;

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public LookingForModal(int imgId, String messageName, int color) {
        this.imgId = imgId;
        this.messageName = messageName;
        this.color = color;
    }
}
