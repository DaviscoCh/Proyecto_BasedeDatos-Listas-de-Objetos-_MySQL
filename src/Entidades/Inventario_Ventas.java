/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author C.D.C.A
 */
public class Inventario_Ventas {
    private int CodigoPV;
    private int IdCliente;
    private String Pelicula;
    private String Proveedor;
    private int Unidades;
    private double Precio;
    private Date FechaV;

    public Inventario_Ventas() {
    }

    public Inventario_Ventas(int CodigoPV, int IdCliente, String Pelicula, String Proveedor, int Unidades, double Precio, Date FechaV) {
        this.CodigoPV = CodigoPV;
        this.IdCliente = IdCliente;
        this.Pelicula = Pelicula;
        this.Proveedor = Proveedor;
        this.Unidades = Unidades;
        this.Precio = Precio;
        this.FechaV = FechaV;
    }

    public int getCodigoPV() {
        return CodigoPV;
    }

    public void setCodigoPV(int CodigoPV) {
        this.CodigoPV = CodigoPV;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getPelicula() {
        return Pelicula;
    }

    public void setPelicula(String Pelicula) {
        this.Pelicula = Pelicula;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public int getUnidades() {
        return Unidades;
    }

    public void setUnidades(int Unidades) {
        this.Unidades = Unidades;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public Date getFechaV() {
        return FechaV;
    }

    public void setFechaV(Date FechaV) {
        this.FechaV = FechaV;
    }
    
    public double TotalPagar(){
        return Unidades * Precio;
    }

}