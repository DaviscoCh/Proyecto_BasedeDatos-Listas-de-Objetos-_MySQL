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
public class Inventario_Rentas {
    private int CodigoPR;
    private int IdCliente;
    private String Pelicula;
    private String Proveedor;
    private int Unidades;
    private double Precio;
    private Date FechaA;
    private Date FechaD;

    public Inventario_Rentas() {
    }

    public Inventario_Rentas(int CodigoPR, int IdCliente, String Pelicula, String Proveedor, int Unidades, double Precio, Date FechaA, Date FechaD) {
        this.CodigoPR = CodigoPR;
        this.IdCliente = IdCliente;
        this.Pelicula = Pelicula;
        this.Proveedor = Proveedor;
        this.Unidades = Unidades;
        this.Precio = Precio;
        this.FechaA = FechaA;
        this.FechaD = FechaD;
    }

    public int getCodigoPR() {
        return CodigoPR;
    }

    public void setCodigoPR(int CodigoPR) {
        this.CodigoPR = CodigoPR;
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

    public Date getFechaA() {
        return FechaA;
    }

    public void setFechaA(Date FechaA) {
        this.FechaA = FechaA;
    }

    public Date getFechaD() {
        return FechaD;
    }

    public void setFechaD(Date FechaD) {
        this.FechaD = FechaD;
    }
    
    public double TotalPagar(){
        return Unidades * Precio;
    }
}
