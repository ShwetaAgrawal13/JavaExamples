package com.globomatics.bike.models;

public class Transportation {
    int id;
    String city;
    String mode;

public Transportation(String mode)
{
    this.mode=mode;
}

    public Transportation() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }


}
