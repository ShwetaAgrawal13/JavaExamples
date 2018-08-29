package CTSAssessment.OopsConcept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PortMain {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter the number of ports");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Port port = new Port();
        List<Port> portList = new ArrayList<Port>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the port" + (i+1) + " details");

            int id = Integer.parseInt(br.readLine());
            String name = br.readLine();
            String x;

            System.out.println("Is the port from same country[Y/N]");
            x = br.readLine();

            if (x.equals("Y")) {
                portList.add(new Port(id, name));
            } else {
                System.out.println("Enter the country");
                String country = br.readLine();
                portList.add(new Port(id, name, country));
            }

        }
        System.out.println("The port details are");

        System.out.format("%-15s %-15s %-15s\n", "Id", "Name", "Country");
        for (int i = 0; i < n; i++) {
            System.out.println(portList.get(i).toString());
        }
    }
}