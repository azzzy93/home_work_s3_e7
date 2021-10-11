package com.example.home_work_s3_e7.ui.fragments.like_fragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.home_work_s3_e7.data.LikeData;
import com.example.home_work_s3_e7.databinding.FragmentLikeBinding;


public class LikeFragment extends Fragment {
    private LikeAdapter adapter;
    private FragmentLikeBinding binding;
    private LikeData data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLikeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initRecycler();
    }

    private void initRecycler() {
        adapter = new LikeAdapter();
        data = new LikeData();
        adapter.setList(data.getList());
        binding.likeRv.setAdapter(adapter);

    }
}