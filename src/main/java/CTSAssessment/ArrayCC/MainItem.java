package CTSAssessment.ArrayCC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainItem {

   /* public static void main(String[] args) throws IOException{
       Boolean isPalandrom=true;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String st =br.readLine();
        for(int i=0; i<st.length(); i++) {
            if (st.charAt(i)!=st.charAt((st.length()-1)-i))
            {
                isPalandrom=false;
            }

        }
     if(isPalandrom.equals(false))
     {
         System.out.println("String is not palandrom String");
     }
     else
         System.out.println("String is palandrom String");


    }
*/
    public static void main(String[] args) throws IOException{
        Boolean isPalandrom=true;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String st =br.readLine();
        for(int i=0; i<st.length(); i++) {
            if (st.charAt(i)!=st.charAt((st.length()-1)-i))
            {
                isPalandrom=false;
            }

        }
        if(isPalandrom.equals(false))
        {
            System.out.println("String is not palandrom String");
        }
        else
            System.out.println("String is palandrom String");


    }
}

   /* public static void main(String[] args) throws IOException {
        int count = 0;
        int custCount = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] nu = new String[n];
        for (int i = 0; i < n; i++)

        {
            nu[i] = br.readLine();
        }

        for (int i = 0; i < n; i++)

        {

            for( int j=i+1; j<n-1;j++) {

                if(nu[i]==nu[j])

                {
                    count =count+1;
                }


            }

        }


    }
    }
*/