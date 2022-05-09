package com.example.exmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class kq extends AppCompatActivity {
    TextView kq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kq);
        kq = (TextView) findViewById(R.id.textView3);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("listfood");
        String dish = bundle.getString("choosefood");
        kq.setText(dish);

    }

}