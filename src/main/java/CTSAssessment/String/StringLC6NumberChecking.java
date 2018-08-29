package CTSAssessment.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringLC6NumberChecking {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter the generated booking id");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine().trim();

            if(line1.matches("[0-9]+"))
            {
                System.out.println("Generated booking id is valid ");

            }
            else
                System.out.println("Generated booking id is not valid");


        }




}
