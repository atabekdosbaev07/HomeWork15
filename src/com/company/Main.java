package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Car,CarModel> car = new HashMap<>();
        car.put(new Car(1,2323,"Tesla"),
                new CarModel(2015,"Model S",7900000,"Red"));
        car.put(new Car(2,4547,"Mercedes"),
                new CarModel(2008,"GBL 200",4635000,"Black"));
        car.put(new Car(3,1243,"Honda"),
                new CarModel(2011,"CR-V III",1288000,"Blue"));

        for(Map.Entry e:car.entrySet()){
            System.out.println(e.getKey() + " " +e.getValue());
        }
    }
}