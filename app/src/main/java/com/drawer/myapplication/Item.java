package com.drawer.myapplication;

public class Item {
    private String name;
    private float price;
    private String image;
    private String desciption;

    public Item(String name, String image, float price,String description) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.desciption = description;
    }

    public String getDesciption() {
        return desciption;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }
}
