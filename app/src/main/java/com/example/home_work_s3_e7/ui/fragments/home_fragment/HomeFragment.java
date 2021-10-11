package com.example.home_work_s3_e7.ui.fragments.home_fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.home_work_s3_e7.data.HomeData;
import com.example.home_work_s3_e7.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    private HomeAdapter adapter;
    private HomeData data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initRecycler();
        initListeners();
    }

    private void initListeners() {
        binding.cameraIvHome.setOnClickListener(view -> {
            startActivity(new Intent(MediaStore.ACTION_IMAGE_CAPTURE));
        });
    }

    private void initRecycler() {
        adapter = new HomeAdapter();
        data = new HomeData();
        adapter.setList(data.getList());
        binding.homeRv.setAdapter(adapter);
    }
}