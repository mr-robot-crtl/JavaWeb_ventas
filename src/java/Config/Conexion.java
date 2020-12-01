/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Robot
 */
public class Conexion {
    private static Connection con = null;
    private static String URL="jdbc:mysql://localhost:3306/venta";
    private static String USER="root";
    private static String PASS="";
    
    public static Connection Conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(URL,USER,PASS);
        } catch (Exception e) {
            System.err.println("Error:" + e);
        }
        return con;
    } 

    public CallableStatement prepareCall(String call_listarp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}