package com.example.corei7.examelp;

/**
 * Created by Core i7 on 30/03/2017.
 */

public class User {
    String nombres, apellidos, usuario, contraseña;

    public User(String nombres, String apellidos , String usuario , String contraseña){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.contraseña= contraseña;
    }
    public User(String usuario , String contraseña){
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombres ="";
        this.apellidos="";
    }
}
