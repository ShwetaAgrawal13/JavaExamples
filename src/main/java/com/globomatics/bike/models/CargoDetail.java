package com.globomatics.bike.models;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CargoDetail {

    public static void main(String[] args)  throws IOException {
        Cargo1 cargoObject =new Cargo1();

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the cargo details:");
        System.out.println("Enter the name");
        cargoObject.setName(br.readLine());
        System.out.println("Enter the description");
        cargoObject.setDescription(br.readLine());
        System.out.println("Enter the length");
        cargoObject.setLength(Double.parseDouble(br.readLine()));
        System.out.println("Enter the width");
        cargoObject.setWidth(Double.parseDouble(br.readLine()));
        cargoObject.displayCargoDetails();


    }
}
