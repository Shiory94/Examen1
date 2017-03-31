package com.example.corei7.examelp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener {

    Button btnRegistrar;
    EditText etNombres, etApellidos, etUsuario, etContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etNombres = (EditText) findViewById(R.id.etNombres);
        etApellidos =(EditText) findViewById(R.id.etApellidos);
        etUsuario = (EditText) findViewById(R.id.etUsuario);
        etContraseña = (EditText) findViewById(R.id.etContraseña);

        btnRegistrar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnRegistrar:

                String nombres = etNombres.getText().toString();
                String apellidos = etApellidos.getText().toString();
                String usuario = etUsuario.getText().toString();
                String contraseña = etContraseña.getText().toString();


                User regiteredData = new User(nombres, apellidos, usuario, contraseña);



                 break;
        }
    }
}
