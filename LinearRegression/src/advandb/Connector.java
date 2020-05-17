/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package advandb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector
{
  private Connection con;

  public boolean test_conn(String schema,String username,String Password)
  {
     
      try {
      Class.forName("com.mysql.jdbc.Driver").newInstance();
      con = DriverManager.getConnection("jdbc:mysql://localhost/"+schema,
        username, Password);

      try
      {
        if(con != null)
          con.close();
      } catch(SQLException e) {}
       return true;
      } catch(Exception e)
      {
      System.err.println("Exception: " + e.getMessage());
      return false;   
    }
  }

  public void Open()
  {
    try{
      Class.forName("com.mysql.jdbc.Driver").newInstance();
      con = DriverManager.getConnection("jdbc:mysql://localhost/advandb",
        "root", "1234");
    }
    catch (Exception E)
    {
        E.printStackTrace();
    }
  }

  public void Open(String schema,String user,String password)
  {
    try{
      Class.forName("com.mysql.jdbc.Driver").newInstance();
      con = DriverManager.getConnection("jdbc:mysql://localhost/"+schema,
        user, password);
    }
    catch (Exception E)
    {
        E.printStackTrace();
    }
  }

  public void Close()
  {
    try{
    con.close();
    }
    catch (Exception E)
    { }
  }

  public Connection getConnection()
  {
    return con;
  }
  
}



