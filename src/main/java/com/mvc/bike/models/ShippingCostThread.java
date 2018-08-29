package com.mvc.bike.models;

import java.util.*;

public class ShippingCostThread extends Thread {

    private List<Cargo> cargoList;
    private List<Double> priceList =new ArrayList<>();
    private int iter;
    private int i;

    public List<Double> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<Double> priceList) {
        this.priceList = priceList;
    }


    public ShippingCostThread(int i,int n,List<Cargo> cargoList ){
        this.iter=n;
        this.cargoList=cargoList;

    }
    public Double getPrice(String storageType) {
        HashMap<String, Double> priceMap = new HashMap<String, Double>();
        priceMap.put("DRY", 0.90);
        priceMap.put("COLD", 1.85);
        return priceMap.get(storageType);
    }

    @Override
    public void run() {
       for (int j=i; j<iter; j++) {
        priceList.add(cargoList.get(j).getWeight() * getPrice(cargoList.get(j).getStorageType()));
        this.setPriceList(priceList);
          }
    }
}



