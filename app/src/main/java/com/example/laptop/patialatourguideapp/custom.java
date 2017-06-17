package com.example.laptop.patialatourguideapp;

public class custom {

    private int id;
    private String Name = "";
    private String place = "";

    public custom(String a, String b, int c) {
        Name = a;
        place = b;
        id = c;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getplace() {
        return place;
    }
}
