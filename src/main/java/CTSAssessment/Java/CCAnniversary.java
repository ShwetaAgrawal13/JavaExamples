package CTSAssessment.Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CCAnniversary {
    public static void main(String[] args) throws IOException {

        int nuCustomer;

        int idCount = 0;
        Double max;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        nuCustomer = Integer.parseInt(br.readLine());
        int[] customerId = new int[nuCustomer];
        for (int i = 0; i < nuCustomer; i++) {
            customerId[i] = Integer.parseInt(br.readLine());

        }
        System.out.println("Enter the value of X :");
        int temp = Integer.parseInt(br.readLine());
        List<Integer> tempId=new ArrayList<Integer>();

        for (int i = 0; i < nuCustomer; i++) {
            int count=0;

            for (int j = 0; j < nuCustomer; j++) {
                if (!tempId.contains(customerId[i])  &&  customerId[i] == customerId[j]) {
                    count = count + 1;
                }

            }
            if (count > temp) {
                tempId.add(customerId[i]);

                idCount = idCount + 1;

            }
        }

        System.out.println("The count is " + idCount);


    }
}