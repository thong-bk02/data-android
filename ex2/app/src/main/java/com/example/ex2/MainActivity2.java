package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {
        Button cong, tru, nhan, chia;
        String index="";
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
            cong= findViewById(R.id.btncong);
            tru= findViewById(R.id.btntru);
            nhan= findViewById(R.id.btnnhan);
            chia= findViewById(R.id.btnchia);
            cong.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    index= "+";
                    Intent trave =new Intent();
                    trave.putExtra("str", index);

                    setResult(RESULT_OK, trave);
                    finish();

                }
            });

            tru.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    index= "-";
                    Intent trave =new Intent();
                    trave.putExtra("str", index);

                    setResult(RESULT_OK, trave);
                    finish();

                }
            });
            nhan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    index= "*";
                    Intent trave =new Intent();
                    trave.putExtra("str", index);
                    setResult(RESULT_OK, trave);
                    finish();

                }
            });
            chia.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    index= "/";
                    Intent trave =new Intent();
                    trave.putExtra("str", index);

                    setResult(RESULT_OK, trave);
                    finish();

                }
            });



        }

}