package com.example.home_work_s3_e7.ui.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import com.example.home_work_s3_e7.R;
import com.example.home_work_s3_e7.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        initNavigation();
    }

    private void initNavigation() {
        navController = Navigation.findNavController(this, R.id.mainContainer);
        NavigationUI.setupWithNavController(binding.mainBottomNav, navController);
    }
}