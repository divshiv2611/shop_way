package com.example.shopway.adapters;


import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.shopway.R;
import com.example.shopway.databinding.ItemCategoriesBinding;
import com.example.shopway.model.Category;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    Context context;
    ArrayList<Category> categories;

    public CategoryAdapter(Context context, ArrayList<Category> categories){
        this.context= context;
        this.categories= categories;
    }


    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new CategoryViewHolder(LayoutInflater.from(context).inflate(R.layout.item_categories,viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int i) {
        Category category=categories.get(i);
        categoryViewHolder.binding.lebel.setText(category.getName());
        Glide.with(context)
                .load(category.getIcon())
                .into(categoryViewHolder.binding.image);

        categoryViewHolder.binding.image.setBackgroundColor(Color.parseColor(category.getColor()));
    }

    @Override
    public int getItemCount() {

        return categories.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder{
        ItemCategoriesBinding binding;


        public CategoryViewHolder(@NonNull View itemView) {

            super(itemView);
            binding= ItemCategoriesBinding.bind(itemView);
        }
    }
}
