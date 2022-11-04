package com.example.shopway.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopway.databinding.ItemProductBinding;
import com.example.shopway.model.Product;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>{

    Context context;
    ArrayList<Product> products;

    public ProductAdapter(Context context, ArrayList<Product> products){

    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder{

        ItemProductBinding binding;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            binding= ItemProductBinding.bind(itemView);
        }
    }
}
