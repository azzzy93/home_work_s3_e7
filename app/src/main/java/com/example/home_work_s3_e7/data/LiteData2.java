package com.example.home_work_s3_e7.data;

import com.example.home_work_s3_e7.R;
import com.example.home_work_s3_e7.models.LiteModel2;

import java.util.ArrayList;

public class LiteData2 {
    private ArrayList<LiteModel2>list;

    public ArrayList<LiteModel2> getList() {
        list = new ArrayList<>();
        list.add(new LiteModel2(R.drawable.img_lite_7));
        list.add(new LiteModel2(R.drawable.img_lite_4));
        list.add(new LiteModel2(R.drawable.img_lite_1));
        list.add(new LiteModel2(R.drawable.img_lite_8));
        list.add(new LiteModel2(R.drawable.img_lite_5));
        list.add(new LiteModel2(R.drawable.img_lite_2));
        list.add(new LiteModel2(R.drawable.img_lite_9));
        list.add(new LiteModel2(R.drawable.img_lite_6));
        list.add(new LiteModel2(R.drawable.img_lite_3));
        return list;
    }
}
