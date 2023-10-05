package com.example.ej_login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText EspacioUsuario;
    private EditText EspacioContrasena;
    private TextView MensajeError;


    //El usuario y contraseña
    private String usuario = "usuario"; // Cambia esto por el usuario correcto
    private String contrasena = "1234"; // Cambia esto por la contraseña correcta

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EspacioUsuario = findViewById(R.id.editTextUsername);
        EspacioContrasena = findViewById(R.id.editTextPassword);
        MensajeError = findViewById(R.id.textViewMessage);
    }

    public void login(View view) {
        String username = EspacioUsuario.getText().toString();
        String password = EspacioContrasena.getText().toString();

        if (username.isEmpty() || password.isEmpty()) {
            MensajeError.setText("Faltan datos.");
            MensajeError.setTextColor(ContextCompat.getColor(this, R.color.red)); // Color rojo

        } else if (username.equals(usuario) && password.equals(contrasena)) {
            MensajeError.setText("Login correcto.");
            MensajeError.setTextColor(ContextCompat.getColor(this, R.color.green)); // Color verde

        } else {
            MensajeError.setText("Login incorrecto.");
            MensajeError.setTextColor(ContextCompat.getColor(this, R.color.red)); // Color rojo
        }
    }
}