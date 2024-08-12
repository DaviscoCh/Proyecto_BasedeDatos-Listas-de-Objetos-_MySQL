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
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import static Formularios.frmIVentas.jComboBox1;
import static Formularios.frmIRentas.jComboBox2;

/**
 *
 * @author C.D.C.A
 */
public class PeliculaDAO {

    private static final String Consultar = "Select * from pelicula";
    private static final String Insertar = "insert into pelicula values(?,?,?,?,?,?,?)";
    private static final String Modificar = "update pelicula set idPelicula = ?,Titulo = ?,CostoVenta = ?, CostoRenta = ?, Unidades = ?,Clasificacion =?,Genero = ? where idPelicula = ?";
    private static final String Eliminar = "delete from pelicula where idPelicula = ?";

    public List<Pelicula> ListarPeliculas() {
        List<Pelicula> ListaPeli = new ArrayList<>();
        try {
            Conexion con = new Conexion();
            Connection connection = con.ObetenerConexion();
            Statement statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery(Consultar);
            while (resultado.next()) {
                Pelicula pe = new Pelicula();
                pe.setIdPelicula(resultado.getInt(1));
                pe.setTitulo(resultado.getString(2));
                pe.setCostoVenta(resultado.getInt(3));
                pe.setCostoRenta(resultado.getInt(4));
                pe.setUnidades(resultado.getInt(5));
                pe.setClasificacion(resultado.getString(6));
                pe.setGenero(resultado.getString(7));
                ListaPeli.add(pe);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ListaPeli;
    }

    public DefaultTableModel MostrarPelicula(List<Pelicula> Lista) {
        String[] Columnas = {"IdPelicula", "Titulo", "CostoVenta", "CostoRenta", "Unidades", "Clasificacion", "Genero"};
        String[] Datos = new String[7];
        DefaultTableModel dt = new DefaultTableModel(null, Columnas);
        for (Pelicula pl : Lista) {
            Datos[0] = String.valueOf(pl.getIdPelicula());
            Datos[1] = pl.getTitulo();
            Datos[2] = String.valueOf(pl.getCostoVenta());
            Datos[3] = String.valueOf(pl.getCostoRenta());
            Datos[4] = String.valueOf(pl.getUnidades());
            Datos[5] = pl.getClasificacion();
            Datos[6] = pl.getGenero();
            dt.addRow(Datos);
        }
        return dt;
    }

    public boolean InsertarPelicula(Pelicula obpl) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObetenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Insertar);
            pst.setInt(1, obpl.getIdPelicula());
            pst.setString(2, obpl.getTitulo());
            pst.setDouble(3, obpl.getCostoVenta());
            pst.setDouble(4, obpl.getCostoRenta());
            pst.setInt(5, obpl.getUnidades());
            pst.setString(6, obpl.getClasificacion());
            pst.setString(7, obpl.getGenero());
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

    public boolean ModificarPelicula(Pelicula obpl) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObetenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Modificar);
            pst.setInt(1, obpl.getIdPelicula());
            pst.setString(2, obpl.getTitulo());
            pst.setDouble(3, obpl.getCostoVenta());
            pst.setDouble(4, obpl.getCostoRenta());
            pst.setInt(5, obpl.getUnidades());
            pst.setString(6, obpl.getClasificacion());
            pst.setString(7, obpl.getGenero());
            pst.setInt(8, obpl.getIdPelicula());
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

    public boolean EliminarPelicula(Pelicula obpl) {
        Conexion con = new Conexion();
        boolean op = false;
        try (Connection connection = con.ObetenerConexion()) {
            PreparedStatement pst = connection.prepareStatement(Eliminar);
            pst.setInt(1, obpl.getIdPelicula());
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

    public void actualizarComboBoxTipoE() {
        PeliculaDAO oppe = new PeliculaDAO();
        List<Pelicula> listaTipoP = oppe.ListarPeliculas();
        DefaultComboBoxModel<String> modeloTipo = new DefaultComboBoxModel<String>();
        for (Pelicula tipo : listaTipoP) {
            modeloTipo.addElement(tipo.getTitulo());
        }
        jComboBox1.setModel(modeloTipo);
    }
    
    public void actualizarComboBoxTipoR() {
        PeliculaDAO oppe = new PeliculaDAO();
        List<Pelicula> listaTipoP = oppe.ListarPeliculas();
        DefaultComboBoxModel<String> modeloTipo = new DefaultComboBoxModel<String>();
        for (Pelicula tipo : listaTipoP) {
            modeloTipo.addElement(tipo.getTitulo());
        }
        jComboBox2.setModel(modeloTipo);
    }
   
}
