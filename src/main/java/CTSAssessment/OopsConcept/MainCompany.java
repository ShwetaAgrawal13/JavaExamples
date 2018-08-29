package CTSAssessment.OopsConcept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCompany {


    public static void main(String[] args) throws IOException {

        System.out.println("Enter the number of companies:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
      Company company;
      Address address ;
        CompanyBO companyBO =new CompanyBO();
      Company[] list = new Company[n];
        for(int i=0; i<n; i++)
        {
            company=new Company();
            address =new Address();
            System.out.println("Enter the company "+(i+1)+" details :");
            System.out.println("Enter company id :");
            company.setIdentifier(br.readLine());
            System.out.println("Enter the company's IATA code :");
            company.setIata(br.readLine());
            System.out.println("Enter the company's FMC code :");
            company.setFmc(br.readLine());
            System.out.println("Enter the company's state :");
            address.setState(br.readLine());
            System.out.println("Enter the company's country :");
            address.setCountry(br.readLine());
            company.setAddress(address);
            list[i]=company;

        }

            companyBO.displayCompanyDetails(list);

    }
}
