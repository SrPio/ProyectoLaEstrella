
package estrella;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
  public static final String URL = "jdbc:postgresql://localhost:5432/LaEstrella";
  public static final String USERNAME = "postgres";
  public static final String PASSWORD = "jaramillo1999";
  
  /*
   *Esto es la funcion para obtener la conexion a la base de datos
   */
  public static Connection getConection(){
      
    Connection con = null;

    try {

      Class.forName("org.postgresql.Driver");
      con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
      System.out.println("Conexion a base de datos exitosa!");

    } catch (Exception e) {
      System.out.println(e);
    }
    return con;
  }
}
