package CTSAssessment.OopsConcept;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Oops2ShipmentMain {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter the number of shipments :");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Oops2ShipmentDecimalFormat shipment =new Oops2ShipmentDecimalFormat();

        Oops2ShipmentDecimalFormat[] shipmentList = new Oops2ShipmentDecimalFormat[n];
        //List<Oops2ShipmentDecimalFormat> shipmentList =new ArrayList<Oops2ShipmentDecimalFormat>();
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the shipment "+(i+1)+" details");

            System.out.println("Enter the shipper name :");
            shipment.setShipperName(br.readLine());
            System.out.println("Enter the mode of transportation :");
            shipment.setModeOfTransportation(br.readLine());
            System.out.println("Enter the total weight :");
            String weight=br.readLine();


            shipment.setTotalWeight(Float.parseFloat(weight));
            System.out.println("Enter the arrival port :");
            shipment.setArrivalPort(br.readLine());
            System.out.println("Enter the departure port :");
            shipment.setDeparturePort(br.readLine());
            shipmentList[i]= Oops2ShipmentDecimalFormat.createNewShipment(shipment.getShipperName(), shipment.getModeOfTransportation(), shipment.getTotalWeight(), shipment.getArrivalPort(), shipment.getDeparturePort());
        }
        System.out.println("Shipment details are");
        System.out.println(String.format("%-15s%-15s%-25s%-15s%-20s%s","Id","Shippername","Mode of transportation","Total weight","Arrival port","Departure port") );
        for(int i=0; i<n; i++) {
            System.out.println(shipmentList[i].toString());
        }

    }
}
