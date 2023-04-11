package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Product_activity extends AppCompatActivity {

    private Button buy_1 , buy2, buy3 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        ArrayList<Cart_item> cartItems = new ArrayList<>();

        buy_1 = findViewById(R.id.buy);
        buy2 = findViewById(R.id.buy_2);
        buy3 = findViewById(R.id.buy_3);

        buy_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cart_item newItem = new Cart_item("AIRMAX", "$100", R.drawable.nikebg);
                cartItems.add(newItem);
                Intent intent = new Intent(Product_activity.this, Checkout_activity.class);
                intent.putParcelableArrayListExtra("cart_items", cartItems);
                startActivity(intent);
            }
        });

        buy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cart_item newItem = new Cart_item("AIRMAX", "$120", R.drawable.shoes3);
                cartItems.add(newItem);
                Intent intent = new Intent(Product_activity.this, Checkout_activity.class);
                intent.putParcelableArrayListExtra("cart_items", cartItems);
                startActivity(intent);
            }
        });

        buy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cart_item newItem = new Cart_item("AIRMAX", "$140", R.drawable.shoe2);
                cartItems.add(newItem);
                Intent intent = new Intent(Product_activity.this, Checkout_activity.class);
                intent.putParcelableArrayListExtra("cart_items", cartItems);
                startActivity(intent);
            }
        });



    }
}