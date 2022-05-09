package com.example.b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class layout2 extends AppCompatActivity {
    TextView user,feedback;
    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);

        anhxa();
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("dataBundle");
        String[] mang = bundle.getStringArray("User");
        user.setText(mang[0]);
        feedback.setText(mang[1]);

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(layout2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void anhxa(){
        user = (TextView) findViewById(R.id.tvuser);
        feedback = (TextView) findViewById(R.id.tvfeedback);
        btnback = (Button) findViewById(R.id.btnback);
    }
}