
package estrella;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    public static final String URL = "jdbc:postgresql://localhost:5432/LaEstrella"; //Direccion, puerto y nombre de la Base de Datos
    public static final String USERNAME = "postgres"; //Usuario de Acceso a MySQL
    public static final String PASSWORD = "jaramillo1999"; //Password del usuario
    
     public static Connection getConection() {
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
