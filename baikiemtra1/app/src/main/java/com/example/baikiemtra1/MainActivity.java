package com.example.baikiemtra1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText so1,so2;
    Button cong,tru,nhan,chia,xoa;
    TextView kq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();


        //su kien click cho cac phep toan
        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = so1.getText().toString();
                String s2 = so2.getText().toString();
                if (s1.equals(null) || s1.equals("")){
                    Toast.makeText(MainActivity.this,"vui long nhap so thu nhat",Toast.LENGTH_SHORT).show();
                }else if(s2.equals(null) || s2.equals("")){
                    Toast.makeText(MainActivity.this,"vui long nhap so thu hai",Toast.LENGTH_SHORT).show();
                }else{
                    int num1 = Integer.parseInt(s1);
                    int num2 = Integer.parseInt(s2);
                    int result = num1 + num2;
                    kq.setText(String.valueOf(result));
                }
            }
        });
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = so1.getText().toString();
                String s2 = so2.getText().toString();
                if (s1.equals(null) || s1.equals("")){
                    Toast.makeText(MainActivity.this,"vui long nhap so thu nhat",Toast.LENGTH_SHORT).show();
                }else if(s2.equals(null) || s2.equals("")){
                    Toast.makeText(MainActivity.this,"vui long nhap so thu hai",Toast.LENGTH_SHORT).show();
                }else{
                    int num1 = Integer.parseInt(s1);
                    int num2 = Integer.parseInt(s2);
                    int result = num1 - num2;
                    kq.setText(String.valueOf(result));
                }
            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = so1.getText().toString();
                String s2 = so2.getText().toString();
                if (s1.equals(null) || s1.equals("")){
                    Toast.makeText(MainActivity.this,"vui long nhap so thu nhat",Toast.LENGTH_SHORT).show();
                }else if(s2.equals(null) || s2.equals("")){
                    Toast.makeText(MainActivity.this,"vui long nhap so thu hai",Toast.LENGTH_SHORT).show();
                }else{
                    int num1 = Integer.parseInt(s1);
                    int num2 = Integer.parseInt(s2);
                    int result = num1 * num2;
                    kq.setText(String.valueOf(result));
                }
            }
        });
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1 = so1.getText().toString();
                String s2 = so2.getText().toString();
                if (s1.equals(null) || s1.equals("")){
                    Toast.makeText(MainActivity.this,"vui long nhap so thu nhat",Toast.LENGTH_SHORT).show();
                }else if(s2.equals(null) || s2.equals("")){
                    Toast.makeText(MainActivity.this,"vui long nhap so thu hai",Toast.LENGTH_SHORT).show();
                }else if(Integer.parseInt(so2.getText().toString()) == 0){
                    Toast.makeText(MainActivity.this,"so bi chia phai khac 0",Toast.LENGTH_SHORT).show();
                }else{
                    int num1 = Integer.parseInt(s1);
                    int num2 = Integer.parseInt(s2);
                    float result = num1 / num2;
                    kq.setText(String.valueOf(result));
                }
            }
        });
        //click vao nut xoa
        xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                so1.setText("");
                so2.setText("");
                kq.setText("");
                so1.requestFocus();
            }
        });

    }

    protected void anhxa(){
        so1 = (EditText) findViewById(R.id.so1);
        so2 = (EditText) findViewById(R.id.so2);
        cong = (Button) findViewById(R.id.cong);
        tru = (Button) findViewById(R.id.tru);
        nhan = (Button) findViewById(R.id.nhan);
        chia = (Button) findViewById(R.id.chia);
        xoa = (Button) findViewById(R.id.xoa);
        kq = (TextView) findViewById(R.id.ketqua);

    }
}