package com.example.home_work_s3_e7.models;


public class HomeModel {
    private Integer image;
    private String text1, text2;

    public HomeModel(Integer image, String text1, String text2) {
        this.image = image;
        this.text1 = text1;
        this.text2 = text2;
    }

    public Integer getImage() {
        return image;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }
}
