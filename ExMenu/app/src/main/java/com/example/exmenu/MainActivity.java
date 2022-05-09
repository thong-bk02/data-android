package com.example.exmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button food,drink,exit;
    TextView kq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();

//        Intent intent = getIntent();
//        Bundle bundle = intent.getBundleExtra("listfood");
//        String dish = bundle.getString("choosefood");
//        kq.setText(dish);

        //click cho nut food
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FoodLayout.class);
                startActivity(intent);
            }
        });
        //click cho nut drink
        drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DrinkLayout.class);
                startActivity(intent);
            }
        });
        //click cho nut exit
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



    }

    public void anhxa(){
        food = (Button) findViewById(R.id.btnfood);
        drink = (Button) findViewById(R.id.btndrink);
        exit = (Button)  findViewById(R.id.btnexit);
        kq = (TextView) findViewById(R.id.tvresult);
    }
}