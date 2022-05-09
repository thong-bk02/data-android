package com.example.exam2;

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
    EditText num1,num2;
    TextView tvfomula,tvresult;
    Button btnchoose,btnresult;
    String calculation="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();

        btnchoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((num1.getText().toString()).equals(null) ||(num1.getText().toString()).equals("")){
                    Toast.makeText(MainActivity.this, "bạn chưa nhập số thứ 1", Toast.LENGTH_SHORT).show();
                }else if((num2.getText().toString()).equals(null) ||(num2.getText().toString()).equals("")){
                    Toast.makeText(MainActivity.this, "bạn chưa nhập số thứ 2", Toast.LENGTH_SHORT).show();
                }else{
                    Intent i = new Intent(MainActivity.this, MainActivity2.class);
                    startActivityForResult(i, 999 );}
            }
        });


        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sno1= num1.getText().toString();
                String sno2= num2.getText().toString();

                    int no1= Integer.parseInt(sno1);
                    int no2= Integer.parseInt(sno2);
                    tvfomula.setText("fomula: " + no1 + " ? "+ no2 );

                    switch (calculation){
                        case "+": {
                            tvresult.setText("Kết quả:" +(no1 + no2));
                            tvfomula.setText("fomula: " + no1 +" " + calculation +" " + no2 );
                            break;
                        }
                        case "-": {
                            tvresult.setText("Kết quả:" +(no1 - no2) );
                            tvfomula.setText("fomula: " + no1 +" " + calculation +" " + no2 );
                            break;
                        }
                        case "*": {
                            tvresult.setText("Kết quả:" +(no1 * no2));
                            tvfomula.setText("fomula: " + no1 +" " + calculation +" " + no2 );
                            break;
                        }
                        case "/": {
                            if (no2==0 ) {
                                tvfomula.setText("fomula: " + no1 +" " + calculation +" " + no2 );
                                Toast.makeText(MainActivity.this, "Không thể chia cho 0", Toast.LENGTH_SHORT).show();
                            }else{
                                tvresult.setText("Kết quả:" +(no1*1.0/ no2));
                                tvfomula.setText("fomula: " + no1 +" " + calculation +" " + no2 );
                            }
                            break;
                        }
                    }
                }


        });
    }

    public void anhxa(){
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        tvfomula = (TextView) findViewById(R.id.tvformula);
        tvresult = (TextView) findViewById(R.id.tvresult);
        btnchoose = (Button) findViewById(R.id.btnchoose);
        btnresult = (Button) findViewById(R.id.btnresult);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode ==999 && resultCode == RESULT_OK){
            String cal= data.getStringExtra("string");
            calculation = cal;
        }

    }
}