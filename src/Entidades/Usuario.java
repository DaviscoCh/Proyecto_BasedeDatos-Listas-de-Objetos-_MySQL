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
public class Usuario {
    private int IdUsuario;
    private String Nombre_U;
    private String Contraseña;

    public Usuario() {
    }

    public Usuario(int IdUsuario, String Nombre_U, String Contraseña) {
        this.IdUsuario = IdUsuario;
        this.Nombre_U = Nombre_U;
        this.Contraseña = Contraseña;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNombre_U() {
        return Nombre_U;
    }

    public void setNombre_U(String Nombre_U) {
        this.Nombre_U = Nombre_U;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
}
