package CTSAssessment.OopsConcept;

import java.util.ArrayList;
import java.util.List;

public class CompanyBO {


    public void displayCompanyDetails(Company[] companies)
    {

        int n=companies.length;
        List<String> flags=new ArrayList<String>();
        for(int i=0; i<n; i++) {
           // while(!company.getAddress().getCountry().equals("India"))
            if (companies[i].getAddress().getCountry().equalsIgnoreCase("India"))
            {
                flags.add("true");
            }
            else
                flags.add("false");
          }

          if(!flags.contains("false"))
          {
        System.out.println("All companies are inside India");
          }
          else{
              System.out.println("Companies outside India :");
              System.out.println(String.format("%-15s %-15s %-15s %s", "Company ID", "IATA Code", "FMC Code", String.format("%-15s %s", "State", "Country")));

              for(int i=0; i<n; i++) {

            if (!companies[i].getAddress().getCountry().equalsIgnoreCase("India")) {
                {


                        System.out.println(companies[i].toString());
                }
            }
        }
        }
    }
}
