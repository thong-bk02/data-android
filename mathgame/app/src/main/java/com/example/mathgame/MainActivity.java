package com.example.mathgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView cauhoi,socau,dung,sai;
    Button kq1,kq2,kq3,kq4;
    int traloi;
    int thutu =0 ,caudung =0,causai=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();

        CountDownTimer dongho = new CountDownTimer(50000,5000) {
            @Override
            public void onTick(long l) {
                Random r = new Random();
                int so1=r.nextInt(40) + 10;
                int so2=r.nextInt(40) + 10;
                int rd1=r.nextInt(100) + 10;
                int rd2=r.nextInt(100) + 10;
                int rd3=r.nextInt(100) + 10;
                int correct = so1 + so2;
                thutu = thutu +1;

                socau.setText("cau " + String.valueOf(thutu)+"/10");
                cauhoi.setText(String.valueOf(so1) + "+" + String.valueOf(so2) + " = ?");
                kq1.setText(String.valueOf(rd1));
                kq2.setText(String.valueOf(rd2));
                kq3.setText(String.valueOf(correct));
                kq4.setText(String.valueOf(rd3));

                kq1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        traloi = Integer.parseInt(kq1.getText().toString());
                        if (traloi == correct){
                            caudung = caudung +1;
                            Toast.makeText(MainActivity.this,"ban da tra loi dung",Toast.LENGTH_SHORT).show();
                        }else{
                            causai = causai +1;
                            Toast.makeText(MainActivity.this,"ban da tra loi sai",Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                kq2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        traloi = Integer.parseInt(kq2.getText().toString());
                        if (traloi == correct){
                            caudung = caudung +1;
                            Toast.makeText(MainActivity.this,"ban da tra loi dung",Toast.LENGTH_SHORT).show();
                        }else{
                            causai = causai +1;
                            Toast.makeText(MainActivity.this,"ban da tra loi sai",Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                kq3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        traloi = Integer.parseInt(kq3.getText().toString());
                        if (traloi == correct){
                            caudung = caudung +1;
                            Toast.makeText(MainActivity.this,"ban da tra loi dung",Toast.LENGTH_SHORT).show();
                        }else{
                            causai = causai +1;
                            Toast.makeText(MainActivity.this,"ban da tra loi sai",Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                kq4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        traloi = Integer.parseInt(kq4.getText().toString());
                        if (traloi == correct){
                            caudung = caudung +1;
                            Toast.makeText(MainActivity.this,"ban da tra loi dung",Toast.LENGTH_SHORT).show();
                        }else{
                            causai = causai +1;
                            Toast.makeText(MainActivity.this,"ban da tra loi sai",Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                dung.setText("dung: " + String.valueOf(caudung));
                sai.setText("sai: " + String.valueOf(causai));
            }

            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this,"HET THOI GIAN",Toast.LENGTH_SHORT).show();
            }
        };
        dongho.start();
    }

    protected void anhxa(){
        cauhoi = (TextView) findViewById(R.id.cauhoi);
        socau = (TextView) findViewById(R.id.socau);
        dung = (TextView) findViewById(R.id.dung);
        sai = (TextView) findViewById(R.id.sai);
        kq1 = (Button) findViewById(R.id.kq1);
        kq2 = (Button) findViewById(R.id.kq2);
        kq3 = (Button) findViewById(R.id.kq3);
        kq4 = (Button) findViewById(R.id.kq4);
    }
}