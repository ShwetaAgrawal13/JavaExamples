package CTSAssessment.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringLC3Equalscolor {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter the document 1 content:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line1 = br.readLine();
        System.out.println("Enter the document 2 content:");
        String line2 = br.readLine();


        if (line1.equals(line2)) {
            System.out.println("Green");

        }
        else if(line1.trim().replaceAll("\\s+", "").equals(line2.trim().replaceAll("\\s+", "")))
            System.out.println("Orange");

        else if(line1.equalsIgnoreCase(line2))
            System.out.println("Blue");
        else
            System.out.println("Red");

    }
}
