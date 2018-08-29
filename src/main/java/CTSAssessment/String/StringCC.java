package CTSAssessment.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCC {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter the invoice number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String invNo =br.readLine();

        if (invNo.contains("CU"))
        {
            System.out.println("Customer number:"+invNo.substring(2,5) );

        }
        if (invNo.charAt(5)=='A')
        {
             int s=invNo.indexOf("S");
            System.out.println("Agent number:"+invNo.substring(7,s) );
            int e=invNo.indexOf("E");
            System.out.println("Starting port:"+invNo.substring(s+1,e) );
            System.out.println("Ending port:"+invNo.substring(e+1,invNo.length()) );

        }

        else{

        if (invNo.contains("CY"))
        {
            int s=invNo.indexOf("S");

            System.out.println("Company number:"+invNo.substring(7,s) );
            int e=invNo.indexOf("E");

            System.out.println("Starting port:"+invNo.substring(s+1,e) );
            System.out.println("Ending port:"+invNo.substring(e+1,invNo.length()) );


        }

        }
    }
}
