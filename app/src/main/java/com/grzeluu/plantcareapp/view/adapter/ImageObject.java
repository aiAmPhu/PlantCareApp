package com.grzeluu.plantcareapp.view.adapter;

public class ImageObject {
    private String imageURL;

    public ImageObject(){

    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }


    public ImageObject(String imageURL) {
        this.imageURL = imageURL;
    }
}