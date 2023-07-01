package com.example.dts_login.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.dts_login.R;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsername;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button buttonRegisterHere = findViewById(R.id.buttonRegisterHere);
        buttonRegisterHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

        ImageButton buttonToHome = findViewById(R.id.loginToHome);
        buttonToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
    }

    private void login() {
        String username = etUsername.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        if (username.equals("admin") && password.equals("admin")) {
            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(intent);
            Toast.makeText(this, "Login berhasil!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Username atau password tidak valid!", Toast.LENGTH_SHORT).show();
        }
    }
}
