/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Conexion;
import Entidades.Proveedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author C.D.C.A
 */
public class ProveedoresDAO {
    private static final String Consultar = "Select * from proveedores";
    private static final String Insertar = "insert into proveedores values(?,?,?,?,?)";
    private static final String Modificar = "update proveedores set idProveedores = ?,RUC = ?,Nombre = ?, Telefono = ?, Direccion = ? where idProveedores = ?";
    private static final String Eliminar = "delete from proveedores where idProveedores = ?";

    public List<Proveedores> ListarProveedores() {
        List<Proveedores> ListaPro = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            Connection connection = con.ObetenerConexion();
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery(Consultar);
            while (resultado.next()) {
                Proveedores pr = new Proveedores();
                pr.setIdProveedores(resultado.getInt(1));
                pr.setRUC(resultado.getString(2));
                pr.setNombre(resultado.getString(3));
                pr.setTelefono(resultado.getString(4));
                pr.setDireccion(resultado.getString(5));
                ListaPro.add(pr);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ListaPro;
    }

    public DefaultTableModel MostrarProveedores(List<Proveedores> Lista) {
        String[] Columnas = {"IdProveedores", "RUC", "Nombre", "Telefono", "Direccion"};
        String[] Datos = new String[5];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);
        for (Proveedores pr : Lista) {
            Datos[0] = String.valueOf(pr.getIdProveedores());
            Datos[1] = pr.getRUC();
            Datos[2] = String.valueOf(pr.getNombre());
            Datos[3] = String.valueOf(pr.getTelefono());
            Datos[4] = String.valueOf(pr.getDireccion());
            dt.addRow(Datos);
        }
        return dt;
    }

    public boolean InsertarProveedores(Proveedores obpr) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObetenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Insertar);
            pst.setInt(1, obpr.getIdProveedores());
            pst.setString(2, obpr.getRUC());
            pst.setString(3, obpr.getNombre());
            pst.setString(4, obpr.getTelefono());
            pst.setString(5, obpr.getDireccion());
            int n = pst.executeUpdate();
            if (n != 0) {
                op = true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.getMessage();
        }
        return op;
    }

    public boolean ModificarProveedores(Proveedores obpr) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObetenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Modificar);
            pst.setInt(1, obpr.getIdProveedores());
            pst.setString(2, obpr.getRUC());
            pst.setString(3, obpr.getNombre());
            pst.setString(4, obpr.getTelefono());
            pst.setString(5, obpr.getDireccion());
            pst.setInt(6, obpr.getIdProveedores());
            int n = pst.executeUpdate();
            if (n != 0) {
                op = true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.getMessage();
        }
        return op;
    }

    public boolean EliminarProveedores(Proveedores obpr) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObetenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Eliminar);
            pst.setInt(1, obpr.getIdProveedores());
            int n = pst.executeUpdate();
            if (n != 0) {
                op = true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.getMessage();
        }
        return op;
    }
}
