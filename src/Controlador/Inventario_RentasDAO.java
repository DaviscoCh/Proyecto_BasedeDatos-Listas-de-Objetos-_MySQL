/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Conexion;
import Entidades.Inventario_Rentas;
import Entidades.Pelicula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author C.D.C.A
 */
public class Inventario_RentasDAO {

    private static final String Consultar = "Select * from inventario_rentas";
    private static final String Insertar = "insert into inventario_rentas values(?,?,?,?,?,?,?,?)";
    private static final String Modificar = "update inventario_rentas set CodigoPR = ?,IdCliente = ?,Pelicula = ?,Proveedor = ?,Unidades = ?,Precio = ?,FechaA = ?,FechaD = ? where CodigoPR = ?";
    private static final String Eliminar = "delete from inventario_rentas where CodigoPR = ?";

    public List<Inventario_Rentas> ListarIventarioR() {
        List<Inventario_Rentas> ListaIR = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            Connection connection = con.ObetenerConexion();
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery(Consultar);
            while (resultado.next()) {
                Inventario_Rentas ir = new Inventario_Rentas();
                ir.setCodigoPR(resultado.getInt(1));
                ir.setIdCliente(resultado.getInt(2));
                ir.setPelicula(resultado.getString(3));
                ir.setProveedor(resultado.getString(4));
                ir.setUnidades(resultado.getInt(5));
                ir.setPrecio(resultado.getDouble(6));
                ir.setFechaA(resultado.getDate(7));
                ir.setFechaD(resultado.getDate(8));
                ListaIR.add(ir);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ListaIR;
    }

    public DefaultTableModel MostrarIventarioR(List<Inventario_Rentas> Lista) {
        String[] Columnas = {"CodigoPr", "IdCliente", "Pelicula", "Proveedor", "Unidades", "Precio", "FechaA", "FechaD", "TotalPagar"};
        String[] Datos = new String[9];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);
        for (Inventario_Rentas ir : Lista) {
            Datos[0] = String.valueOf(ir.getCodigoPR());
            Datos[1] = String.valueOf(ir.getIdCliente());
            Datos[2] = ir.getPelicula();
            Datos[3] = ir.getProveedor();
            Datos[4] = String.valueOf(ir.getUnidades());
            Datos[5] = String.valueOf(ir.getPrecio());
            Datos[6] = String.valueOf(ir.getFechaA());
            Datos[7] = String.valueOf(ir.getFechaD());
            Datos[8] = String.valueOf(ir.TotalPagar());
            dt.addRow(Datos);
        }
        return dt;
    }

    public boolean InsertarIventarioR(Inventario_Rentas obir) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObetenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Insertar);
            pst.setInt(1, obir.getCodigoPR());
            pst.setInt(2, obir.getIdCliente());
            pst.setString(3, obir.getPelicula());
            pst.setString(4, obir.getProveedor());
            pst.setInt(5, obir.getUnidades());
            pst.setDouble(6, obir.getPrecio());
            pst.setString(7, FechaSQL(obir.getFechaA()));
            pst.setString(8, FechaSQL(obir.getFechaD()));
            int n = pst.executeUpdate();
            if (n != 0) {
                op = true;
                actualizarStockDespuesVenta(obir.getPelicula(), obir.getUnidades());
                System.out.println("Stock actualizado después de la venta");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.getMessage();
        }
        return op;
    }

    public boolean ModificarIventarioR(Inventario_Rentas obir) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObetenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Modificar);
            pst.setInt(1, obir.getCodigoPR());
            pst.setInt(2, obir.getIdCliente());
            pst.setString(3, obir.getPelicula());
            pst.setString(4, obir.getProveedor());
            pst.setInt(5, obir.getUnidades());
            pst.setDouble(6, obir.getPrecio());
            pst.setString(7, FechaSQL(obir.getFechaA()));
            pst.setString(8, FechaSQL(obir.getFechaD()));
            pst.setInt(9, obir.getCodigoPR());
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

    public boolean EliminarIventarioR(Inventario_Rentas obir) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObetenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Eliminar);
            pst.setInt(1, obir.getCodigoPR());
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

    public Inventario_Rentas BuscarPorCodigoPr(int codigoPr) {
        try {
            Conexion con = new Conexion();
            Connection connection = con.ObetenerConexion();
            String consulta = "SELECT * FROM inventario_rentas WHERE CodigoPR = ?";
            try (PreparedStatement pst = connection.prepareStatement(consulta)) {
                pst.setInt(1, codigoPr);
                ResultSet resultado = pst.executeQuery();
                if (resultado.next()) {
                    Inventario_Rentas ir = new Inventario_Rentas();
                    ir.setCodigoPR(resultado.getInt(1));
                    ir.setIdCliente(resultado.getInt(2));
                    ir.setPelicula(resultado.getString(3));
                    ir.setProveedor(resultado.getString(4));
                    ir.setUnidades(resultado.getInt(5));
                    ir.setPrecio(resultado.getDouble(6));
                    ir.setFechaA(resultado.getDate(7));
                    ir.setFechaD(resultado.getDate(8));
                    return ir;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
