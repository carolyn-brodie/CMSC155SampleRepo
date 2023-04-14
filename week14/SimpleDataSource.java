package week14;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
   A simple data source for getting database connections. 
*/
public class SimpleDataSource
{
   private static String url;
   private static String username;
   private static String password;

   /**
      Initializes the data source.
      @param fileName the name of the property file that 
      contains the database driver, URL, username, and password
   */
   public static void init(String fileName)
         throws IOException, ClassNotFoundException
   {
      //System.out.println ("here");
      Properties props = new Properties();
      //System.out.println ("here2");
      FileInputStream in = new FileInputStream(fileName);
      props.load(in);
      //System.out.println("here3");
      String driver = props.getProperty("jdbc.driver");
      url = props.getProperty("jdbc.url");
      username = props.getProperty("jdbc.username");
      if (username == null) username = "";
      password = props.getProperty("jdbc.password");
      if (password == null) password = "";
      //System.out.println("getting driver");
      Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
//      if (driver != null)
//         Class.forName(driver);
   }

   /**
      Gets a connection to the database.
      @return the database connection
   */
   public static Connection getConnection() throws SQLException
   {
      return DriverManager.getConnection(url, username, password);
   }
}











