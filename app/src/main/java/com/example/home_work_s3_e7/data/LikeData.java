package com.example.home_work_s3_e7.data;

import com.example.home_work_s3_e7.R;
import com.example.home_work_s3_e7.models.LikeModel;

import java.util.ArrayList;

public class LikeData {
    private ArrayList<LikeModel> list;

    public ArrayList<LikeModel> getList() {
        list = new ArrayList<>();
        list.add(new LikeModel(R.drawable.img_like_1, R.drawable.img_lite_1, "karennne liked your photo.", "1h"));
        list.add(new LikeModel(R.drawable.img_like_1, R.drawable.img_lite_7, "karennne liked your photo.", "2h"));
        list.add(new LikeModel(R.drawable.img_like_1, R.drawable.img_lite_2, "azzzy93 liked your photo.", "3h"));
        list.add(new LikeModel(R.drawable.img_like_1, R.drawable.img_lite_3, "karennne liked your photo.", "4h"));
        list.add(new LikeModel(R.drawable.img_like_1, R.drawable.img_lite_4, "azzzy93 liked your photo.", "5h"));
        list.add(new LikeModel(R.drawable.img_like_1, R.drawable.img_lite_5, "karennne liked your photo.", "6h"));
        list.add(new LikeModel(R.drawable.img_like_1, R.drawable.img_lite_6, "azzzy93 liked your photo.", "7h"));
        return list;
    }
}
