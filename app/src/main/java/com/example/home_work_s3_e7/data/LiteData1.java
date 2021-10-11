package com.example.home_work_s3_e7.data;

import com.example.home_work_s3_e7.R;
import com.example.home_work_s3_e7.models.LiteModel1;

import java.util.ArrayList;

public class LiteData1 {
    private ArrayList<LiteModel1>list;

    public ArrayList<LiteModel1> getList() {
        list = new ArrayList<>();
        list.add(new LiteModel1(R.drawable.img_lite_1));
        list.add(new LiteModel1(R.drawable.img_lite_2));
        list.add(new LiteModel1(R.drawable.img_lite_3));
        list.add(new LiteModel1(R.drawable.img_lite_4));
        list.add(new LiteModel1(R.drawable.img_lite_5));
        list.add(new LiteModel1(R.drawable.img_lite_6));
        list.add(new LiteModel1(R.drawable.img_lite_7));
        list.add(new LiteModel1(R.drawable.img_lite_8));
        list.add(new LiteModel1(R.drawable.img_lite_9));
        return list;
    }
}
