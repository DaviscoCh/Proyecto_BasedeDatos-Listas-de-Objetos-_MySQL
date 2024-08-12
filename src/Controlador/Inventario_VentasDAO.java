/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Conexion;
import Entidades.Inventario_Ventas;
import Entidades.Pelicula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author C.D.C.A
 */
public class Inventario_VentasDAO {

    private static final String Consultar = "Select * from inventario_ventas";
    private static final String Insertar = "insert into inventario_ventas values(?,?,?,?,?,?,?)";
    private static final String Modificar = "update inventario_ventas set CodigoPV = ?,IdCliente = ?,Pelicula = ?, Proveedor = ?, Unidades = ?, Precio = ?, FechaVenta = ? where CodigoPV = ?";
    private static final String Eliminar = "delete from inventario_ventas where CodigoPV = ?";

    public List<Inventario_Ventas> ListarIventarioV() {
        List<Inventario_Ventas> ListaIV = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            Connection connection = con.ObetenerConexion();
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery(Consultar);
            while (resultado.next()) {
                Inventario_Ventas iv = new Inventario_Ventas();
                iv.setCodigoPV(resultado.getInt(1));
                iv.setIdCliente(resultado.getInt(2));
                iv.setPelicula(resultado.getString(3));
                iv.setProveedor(resultado.getString(4));
                iv.setUnidades(resultado.getInt(5));
                iv.setPrecio(resultado.getDouble(6));
                iv.setFechaV(resultado.getDate(7));
                ListaIV.add(iv);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ListaIV;
    }

    public DefaultTableModel MostrarIventarioV(List<Inventario_Ventas> Lista) {
        String[] Columnas = {"CodigoPV", "IdCliente", "Pelicula", "Proveedor", "Unidades", "Precio", "FechaVenta", "TotalPagar"};
        String[] Datos = new String[8];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);
        for (Inventario_Ventas iv : Lista) {
            Datos[0] = String.valueOf(iv.getCodigoPV());
            Datos[1] = String.valueOf(iv.getIdCliente());
            Datos[2] = iv.getPelicula();
            Datos[3] = iv.getProveedor();
            Datos[4] = String.valueOf(iv.getUnidades());
            Datos[5] = String.valueOf(iv.getPrecio());
            Datos[6] = String.valueOf(iv.getFechaV());
            Datos[7] = String.valueOf(iv.TotalPagar());
            dt.addRow(Datos);
        }
        return dt;
    }

    public boolean InsertarIventarioV(Inventario_Ventas obiv) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObetenerConexion()) {
            System.out.println("Si Ejecuta!!!!!!!!!!!!");
            PreparedStatement pst = connection.prepareStatement(Insertar);
            pst.setInt(1, obiv.getCodigoPV());
            pst.setInt(2, obiv.getIdCliente());
            pst.setString(3, obiv.getPelicula());
            pst.setString(4, obiv.getProveedor());
            pst.setInt(5, obiv.getUnidades());
            pst.setDouble(6, obiv.getPrecio());
            pst.setString(7, FechaSQL(obiv.getFechaV()));
            int n = pst.executeUpdate();
            if (n != 0) {
                op = true;
                actualizarStockDespuesVenta(obiv.getPelicula(), obiv.getUnidades());
                System.out.println("Stock actualizado después de la venta");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.getMessage();
        }
        return op;
    }

    public boolean ModificarIventarioV(Inventario_Ventas obiv) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObetenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Modificar);
            pst.setInt(1, obiv.getCodigoPV());
            pst.setInt(2, obiv.getIdCliente());
            pst.setString(3, obiv.getPelicula());
            pst.setString(4, obiv.getProveedor());
            pst.setInt(5, obiv.getUnidades());
            pst.setDouble(6, obiv.getPrecio());
            pst.setString(7, FechaSQL(obiv.getFechaV()));
            pst.setInt(8, obiv.getCodigoPV());
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

    public boolean EliminarIventarioV(Inventario_Ventas obiv) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObetenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Eliminar);
            pst.setInt(1, obiv.getCodigoPV());
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

    private void actualizarStockDespuesVenta(String nombrePelicula, int unidadesVendidas) {
        Conexion con = new Conexion();
        PeliculaDAO peliculaDAO = new PeliculaDAO();
        List<Pelicula> listaPeliculas = peliculaDAO.ListarPeliculas();

        for (Pelicula pelicula : listaPeliculas) {
            if (pelicula.getTitulo().equals(nombrePelicula)) {
                int nuevoStock = pelicula.getUnidades() - unidadesVendidas;
                pelicula.setUnidades(nuevoStock);
                System.out.println("Stock actualizado para " + nombrePelicula + ": " + nuevoStock);

                try (Connection connection = con.ObetenerConexion()) {
                    String sqlUpdate = "UPDATE pelicula SET Unidades = ? WHERE Titulo = ?";
                    try (PreparedStatement pst = connection.prepareStatement(sqlUpdate)) {
                        pst.setInt(1, nuevoStock);
                        pst.setString(2, nombrePelicula);
                        pst.executeUpdate();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                break;
            }
        }
    }
}
