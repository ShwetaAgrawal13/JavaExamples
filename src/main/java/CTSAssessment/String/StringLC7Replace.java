package CTSAssessment.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringLC7Replace {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter the invoice code");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine().trim();
        StringBuilder builder = new StringBuilder();

            if(line1.contains("CU"))
            {
                String line2=line1.replace("CU", "CUR");
                int temp=Integer.parseInt(line1.substring(2));
                StringBuilder result=builder.append(line2.substring(0,3)).append(String.format("%05d",temp));

                System.out.println("Formated Code :\n"+result);

            }
        if(line1.contains("AT"))
        {
            String line2=line1.replace("AT","AGT");
            int temp=Integer.parseInt(line1.substring(2));
            StringBuilder result=builder.append(line2.substring(0,3)).append(String.format("%05d",temp));

            System.out.println("Formated Code :\n"+result);
        }
        if(line1.contains("CY"))
        {
            String line2=line1.replace("CY","CMY");
            int temp=Integer.parseInt(line1.substring(2));
            StringBuilder result=builder.append(line2.substring(0,3)).append(String.format("%05d",temp));

            System.out.println("Formated Code :\n"+result);
        }



        }




}
