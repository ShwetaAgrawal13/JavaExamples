package com.mvc.bike.models;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CargoMainThread {

public static void main(String[] args ) throws Exception {
    int nuCargo;

    HashMap<String, Double> priceMap = new HashMap<String, Double>();
    priceMap.put("DRY", 0.90);
    priceMap.put("COLD", 1.85);

    System.out.println("Enter the number of Cargo:");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    nuCargo = Integer.parseInt(br.readLine());
    System.out.println("Enter cargo details (id,length,width,weight,cargo type,storage type):");

    List<Cargo> cargoList = new ArrayList<Cargo>();

    for (int i = 0; i < nuCargo; i++) {
        cargoList.add(new Cargo(br.readLine()));
    }
    System.out.println("Price List:");

    int n=cargoList.size()/2;
    int i=0;

    ShippingCostThread thread1=new ShippingCostThread(i,n,cargoList);
        thread1.start();
         i=n;
         n= cargoList.size();
    ShippingCostThread thread2=new ShippingCostThread(i,n,cargoList);
    thread2.start();
    thread2.join();
    for(int k=0; k<thread2.getPriceList().size(); k++) {
        System.out.println(thread2.getPriceList().get(k));
    }
        }


    }



