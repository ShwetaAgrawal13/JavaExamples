package CTSAssessment.JDBC;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RoleDao {

    public ArrayList<Role> getAllRoles() throws SQLException, ClassNotFoundException, IOException {
        Connection con=DbConnection.getConnection();
        Statement s=con.createStatement();
        ResultSet rs=s.executeQuery("SELECT id, name FROM userrole.role ORDER BY name asc");
        ArrayList<Role> list =new ArrayList<Role>();
        while (rs.next())
        {
            list.add(new Role(rs.getInt(1),rs.getString(2)));
        }
        return list;
    }
}
