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
public class Clientes {
    private int idCliente;
    private String Nombre;
    private String Apellido;
    private Date Fecha_Nacimiento;
    private String Correo_Electronico;
    private String Telefono;
    private String Sexo;
    private String Direccion;

    public Clientes() {
    }

    public Clientes(int idCliente, String Nombre, String Apellido, Date Fecha_Nacimiento, String Correo_Electronico, String Telefono, String Sexo, String Direccion) {
        this.idCliente = idCliente;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Correo_Electronico = Correo_Electronico;
        this.Telefono = Telefono;
        this.Sexo = Sexo;
        this.Direccion = Direccion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public void setCorreo_Electronico(String Correo_Electronico) {
        this.Correo_Electronico = Correo_Electronico;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
}
