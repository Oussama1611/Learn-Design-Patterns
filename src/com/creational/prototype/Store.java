package com.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Item> items;

    public Store() {
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
