package CTSAssessment.Collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class MainCC {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter the number of shipment:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<ShipmentCC> shipmentList = new ArrayList<ShipmentCC>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter shipment " + (i + 1) + " details:");
            String[] shipmentLine = br.readLine().split(",");
            shipmentList.add(new ShipmentCC(shipmentLine[0], shipmentLine[2], shipmentLine[1]));

        }

        TreeSet<String> customer = new TreeSet<String>();
        TreeSet<String> agent = new TreeSet<String>();
        System.out.println("Shipment details:");

        System.out.format("%-15s %-15s %s\n", "Shipment name", "Customer name", "Agent name");

        for (int i = 0; i < n; i++) {
            shipmentList.get(i).toString();
            customer.add(shipmentList.get(i).getCustomerName());
            agent.add(shipmentList.get(i).getAgentName());
        }
        System.out.println("Unique customer name:");

        Iterator iter1 =customer.iterator();
        Iterator iter2=agent.iterator();
        while (iter1.hasNext()) {
            System.out.println(iter1.next());
        }
        System.out.println("Unique agent name:");
        while (iter2.hasNext()) {

            System.out.println(iter2.next());

        }
    }
}
