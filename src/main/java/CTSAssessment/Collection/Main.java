package CTSAssessment.Collection;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException{

        File file1 = new File("/Users/sagar6/Downloads/bike 2/src/main/java/CTSAssessment/input.txt");
        File file2 = new File("/Users/sagar6/Downloads/bike 2/src/main/java/CTSAssessment/output.txt");

        List<User> userList= new ArrayList<User>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
        BufferedWriter writer =new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2)));
        String line;
        while ((line=reader.readLine()) != null)
        {
            String[] data=new String[18];
            data=line.replaceAll("\\s+",",").split(",");
            if(data.length==4){
            userList.add(new User(Long.parseLong(data[0].substring(0,4)),data[0].substring(5,data[0].length()),data[1],data[2],data[3].substring(0,8),data[3].substring(8,17)));}
            else{
                userList.add(new User(Long.parseLong(data[0].substring(0,4)),data[0].substring(5),data[1],data[2],data[3],data[4]));  }
        }

        // close the BufferedReader when we're done
        reader.close();

        Iterator<User> itr =userList.iterator();
        String line1;
        line1=String.format("%-10s %-15s %-15s %-15s %-15s %s \n","id","First Name","Last Name", "Username","Password","Mobile Number");
        writer.write(line1);


        while(itr.hasNext())
        {
            User u=itr.next();
            line1= u.toString();
            writer.write(line1);

        }
        System.out.println("data saved");
        writer.flush();
        writer.close();

    }
}
