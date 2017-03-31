package com.example.corei7.examelp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button btnEntrar;
    EditText etUsuario, etContraseña;
    TextView txRegistrarUrl;

    UsuarioLocalStore usuarioLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsuario = (EditText) findViewById(R.id.etUsuario);
        etContraseña = (EditText) findViewById(R.id.etContraseña);
        btnEntrar = (Button) findViewById(R.id.btnEntrar);
        txRegistrarUrl = (TextView) findViewById(R.id.txRegistrarUrl);


        txRegistrarUrl.setOnClickListener(this);
        btnEntrar.setOnClickListener(this);

        usuarioLocalStore = new UsuarioLocalStore(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnEntrar:

                User user = new User(null, null);

                usuarioLocalStore.storeUsuarioData(user);
                usuarioLocalStore.setUserLoggedIn(true);

                break;
            case R.id.txRegistrarUrl:

                startActivity(new Intent(this, Register.class));
                break;
        }
    }
    public void btnOlvide(View JJDJD){
        Intent menu= new Intent(this, MainActivity.class);
        startActivity(menu);
    }
}
