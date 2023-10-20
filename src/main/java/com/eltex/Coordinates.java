package com.eltex;

public class Coordinates {


    double lat = 1;
    double Long = 1; //пишу с большой буквы, потому что Java воспринимает Long как тип данных

    public double getLat() {
        return lat;
    }

    public double getLong() {
        return Long;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLong(double Long) {
        this.Long = Long;
    }
}
