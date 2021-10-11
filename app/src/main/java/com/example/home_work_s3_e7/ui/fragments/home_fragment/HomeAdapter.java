package com.example.home_work_s3_e7.ui.fragments.home_fragment;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.home_work_s3_e7.databinding.ItemRvHomeBinding;
import com.example.home_work_s3_e7.models.HomeModel;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    private ArrayList<HomeModel> list;

    @SuppressLint("NotifyDataSetChanged")
    public void setList(ArrayList<HomeModel> list) {
        this.list = new ArrayList<>();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRvHomeBinding binding = ItemRvHomeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemRvHomeBinding binding;

        public ViewHolder(@NonNull ItemRvHomeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(HomeModel homeModel) {
            binding.homeIv1.setImageResource(homeModel.getImage());
            binding.homeTv1.setText(homeModel.getText1());
            binding.homeTv2.setText(homeModel.getText2());
        }
    }
}
