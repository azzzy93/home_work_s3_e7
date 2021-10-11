package com.example.home_work_s3_e7.models;

public class LikeModel {
    private Integer image1, image2;
    private String text1, text2;

    public LikeModel(Integer image1, Integer image2, String text1, String text2) {
        this.image1 = image1;
        this.image2 = image2;
        this.text1 = text1;
        this.text2 = text2;
    }

    public Integer getImage1() {
        return image1;
    }

    public Integer getImage2() {
        return image2;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }
}
