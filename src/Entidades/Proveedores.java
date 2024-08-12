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
public class Proveedores {
    private int idProveedores;
    private String RUC;
    private String Nombre;
    private String Telefono;
    private String Direccion;

    public Proveedores() {
    }

    public Proveedores(int idProveedores, String RUC, String Nombre, String Telefono, String Direccion) {
        this.idProveedores = idProveedores;
        this.RUC = RUC;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
    }

    public int getIdProveedores() {
        return idProveedores;
    }

    public void setIdProveedores(int idProveedores) {
        this.idProveedores = idProveedores;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
}
