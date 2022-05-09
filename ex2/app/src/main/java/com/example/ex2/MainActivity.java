package com.example.ex2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt1, edt2, edtkq;
    TextView tvphep;
    Button btnchon, btntinh;
    String pheptinh="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        edtkq = findViewById(R.id.edtkq);
        tvphep = findViewById(R.id.tvpheptinh);
        btnchon= findViewById(R.id.btnchon);
        btntinh= findViewById(R.id.btntinh);

        btnchon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);

                startActivityForResult(i, 999 );
            }
        });

        btntinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sno1= edt1.getText().toString();
                String sno2= edt2.getText().toString();

                try {
                    int no1= Integer.parseInt(sno1);
                    int no2= Integer.parseInt(sno2);
                    tvphep.setText("Phep tinh: " + no1 + pheptinh+ no2+ "=" );

                    switch (pheptinh){
                        case "+": {
                            edtkq.setText("Kết quả:" +(no1+ no2));
                            break;
                        }
                        case "-": {
                            int q= no1- no2;
                            edtkq.setText("Kết quả:" +q );
                            break;
                        }
                        case "*": {
                            edtkq.setText("Kết quả:" +(no1* no2));
                            break;
                        }
                        case "/": {
                            if (no2==0 ) {
                                Toast.makeText(MainActivity.this, "Không thể chia cho 0", Toast.LENGTH_SHORT).show();
                            }else{
                                edtkq.setText("Kết quả:" +(no1*1.0/ no2));
                            }
                            break;
                        }
                    }
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "hãy nhập số", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode ==999 && resultCode == RESULT_OK){
            String phep= data.getStringExtra("str");
            pheptinh=phep;
        }

    }
}
