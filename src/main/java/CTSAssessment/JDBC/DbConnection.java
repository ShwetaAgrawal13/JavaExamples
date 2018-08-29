package CTSAssessment.JDBC;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {


    public static Connection getConnection() throws ClassNotFoundException, SQLException, IOException {

        Properties prop = new Properties();
        InputStream input = new FileInputStream("src/resources/mysql.properties");
        prop.load(input);



       /* ResourceBundle rb=ResourceBundle.getBundle("mysql");
        String url = rb.getString("db.url");
        String user = rb.getString("db.username");
        String pass = rb.getString("db.password");
        Class.forName("com.mysql.jdbc.Driver");
        	Connection connect= DriverManager.getConnection(url,username,password);*/
      Connection con= DriverManager.getConnection(prop.getProperty("db.url"),prop.getProperty("db.username"),prop.getProperty("db.password"));
        return con;


    }
}
