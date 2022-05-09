package com.example.exmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class DrinkLayout extends AppCompatActivity {
    CheckBox cam,coca,pepsi,gao,duahau;
    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_layout);

        anhxa();
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DrinkLayout.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void anhxa(){
        cam = (CheckBox) findViewById(R.id.nuoccam);
        coca = (CheckBox) findViewById(R.id.cocacola);
        pepsi = (CheckBox) findViewById(R.id.pepsi);
        gao = (CheckBox) findViewById(R.id.nuocgao);
        duahau = (CheckBox) findViewById(R.id.nuocduahau);
        exit = (Button) findViewById(R.id.btndrinkexit);
    }
}