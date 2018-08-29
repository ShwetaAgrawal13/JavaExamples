package CTSAssessment.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class StringLC8Date {
    String date;

    public static void main(String[] args) throws IOException, ParseException {

        System.out.println("Enter the number of shipments:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Shipment shippingDetail = new Shipment();
        List<Shipment> list = new ArrayList<>();
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter the shipment details:");

        for (int i = 0; i < n; i++) {

            String[] line1 = br.readLine().split(",");

           list.add(new Shipment(line1[0],format.parse(line1[1]),format.parse(line1[2])));

        }
        list.add(shippingDetail);
        System.out.println("Shipments that are arrived on same day:");

        for (int j = 0; j < n; j++) {
          int result= shippingDetail.compareTo(list.get(j).dispatchDate,list.get(j).arrivalDate);
           if(result==0)
           {
               System.out.println(list.get(j).getId());

           }
          //  if (list.get(j)[1].equals(list.get(j)[2])) {

          //  }
        }


    }



}