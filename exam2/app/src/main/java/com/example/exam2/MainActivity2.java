package com.example.exam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button cong, tru, nhan, chia;
    String index="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        anhxa();

        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index= "+";
                Intent trave =new Intent();
                trave.putExtra("string", index);
                setResult(RESULT_OK, trave);
                finish();
            }
        });

        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index= "-";
                Intent trave =new Intent();
                trave.putExtra("string", index);
                setResult(RESULT_OK, trave);
                finish();
            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index= "*";
                Intent trave =new Intent();
                trave.putExtra("string", index);
                setResult(RESULT_OK, trave);
                finish();
            }
        });
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index= "/";
                Intent trave =new Intent();
                trave.putExtra("string", index);
                setResult(RESULT_OK, trave);
                finish();
            }
        });



    }

    public void anhxa(){
       cong = (Button) findViewById(R.id.btncong);
       tru = (Button) findViewById(R.id.btntru);
       nhan = (Button) findViewById(R.id.btnnhan);
       chia = (Button) findViewById(R.id.btnchia);
    }
}