package com.example.exmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class FoodLayout extends AppCompatActivity {
    CheckBox trau,ga,meo,lon,bo;
    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_layout);

        anhxa();

        checkbox();
        Intent intent = new Intent(FoodLayout.this,MainActivity.class);
        Bundle bundle = new Bundle();

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (trau.isChecked()){
                    bundle.putString("choosefood","thịt trâu");
                }else if(ga.isChecked()){
                    bundle.putString("choosefood","thịt gà");
                }else if(meo.isChecked()){
                    bundle.putString("choosefood","thịt mèo");
                }else if(lon.isChecked()){
                    bundle.putString("choosefood","thịt lợn");
                }else if(bo.isChecked()){
                    bundle.putString("choosefood","thịt bò");
                }
                intent.putExtra("listfood",bundle);
                startActivity(intent);
            }
        });

    }

    public void anhxa(){
        trau = (CheckBox) findViewById(R.id.thittrau);
        ga = (CheckBox) findViewById(R.id.thitga);
        meo = (CheckBox) findViewById(R.id.thitmeo);
        lon = (CheckBox) findViewById(R.id.thitlon);
        bo = (CheckBox) findViewById(R.id.thitbo);
        exit = (Button) findViewById(R.id.btnfoodexit);
    }

    protected  void  checkbox(){
        trau.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    ga.setChecked(false);
                    meo.setChecked(false);
                    lon.setChecked(false);
                    bo.setChecked(false);
                }
            }
        });
        ga.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    trau.setChecked(false);
                    meo.setChecked(false);
                    lon.setChecked(false);
                    bo.setChecked(false);
                }
            }
        });
        meo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    ga.setChecked(false);
                    trau.setChecked(false);
                    lon.setChecked(false);
                    bo.setChecked(false);
                }
            }
        });
        lon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    ga.setChecked(false);
                    trau.setChecked(false);
                    meo.setChecked(false);
                    bo.setChecked(false);
                }
            }
        });
        bo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    ga.setChecked(false);
                    trau.setChecked(false);
                    lon.setChecked(false);
                    meo.setChecked(false);
                }
            }
        });
    }
}