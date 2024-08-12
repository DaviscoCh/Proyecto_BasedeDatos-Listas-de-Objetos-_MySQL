/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.Conexion;
import Entidades.Devolucion_Rentas;
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
public class Devolucion_RentasDAO {

    private static final String Consultar = "Select * from devolucion_rentas";
    private static final String Insertar = "insert into devolucion_rentas values(?,?,?,?,?,?,?,?)";
    private static final String Modificar = "update devolucion_rentas set IDR = ?,CodigoPr = ?,Pelicula = ?,Unidades = ?, Precio = ?, PagoI = ?, FechaE = ?, FechaD = ? where IDR = ?";
    private static final String Eliminar = "delete from devolucion_rentas where IDR = ?";

    public List<Devolucion_Rentas> ListarDevolucionR() {
        List<Devolucion_Rentas> ListaDR = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            Connection connection = con.ObetenerConexion();
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery(Consultar);
            while (resultado.next()) {
                Devolucion_Rentas dr = new Devolucion_Rentas();
                dr.setIDR(resultado.getInt(1));
                dr.setCodigoPr(resultado.getInt(2));
                dr.setPelicula(resultado.getString(3));
                dr.setUnidades(resultado.getInt(4));
                dr.setPrecio(resultado.getDouble(5));
                dr.setPagoI(resultado.getDouble(6));
                dr.setFechaE(resultado.getDate(7));
                dr.setFechaD(resultado.getDate(8));

                Inventario_Rentas ir = new Inventario_RentasDAO().BuscarPorCodigoPr(dr.getCodigoPr());
                if (ir != null) {
                    // Actualizar información en Devolucion_Rentas
                    dr.setFechaE(ir.getFechaD()); // o alguna lógica que necesites
                    // ... (otros campos si es necesario)
                }
                ListaDR.add(dr);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ListaDR;
    }

    public DefaultTableModel MostrarDevolucionR(List<Devolucion_Rentas> Lista) {
        String[] Columnas = {"IDR", "CodigoPr","Pelicula","Unidades","Precio","PagoI","Fecha.E", "Fecha.D", "Multa", "PagoF"};
        String[] Datos = new String[10];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);
        for (Devolucion_Rentas dr : Lista) {
            Datos[0] = String.valueOf(dr.getIDR());
            Datos[1] = String.valueOf(dr.getCodigoPr());
            Datos[2] = dr.getPelicula();
            Datos[3] = String.valueOf(dr.getUnidades());
            Datos[4] = String.valueOf(dr.getPrecio());
            Datos[5] = String.valueOf(dr.getPagoI());
            Datos[6] = String.valueOf(dr.getFechaE());
            Datos[7] = String.valueOf(dr.getFechaD());
            
            long diasDeRetraso = dr.multa();
            
            Datos[8] = String.valueOf(dr.CostoMulta());
            Datos[9] = String.valueOf(dr.TotalPagarR());
            dt.addRow(Datos);
        }
        return dt;
    }

    public boolean InsertarDevolucionR(Devolucion_Rentas obdr) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObetenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Insertar);
            pst.setInt(1, obdr.getIDR());
            pst.setInt(2, obdr.getCodigoPr());
            pst.setString(3, obdr.getPelicula());
            pst.setInt(4, obdr.getUnidades());
            pst.setDouble(5, obdr.getPrecio());
            pst.setDouble(6, obdr.getPagoI());
            pst.setString(7, FechaSQL(obdr.getFechaE()));
            pst.setString(8, FechaSQL(obdr.getFechaD()));
            
            int n = pst.executeUpdate();
            if (n != 0) {
                op = true;
                actualizarStockDespuesVenta(obdr.getPelicula(), obdr.getUnidades());
                System.out.println("Stock actualizado después de la venta");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.getMessage();
        }
        return op;
    }

    public boolean ModificarDevolucionR(Devolucion_Rentas obdr) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObetenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Modificar);
           pst.setInt(1, obdr.getIDR());
            pst.setInt(2, obdr.getCodigoPr());
            pst.setString(3, obdr.getPelicula());
            pst.setInt(4, obdr.getUnidades());
            pst.setDouble(5, obdr.getPrecio());
            pst.setDouble(6, obdr.getPagoI());
            pst.setString(7, FechaSQL(obdr.getFechaE()));
            pst.setString(8, FechaSQL(obdr.getFechaD()));
            pst.setInt(9, obdr.getIDR());
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

    public boolean EliminarDevolucionR(Devolucion_Rentas obdr) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObetenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Eliminar);
            pst.setInt(1, obdr.getIDR());
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
                int nuevoStock = pelicula.getUnidades() + unidadesVendidas;
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
