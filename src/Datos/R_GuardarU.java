/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author C.D.C.A
 */
public class R_GuardarU {

    private boolean accesoCorrecto = false;

    public void GuardarUsuario(String Nombre_U, String Contraseña, int IdUsuario) {
        Conexion co = new Conexion();
        String sql = "INSERT INTO usuario(IdUsuario, Nombre_U, Contraseña) VALUES (?, ?, ?)";
        try (Connection conexion = co.ObetenerConexion();
                PreparedStatement pst = conexion.prepareStatement(sql)) {

            pst.setInt(1, IdUsuario);
            pst.setString(2, Nombre_U);
            pst.setString(3, Contraseña);

            int rs = pst.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Guardado Correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar el usuario");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public boolean AccesoUsuario(String user, String pass) {
        Conexion co = new Conexion();

        try {
            Connection cn = co.ObetenerConexion();
            PreparedStatement pst = cn.prepareStatement("SELECT Nombre_U,Contraseña FROM usuario");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                String UsuarioNuevo = rs.getString(1);
                String ContraseñaNueva = rs.getString(2);

                if (user.equals(UsuarioNuevo) && pass.equals(ContraseñaNueva)) {
                    JOptionPane.showMessageDialog(null, "Usuario Correcto, Bienvenido " + user);
                    accesoCorrecto = true;
                    break;
                }
            }
            cn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
        return accesoCorrecto;
    }

}
