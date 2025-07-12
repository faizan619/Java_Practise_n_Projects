package com.crud1.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.crud1.model.Items;

@Service
public class ItemsService {

    List<Items> item = new ArrayList<>(Arrays.asList(
            new Items(101, "watch", 540, true, "Mumbai"),
            new Items(102, "phone", 23000, true, "Borivali"),
            new Items(103, "charger", 21000, false, "Bandra"),
            new Items(104, "notebook", 230, false, "Malad")));

    public List<Items> getItems() {
        return item;
    }

    public Items getItemById(int itemId) {
        for (Items p : item) {
            if (p.getItemId() == itemId) {
                return p;
            }
        }
        return new Items(100, "No Item", 0000, false, "Unknown"); // default if not found
    }

    public void addItem(Items mm){
        item.add(mm);
    }
}
