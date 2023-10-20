package com.eltex;

public class Coordinates {


    double lat;
    double Long; //пишу с большой буквы, потому что Java воспринимает Long как тип данных

    public double getLat() {
        return lat;
    }

    public double getLong() {
        return Long;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLong(double aLong) {
        Long = aLong;
    }
}
