package com.globomatics.bike.models;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TransportationMode {
    public static void main(String[] args) throws IOException {

        int numberOfPorts;
        Double max;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of ports :");

        numberOfPorts = Integer.parseInt(br.readLine());
        Transportation transportation = new Transportation();
        System.out.println("Enter port details :");

        List<Transportation> transportationList = new ArrayList<Transportation>();
        for (int i = 0; i < numberOfPorts; i++) {
            transportation = new Transportation();

            String test = br.readLine();
            String[] temp = test.toString().split("\\|");
            transportation.setId(Integer.parseInt(temp[0]));
            transportation.setCity(temp[1]);
            transportation.setMode(temp[2] + temp[3] + temp[4]);
            transportationList.add(transportation);
        }
    List<Transportation> result =new ArrayList<Transportation>();

        for(Transportation transportation1:transportationList){

            if(transportation1.mode.equals("100")||transportation1.mode.equals("010")||transportation1.mode.equals("001"))
            {
              result.add(transportation1);
            }
        }

        if (result.size() > 0) {
            System.out.println("One mode of transportation :\n" + "Id  " + "Name");

            for (int i = 0; i < result.size(); i++)

            {
                System.out.println(result.get(i).id + " " + result.get(i).city);
            }
        }
        else
            System.out.println("One mode of transportation :\n" + "No such transportation available");
        result.clear();
        for(Transportation transportation1:transportationList){

            if(transportation1.mode.equals("011")||transportation1.mode.equals("110")||transportation1.mode.equals("101")|| transportation1.mode.equals("111"))
            {
                result.add(transportation1);
            }
        }
        if (result.size() > 0) {

            System.out.println("More than one mode of transportation :\n" + "Id  " + "Name");

            for (int i = 0; i < result.size(); i++)

            {
                System.out.println(result.get(i).id + " " + result.get(i).city);
            }
        }else
            System.out.println("More than one mode of transportation :\n" + "No such transportation available");

        result.clear();


        for(Transportation transportation1:transportationList){

            if(transportation1.mode.equals("000"))
            {
                result.add(transportation1);
            }
        }

        if (result.size() > 0) {

            {
                System.out.println("No transportation in any port");
            }
        }
    }
}











