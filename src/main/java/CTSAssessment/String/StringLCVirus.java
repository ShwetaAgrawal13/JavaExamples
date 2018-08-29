package CTSAssessment.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringLCVirus {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter the file content:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        System.out.println("Enter the virus keyword:");
        String virus = br.readLine();


        if (line.trim().contains(virus)) {
            System.out.println("Virus " + virus + " is present");

        }
        else
            System.out.println("Virus " + virus + " is not present");


    }
}
