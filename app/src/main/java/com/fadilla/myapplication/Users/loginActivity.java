package com.fadilla.myapplication.Users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fadilla.myapplication.R;
import com.fadilla.myapplication.admin.HomeAdminActivity;
import com.ornach.nobobutton.NoboButton;

public class loginActivity extends AppCompatActivity {

    Button btnPindah;
    NoboButton btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        btnPindah = (Button) findViewById(R.id.btnPindah);
        btnLogin = (NoboButton) findViewById(R.id.LoginBtn);

        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(loginActivity.this, registrasiActivity.class);
                startActivity(i);
                finish();
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(loginActivity.this, HomeAdminActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}