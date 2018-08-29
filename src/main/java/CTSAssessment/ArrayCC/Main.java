package CTSAssessment.ArrayCC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int count = 1;
        int custCount = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] nu = new int[n];
        for (int i = 0; i < n; i++)

        {
            nu[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the value of X :");
        int x = Integer.parseInt(br.readLine());
        int[] temp = new int[n];
        for (int i = 0; i < n; i++)

        {
            count=0;
            for (int j = i; j < n; j++) {
                if (nu[i] == nu[j]) {
                    count = count + 1;

                }

            }
            if (count > x) {
                custCount=custCount+1;

            }
        }


            System.out.println(custCount);

    }
}