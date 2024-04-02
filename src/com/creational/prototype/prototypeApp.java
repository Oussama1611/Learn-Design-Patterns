package com.creational.prototype;

public class prototypeApp {
    public static void main(String[] args) {
        Store store = new Store();
        Item tShirt = new BlueTShirt();

        store.addItem(tShirt);


        store.getItems().forEach(item -> ((TShirt) item).clone());
    }
}
