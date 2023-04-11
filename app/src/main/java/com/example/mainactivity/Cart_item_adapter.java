package com.example.mainactivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Cart_item_adapter extends RecyclerView.Adapter<Cart_item_adapter.ViewHolder> {

    private final ArrayList<Cart_item> cartItems;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView itemImage;
        public TextView itemName;
        public TextView itemPrice;
        public Button deleteButton;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.item_image);
            itemName = itemView.findViewById(R.id.item_name_textview);
            itemPrice = itemView.findViewById(R.id.item_price_textview);
            deleteButton = itemView.findViewById(R.id.delete_button);
        }
    }

    public Cart_item_adapter(ArrayList<Cart_item> cartItems) {
        this.cartItems = cartItems;
    }

    @NonNull
    @Override
    public Cart_item_adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Cart_item currentItem = cartItems.get(position);

        holder.itemImage.setImageResource(currentItem.getItemImageResId());
        holder.itemName.setText(currentItem.getItemName());
        holder.itemPrice.setText(currentItem.getItemPrice());

        holder.deleteButton.setOnClickListener(v -> {
            cartItems.remove(currentItem);
            notifyItemRemoved(position);
        });
    }

    @Override
    public int getItemCount() {
        return cartItems.size();
    }
}
