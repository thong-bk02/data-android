package com.example.oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView hienthi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //anh xa
        hienthi = (TextView) findViewById(R.id.hienthi);

        //tạo đối tượng mới
        SinhVien[] sv = new  SinhVien[10];
        for (int i =0; i < 10; i++){
            sv[i] = new SinhVien();
            sv[i].setStt(i);
            hienthi.setText(hienthi.getText() +"\n" +sv[i].getStt());
        }




    }
}