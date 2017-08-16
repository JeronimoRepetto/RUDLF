/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author jeron
 */
public class ConexionBD {
    
     //Conexion a la base de datos
    private Connection conexion = null;
    private String user = "root";
    private String password = "";
    private String puerto = "3306";
    private String catalogo = "rulf";
    private String host = "localhost";
    
    public Connection estableceConexion()
    {
        if (conexion != null)
            return conexion;

        try
        {
            // SE REGISTRA EL DRIVER
            Class.forName("com.mysql.jdbc.Driver");
            
            String urlConexion = "jdbc:mysql://" + host + ":" + puerto + "/"+catalogo;
           
            conexion = DriverManager.getConnection(urlConexion,user,password);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return conexion;
    }

  
    //SE CIERRA LA CONEXION
    public void cierraConexion()
    {
        try
        {
            conexion.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
