package CTSAssessment.JDBC;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class MainJDBC {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException, IllegalAccessException, InstantiationException {
       // System.out.println("Role Details:");
        ArrayList<User> users=new ArrayList<User>();
        System.out.format("%-10s %-20s %-25s %-10s %-10s \n","User","Role","Street","City","State");
        UserDAO userDAO =new UserDAO();
        try {
            users = userDAO.getAllUsers();
        }catch (SQLException e){} ;
        for (User user : users) {
            System.out.format("%-10s %-20s %-25s %-10s %-10s \n", user.getName(), user.getRole().getName()
                    , user.getContact().getStreet(), user.getContact().getCity(), user.getContact().getState());

        }
    }
}
