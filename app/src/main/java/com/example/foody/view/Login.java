package com.example.foody.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.foody.R;

public class Login extends AppCompatActivity {
    EditText et_Email, et_Password;
    TextView btdangnhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btdangnhap = (TextView) findViewById(R.id.btn_dn) ;
        et_Email = (EditText) findViewById(R.id.etEmail) ;
        et_Password = (EditText) findViewById(R.id.etPassword) ;


        btdangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Home_Login.class);
                startActivity(intent);
            }
        });
    }
}