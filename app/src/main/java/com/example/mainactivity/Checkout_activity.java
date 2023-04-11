package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Checkout_activity extends AppCompatActivity {

    private ImageView goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        goBack = findViewById(R.id.go_back_categories);


        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Checkout_activity.this,Product_activity.class));
            }
        });


        Intent intent = getIntent();

        ArrayList<Cart_item> cartItems = intent.getParcelableArrayListExtra("cart_items");

        RecyclerView recyclerView = findViewById(R.id.cart_items_recyclerview);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerView.Adapter adapter = new Cart_item_adapter(cartItems);
        recyclerView.setAdapter(adapter);

    }
}