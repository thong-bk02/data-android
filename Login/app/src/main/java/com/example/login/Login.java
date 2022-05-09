package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tv1 = (TextView) findViewById(R.id.hello);
        Intent intent = getIntent();
        String user = intent.getStringExtra("username");
        //gán dữ liệu vào edittext
        tv1.setText("Chao mung: " + user);
    }
}