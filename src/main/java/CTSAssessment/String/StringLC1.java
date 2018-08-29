package CTSAssessment.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringLC1 {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter the xml input");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String line;
        String[] token=null;
           line =br.readLine();
            token = line.split("}");


        System.out.format("%-15s %-15s\n","Tag Name","Length");
        String nextToken;
        for (int i=0; i<token.length; i++) {
            String token1 = token[i].trim().replace("{", "");
            String x = String.valueOf(token1.charAt(0));
            //if (token1.charAt(0) != 47) {
            if (!token1.contains("/")) {
                if (!token1.matches("[0-9]+")) {
                       // String token2=token1.replace(",", "");

                    System.out.format("%-15s %-15s\n", token1, token1.length());


                }
            }
        }
    }
    }


