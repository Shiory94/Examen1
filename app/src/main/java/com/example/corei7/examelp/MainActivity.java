package com.example.corei7.examelp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSalir;
    EditText etNombres, etApellidos, etUsuario;
    UsuarioLocalStore usuarioLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombres = (EditText) findViewById(R.id.etNombres);
        etApellidos =(EditText) findViewById(R.id.etApellidos);
        etUsuario = (EditText) findViewById(R.id.etUsuario);

        btnSalir = (Button) findViewById(R.id.btnSalir);

        btnSalir.setOnClickListener(this);

        usuarioLocalStore = new UsuarioLocalStore(this);


    }


    @Override
    protected void onStart() {
        super.onStart();
        if (authenticate()==true) {
            displayUserDetails();

        }
    }



    private boolean authenticate(){
        return usuarioLocalStore.getUserLoggedIn();


    }
    private void displayUserDetails() {
        User user = usuarioLocalStore.getLoggedInUser();
        etUsuario.setText(user.usuario);
        etNombres.setText(user.nombres);
        etApellidos.setText(user.apellidos);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSalir:
                usuarioLocalStore.clearUserData();
                usuarioLocalStore.setUserLoggedIn(false);

                startActivity(new Intent(this, Login.class));
                break;

        }

    }
}
