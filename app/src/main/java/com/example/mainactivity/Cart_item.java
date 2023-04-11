package com.example.mainactivity;

import android.os.Parcel;
import android.os.Parcelable;

public class Cart_item implements Parcelable {
    private String itemName;
    private String itemPrice;
    private int itemImageResId;

    public Cart_item(String itemName, String itemPrice, int itemImageResId) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemImageResId = itemImageResId;
    }

    protected Cart_item(Parcel in) {
        itemName = in.readString();
        itemPrice = in.readString();
        itemImageResId = in.readInt();
    }

    public static final Creator<Cart_item> CREATOR = new Creator<Cart_item>() {
        @Override
        public Cart_item createFromParcel(Parcel in) {
            return new Cart_item(in);
        }

        @Override
        public Cart_item[] newArray(int size) {
            return new Cart_item[size];
        }
    };

    public String getItemName() {
        return itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public int getItemImageResId() {
        return itemImageResId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(itemName);
        dest.writeString(itemPrice);
        dest.writeInt(itemImageResId);
    }
}
