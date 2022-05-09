package com.example.b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView user,feedback;
    Button btnsend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();
        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = user.getText().toString();
                String fback = feedback.getText().toString();
                if(name.equals(null) ||name.equals("")){
                    Toast.makeText(MainActivity.this, "bạn chưa nhập tên", Toast.LENGTH_SHORT).show();
                }else  if(fback.equals(null) ||fback.equals("")){
                    Toast.makeText(MainActivity.this, "bạn chưa nhập phản hồi", Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(MainActivity.this,layout2.class);
                    String[] mang = {name,fback};
                    Bundle bundle = new Bundle();
                    bundle.putStringArray("User",mang);
                    intent.putExtra("dataBundle",bundle);
                    startActivity(intent);
                }
            }
        });
    }

    public void anhxa(){
        user = (TextView) findViewById(R.id.username);
        feedback = (TextView) findViewById(R.id.feedback);
        btnsend = (Button) findViewById(R.id.btnsend);
    }
}