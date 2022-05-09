package com.example.connectionactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    Button btn2;
    EditText ed2;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn2 = (Button) findViewById(R.id.buttonActivity2);
        ed2 = (EditText) findViewById(R.id.edt2);

        Intent intent = getIntent();

        Bundle bundle = intent.getBundleExtra("dataBundle");
        //khai bao cac bien de nhan du lieu tu bundle
        int so;
        String chuoi;
        String[] mang;
        HocSinh hocSinh;
        so = bundle.getInt("number");
        chuoi = bundle.getString("string");
        mang = bundle.getStringArray("phone");
        hocSinh =(HocSinh) bundle.getSerializable("student");
        ed2.setText("information: Chuoi " + chuoi +" So: " +so+ " Mang[2]: " + mang[2] + " Name: " + hocSinh.getName() );

//        HocSinh hs = (HocSinh) intent.getSerializableExtra("student");
//        ed2.setText("Name:" + hs.getName() +" Age:"+ hs.getAge());

//        String[] bientam = intent.getStringArrayExtra("mang1");
//        ed2.setText(bientam.length +" "+ bientam[1]);

//        String mess1 = intent.getStringExtra("txt1");
//        ed2.setText(mess1);

//        Integer int1 = intent.getIntExtra("so1",0);// 0 là giá trị mặc định
//        ed2.setText(int1.toString());

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}