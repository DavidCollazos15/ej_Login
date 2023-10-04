package com.example.ej_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private TextView textViewMessage;


    //El usuario y contraseña
    private String usuario = "usuario"; // Cambia esto por el usuario correcto
    private String contrasena = "contrasena"; // Cambia esto por la contraseña correcta

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        textViewMessage = findViewById(R.id.textViewMessage);
    }

    public void login(View view) {
        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();

        if (username.isEmpty() || password.isEmpty()) {
            textViewMessage.setText("Faltan datos.");
        } else if (username.equals(usuario) && password.equals(contrasena)) {
            textViewMessage.setText("Login correcto.");
        } else {
            textViewMessage.setText("Login incorrecto.");
        }
    }
}