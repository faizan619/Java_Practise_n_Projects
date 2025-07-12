package com.crud1.model;

// import org.springframework.stereotype.Component;

// @Component
public class Items {
    
    int itemId;
    String itemName;
    int itemPrice;
    boolean sold;
    String itemPlace;

    public Items(int itemId, String itemName, int itemPrice, boolean sold, String itemPlace) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemPlace = itemPlace;
        this.itemPrice = itemPrice;
        this.sold = sold;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public String getItemPlace() {
        return itemPlace;
    }

    public void setItemPlace(String itemPlace) {
        this.itemPlace = itemPlace;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Items{");
        sb.append("itemId=").append(itemId);
        sb.append(", itemName=").append(itemName);
        sb.append(", itemPrice=").append(itemPrice);
        sb.append(", sold=").append(sold);
        sb.append(", itemPlace=").append(itemPlace);
        sb.append('}');
        return sb.toString();
    }



}
