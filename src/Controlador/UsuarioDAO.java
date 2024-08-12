/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Conexion;
import Entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author C.D.C.A
 */
public class UsuarioDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public Usuario Usu(String Nombre_U, String Contraseña){
        
        Usuario us = new Usuario();
        String sql = "SELECT * FROM usuarios WHERE Nombre_U = ?  AND Contraseña = ? ";
        try
        {
            con = cn.ObetenerConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, Nombre_U);
            ps.setString(2, Contraseña);
          
            rs = ps.executeQuery();
            if(rs.next()){
                us.setNombre_U(rs.getString("Nombre_U"));
               
                  us.setContraseña(rs.getString("Contraseña"));
            }
            
            
        } catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return us;
    }
}
