package com.example.home_work_s3_e7.data;

import com.example.home_work_s3_e7.R;
import com.example.home_work_s3_e7.models.HomeModel;

import java.util.ArrayList;

public class HomeData {
    private ArrayList<HomeModel>list;

    public ArrayList<HomeModel> getList() {
        this.list = new ArrayList<>();
        list.add(new HomeModel(R.drawable.img_home_1, "joshua_l The game in Japan was amazing and I want to share some photos",
                "September 19"));
        list.add(new HomeModel(R.drawable.cat, "azzzy93 This is Tom",
                "September 10"));
        list.add(new HomeModel(R.drawable.fasol, "mark_sup What is it?",
                "September 8"));
        list.add(new HomeModel(R.drawable.forel, "masha.brad Fish.",
                "September 3"));
        list.add(new HomeModel(R.drawable.goroh, "kris GOROH! GOROH!",
                "September 1"));
        return list;
    }

}
