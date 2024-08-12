/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Conexion;
import Entidades.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author C.D.C.A
 */
public class ClientesDAO {

    private static final String Consultar = "Select * from clientes";
    private static final String Insertar = "insert into clientes values(?,?,?,?,?,?,?,?)";
    private static final String Modificar = "update clientes set idCliente = ?,Nombre = ?,Apellido = ?,Fecha_Nacimiento = ?,Correo_Electronico = ?,Telefono = ?,Sexo = ?, Direccion = ? where idCliente = ?";
    private static final String Eliminar = "delete from clientes where idCliente = ?";

    public List<Clientes> ListarClientes() {
        List<Clientes> ListaCli = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            Connection connection = con.ObetenerConexion();
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery(Consultar);
            while (resultado.next()) {
                Clientes cl = new Clientes();
                cl.setIdCliente(resultado.getInt(1));
                cl.setNombre(resultado.getString(2));
                cl.setApellido(resultado.getString(3));
                cl.setFecha_Nacimiento(resultado.getDate(4));
                cl.setCorreo_Electronico(resultado.getString(5));
                cl.setTelefono(resultado.getString(6));
                cl.setSexo(resultado.getString(7));
                cl.setDireccion(resultado.getString(8));
                ListaCli.add(cl);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ListaCli;
    }

    public DefaultTableModel MostrarClientes(List<Clientes> Lista) {
        String[] Columnas = {"IdCliente", "Nombre", "Apellido", "FechaN", "CorreoE", "Telefono", "Sexo", "Direccion"};
        String[] Datos = new String[8];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);
        for (Clientes cl : Lista) {
            Datos[0] = String.valueOf(cl.getIdCliente());
            Datos[1] = cl.getNombre();
            Datos[2] = cl.getApellido();
            Datos[3] = String.valueOf(cl.getFecha_Nacimiento());
            Datos[4] = cl.getCorreo_Electronico();
            Datos[5] = cl.getTelefono();
            Datos[6] = cl.getSexo();
            Datos[7] = cl.getDireccion();
            dt.addRow(Datos);
        }
        return dt;
    }

    public boolean InsertarClientes(Clientes obcl) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObetenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Insertar);
            pst.setInt(1, obcl.getIdCliente());
            pst.setString(2, obcl.getNombre());
            pst.setString(3, obcl.getApellido());
            pst.setString(4, FechaSQL(obcl.getFecha_Nacimiento()));
            pst.setString(5, obcl.getCorreo_Electronico());
            pst.setString(6, obcl.getTelefono());
            pst.setString(7, obcl.getSexo());
            pst.setString(8, obcl.getDireccion());
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

    public boolean ModificarClientes(Clientes obcl) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObetenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Modificar);
            pst.setInt(1, obcl.getIdCliente());
            pst.setString(2, obcl.getNombre());
            pst.setString(3, obcl.getApellido());
            pst.setString(4, FechaSQL(obcl.getFecha_Nacimiento()));
            pst.setString(5, obcl.getCorreo_Electronico());
            pst.setString(6, obcl.getTelefono());
            pst.setString(7, obcl.getSexo());
            pst.setString(8, obcl.getDireccion());
            pst.setInt(9, obcl.getIdCliente());
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

    public boolean EliminarClientes(Clientes obcl) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObetenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Eliminar);
            pst.setInt(1, obcl.getIdCliente());
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

    public String FechaSQL(Date fecha) {
        String str = "";
        if (fecha.getMonth() < 9) {
            str = "0";
        }
        return ((fecha.getYear() + 1900) + "-" + str + (fecha.getMonth() + 1) + "-" + fecha.getDate());
    }

}
