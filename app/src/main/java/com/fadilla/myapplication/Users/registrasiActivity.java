package com.fadilla.myapplication.Users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fadilla.myapplication.R;

public class registrasiActivity extends AppCompatActivity {

    Button btnPindahLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        btnPindahLogin = (Button) findViewById(R.id.btnPindahLogin);

        btnPindahLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(registrasiActivity.this,loginActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}