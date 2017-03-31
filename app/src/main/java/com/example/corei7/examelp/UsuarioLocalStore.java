package com.example.corei7.examelp;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Core i7 on 30/03/2017.
 */

public class UsuarioLocalStore {
    public static final String SP_NOMBRE = "usuarioDetalles";
    SharedPreferences usuarioLocalDataBase;

    public UsuarioLocalStore(Context context) {
        usuarioLocalDataBase = context.getSharedPreferences(SP_NOMBRE, 0);
    }

    public void storeUsuarioData(User user) {
        SharedPreferences.Editor spEditor = usuarioLocalDataBase.edit();
        spEditor.putString("name", user.nombres);
        spEditor.putString("usuario", user.usuario);
        spEditor.putString("contraseña", user.contraseña);
        spEditor.commit();


    }

    public User getLoggedInUser() {
        String nombres = usuarioLocalDataBase.getString("nombres", "");
        String apellidos = usuarioLocalDataBase.getString("apellidos", "");
        String usuario = usuarioLocalDataBase.getString("usuario", "");
        String contraseña = usuarioLocalDataBase.getString("contraseña", "");

        User storeUser = new User(nombres, apellidos, usuario, contraseña);

        return  storeUser;
    }
    public void  setUserLoggedIn(boolean loggedIn){
        SharedPreferences.Editor spEditor = usuarioLocalDataBase.edit();
        spEditor.putBoolean("loggedId", loggedIn );
        spEditor.commit();

    }
    public boolean getUserLoggedIn(){
        if (usuarioLocalDataBase.getBoolean("loggedIn", false)){
            return true;
        }else{
            return false;
        }
    }


    public void clearUserData(){
        SharedPreferences.Editor spEditor = usuarioLocalDataBase.edit();
        spEditor.clear();
        spEditor.commit();

    }

}

