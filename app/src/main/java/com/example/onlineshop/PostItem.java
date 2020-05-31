package com.example.onlineshop;

public class PostItem {
    //bellow we can use String variable to store the image if we are loading images from the internet
    private int image;

    public PostItem(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }
}
