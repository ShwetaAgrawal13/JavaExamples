package CTSAssessment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class LCMain {

    public static void main(String[] args ) throws Exception {

         long numberOfDays1=0;
        int count;
        int numOfDays;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of shipment :");
        int nuShipment = Integer.parseInt(br.readLine());
        System.out.println("Enter the shipment details :");
        List<Shipment> shipDetailList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);

        for (int i = 0; i < nuShipment; i++) {
            String[] shipDetail = br.readLine().split(",");

            shipDetailList.add(new Shipment(Integer.parseInt(shipDetail[0]), shipDetail[1],sdf.parse(shipDetail[2]),sdf.parse(shipDetail[3])));

        }
        System.out.println("No of days" + "    " + "No of shipments");

        for (int i = 0; i < 11; i++) {
            count=0;
            for (int j = 0; j < 5; j++) {
                   numberOfDays1 = numberOfDays(shipDetailList.get(j).getDispatchedDate(), shipDetailList.get(j).getReceivedDate());
                if (i==numberOfDays1)
                {
                 count=count+1;
            }

            }
              if(count!=0) {
                  System.out.println( i+ "           " + count);
              }
              else {
                  System.out.println( i+ "           " + "0");

              }
        }
    }
        public static long numberOfDays(Date dispatchedDate, Date receivedDate)
        {
            Date firstDate = dispatchedDate;
            Date secondDate = receivedDate;
            long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
            long numOfDays= TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            return numOfDays;

        }

}
