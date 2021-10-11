package com.example.home_work_s3_e7.ui.fragments.lite_fragment_1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.home_work_s3_e7.data.LiteData1;
import com.example.home_work_s3_e7.databinding.FragmentLite1Binding;

public class LiteFragment1 extends Fragment {
    private LiteData1 data;
    private Lite1Adapter adapter;
    private FragmentLite1Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLite1Binding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycler();
    }

    private void initRecycler() {
        adapter = new Lite1Adapter();
        data = new LiteData1();
        adapter.setList(data.getList());
        binding.rvLite1.setAdapter(adapter);
    }
}