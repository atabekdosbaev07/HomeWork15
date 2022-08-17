package com.company;

public class CarModel {
    private int yearOfCreate;
    private String model;
    private int price;
    private String color;

    public CarModel(int yearOfCreate, String model, int price, String color) {
        this.yearOfCreate = yearOfCreate;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getYearOfCreate() {
        return yearOfCreate;
    }

    public void setYearOfCreate(int yearOfCreate) {
        this.yearOfCreate = yearOfCreate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nCarModel{" +
                "yearOfCreate=" + yearOfCreate +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                "}\n";
    }
}
