package CTSAssessment.JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDAO {

    public ArrayList<User> getAllUsers() throws SQLException, IOException, ClassNotFoundException,InstantiationException,IllegalAccessException {

        Connection con=DbConnection.getConnection();
        Statement st= (Statement) con.createStatement();
        ResultSet rs=st.executeQuery("SELECT U.id,U.name,R.id, R.name,C.id,C.street, C.city, C.state from userrole.role R, userrole.contact C, userrole.user U where U.contact_id=C.id and U.role_id=R.id order by U.name asc");
        ArrayList<User> users=new ArrayList<User>();
        while(rs.next())
        {
            users.add(new User(rs.getInt(1),rs.getString(2),new Role(rs.getInt(3),rs.getString(4)),new Contact(rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8))) );
        }
        return users;

    }
}
