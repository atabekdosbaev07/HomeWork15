package com.company;

public class Car {
    private int id;
    private int number;
    private String auto;

    public Car(int id, int number, String auto) {
        this.id = id;
        this.number = number;
        this.auto = auto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", number=" + number +
                ", auto='" + auto + '\'' +
                '}';
    }
}
