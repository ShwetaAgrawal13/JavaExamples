package com.globomatics.bike.models;

public class Cargo1 {

    String name;
    String description;
    Double width;
    Double length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public void displayCargoDetails()
    {

        System.out.println("The cargo details are:\n"+"Name : "+this.getName()+"\n"+"Description : "+this.getDescription()+"\n"+"Length : "+this.getLength()+" cm\n"+"Width : "+this.getWidth()+" cm");

    }

        }
