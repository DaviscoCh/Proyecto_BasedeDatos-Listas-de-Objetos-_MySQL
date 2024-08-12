/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Entidades.Inventario_Rentas;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author C.D.C.A
 */
public class Devolucion_Rentas {

    private int IDR;
    private int CodigoPr;
    private String Pelicula;
    private int Unidades;
    private double Precio;
    private double PagoI;
    private Date FechaE;
    private Date FechaD;

    public Devolucion_Rentas() {
    }

    public Devolucion_Rentas(int IDR, int CodigoPr, String Pelicula, int Unidades, double Precio, double PagoI, Date FechaE, Date FechaD) {
        this.IDR = IDR;
        this.CodigoPr = CodigoPr;
        this.Pelicula = Pelicula;
        this.Unidades = Unidades;
        this.Precio = Precio;
        this.PagoI = PagoI;
        this.FechaE = FechaE;
        this.FechaD = FechaD;
    }

    public int getIDR() {
        return IDR;
    }

    public void setIDR(int IDR) {
        this.IDR = IDR;
    }

    public int getCodigoPr() {
        return CodigoPr;
    }

    public void setCodigoPr(int CodigoPr) {
        this.CodigoPr = CodigoPr;
    }

    public String getPelicula() {
        return Pelicula;
    }

    public void setPelicula(String Pelicula) {
        this.Pelicula = Pelicula;
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

    public double getPagoI() {
        return PagoI;
    }

    public void setPagoI(double PagoI) {
        this.PagoI = PagoI;
    }

    public Date getFechaE() {
        return FechaE;
    }

    public void setFechaE(Date FechaE) {
        this.FechaE = FechaE;
    }

    public Date getFechaD() {
        return FechaD;
    }

    public void setFechaD(Date FechaD) {
        this.FechaD = FechaD;
    }

    long diasDeRetraso = 0;

    public long multa() {
        long tiempo_transcurrido = FechaD.getTime() - FechaE.getTime();
        TimeUnit minutos = TimeUnit.DAYS;
        return diasDeRetraso = (minutos.convert(tiempo_transcurrido, TimeUnit.MILLISECONDS));
    }

    public double CostoMulta() {
        double multa = (Precio * 0.15) * diasDeRetraso;
        return multa;
    }

    public double TotalPagarR() {
        System.out.println("Costo Multa" + CostoMulta());
        System.out.println("Dias" + multa());
        return PagoI + CostoMulta();
    }

}
