package CTSAssessment.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StringLC4Substring {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter the email id");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine().trim();
        List<String> valid = new ArrayList<String>();
        valid.add("com");
        valid.add("biz");
        valid.add("net");
        valid.add("org");

            if(valid.contains(line1.substring(line1.length()-3)))
            {
                System.out.println("Valid domain");

            }
            else
                System.out.println("Not a valid domain");


        }




}
