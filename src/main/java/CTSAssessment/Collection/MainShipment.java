package CTSAssessment.Collection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class MainShipment {
    public static void main(String[] args) throws Exception {

        List<ShipmentEntity> shipmentEntityList =new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of shipment :");

        int nuEntity=Integer.parseInt(br.readLine());
        for(int i=0; i<nuEntity; i++) {
            System.out.println("Enter the shipment entity" +(i+1)+ "details:");
            String[] entity= br.readLine().split(",");
            shipmentEntityList.add(new ShipmentEntity(Integer.parseInt(entity[0]),entity[1],entity[2],entity[3]));

        }

        System.out.format("%-15s %-15s %-15s %s\n","Id","Name","Account number","Identification number");

        ShipmentEntity shipmentEntity =new ShipmentEntity();

        for(int i=0; i<nuEntity; i++) {
         //  int  shipmentEntity.compareTo(shipmentEntityList.get(i));

        }
    }
}