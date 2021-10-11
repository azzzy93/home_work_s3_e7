package com.example.home_work_s3_e7.ui.fragments.like_fragment;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.home_work_s3_e7.databinding.ItemRvLikeBinding;
import com.example.home_work_s3_e7.models.LikeModel;

import java.util.ArrayList;

public class LikeAdapter extends RecyclerView.Adapter<LikeAdapter.ViewHolder> {
    private ArrayList<LikeModel>list;

    @SuppressLint("NotifyDataSetChanged")
    public void setList(ArrayList<LikeModel> list) {
        this.list = new ArrayList<>();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRvLikeBinding binding = ItemRvLikeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
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
        private ItemRvLikeBinding binding;

        public ViewHolder(@NonNull ItemRvLikeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(LikeModel likeModel) {
            binding.likeIv1.setImageResource(likeModel.getImage1());
            binding.likeIv2.setImageResource(likeModel.getImage2());
            binding.likeTv1.setText(likeModel.getText1());
            binding.likeTv2.setText(likeModel.getText2());
        }
    }
}
