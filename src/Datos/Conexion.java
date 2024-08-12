/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author C.D.C.A
 */
public class Conexion {
    private static Connection conexion;
    private static String driver = "org.gjt.mm.mysql.Driver";
    private static final String usr = "root";
    private static final String psw = "administrador";
    private static final String url = "jdbc:mysql://localhost:3306/venta_peliculas";

    public Connection ObetenerConexion() {
        conexion = null;
        try {
            conexion = (Connection) DriverManager.getConnection(url,usr,psw);
            if(conexion!=null){
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error" + e.toString());
        }
        return conexion;
    }
}
