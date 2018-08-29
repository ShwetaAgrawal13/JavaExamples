package com.globomatics.bike.models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class currencyCnvn {

    public static void main(String[] args) throws IOException {
        double priceINR;

        Map<String, Double> currency = new HashMap<String, Double>();

        currency.put("US dollar",64.64);
        currency.put("Euro",70.38);
        currency.put("Australian Dollar",47.54);

        System.out.println("1)US dollar - INR\n"+"2)Euro - INR\n"+"3)Australian dollar - INR\n"+"Enter the choice");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int choice = Integer.parseInt(br.readLine());
          DecimalFormat df = new DecimalFormat("#.00");

        if(choice ==1) {
            System.out.println("Enter the shipment cost in US dollar");
            int price= Integer.parseInt(br.readLine());

            priceINR=price*currency.get("US dollar") ;
            System.out.println("INR cost :"+df.format(priceINR));
        }
        if(choice==2)
        {
            System.out.println("Enter the shipment cost in Euro");
            int price= Integer.parseInt(br.readLine());

            priceINR=price*currency.get("Euro") ;
            System.out.println("INR cost :"+df.format(priceINR));
        }
        if(choice==3)
        {
            System.out.println("Enter the shipment cost in Australian dollar");
            int price= Integer.parseInt(br.readLine());

            priceINR=price*currency.get("Australian Dollar") ;
            System.out.println("INR cost :"+df.format(priceINR));
        }
        if(3<choice || choice <0)
        {
            System.out.println("Invalid choice");

        }
        }








}
