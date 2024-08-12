/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author C.D.C.A
 */
public class Pelicula {
    private int idPelicula;
    private String Titulo;
    private double CostoVenta;
    private double CostoRenta;
    private int Unidades;
    private String Clasificacion;
    private String Genero;

    public Pelicula() {
    }

    public Pelicula(int idPelicula, String Titulo, double CostoVenta, double CostoRenta, int Unidades, String Clasificacion, String Genero) {
        this.idPelicula = idPelicula;
        this.Titulo = Titulo;
        this.CostoVenta = CostoVenta;
        this.CostoRenta = CostoRenta;
        this.Unidades = Unidades;
        this.Clasificacion = Clasificacion;
        this.Genero = Genero;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public double getCostoVenta() {
        return CostoVenta;
    }

    public void setCostoVenta(double CostoVenta) {
        this.CostoVenta = CostoVenta;
    }

    public double getCostoRenta() {
        return CostoRenta;
    }

    public void setCostoRenta(double CostoRenta) {
        this.CostoRenta = CostoRenta;
    }

    public int getUnidades() {
        return Unidades;
    }

    public void setUnidades(int Unidades) {
        this.Unidades = Unidades;
    }

    public String getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(String Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
}
