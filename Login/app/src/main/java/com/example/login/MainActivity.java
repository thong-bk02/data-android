package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inputname;
    EditText inputpassword;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputname = (EditText) findViewById(R.id.name);
        inputpassword = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = inputname.getText().toString();
                String password = inputpassword.getText().toString();
                if(name.equals(null) ||name.equals("")){
                    Toast.makeText(MainActivity.this, "bạn chưa nhập tên", Toast.LENGTH_SHORT).show();
                }else if(password.equals(null) || password.equals("")){
                    Toast.makeText(MainActivity.this, "bạn chưa nhập mật khẩu", Toast.LENGTH_SHORT).show();
                }else if(name.equals("admin") == false){
                    Toast.makeText(MainActivity.this, "bạn nhập sai tên", Toast.LENGTH_SHORT).show();
                }else if(password.equals("123") == false){
                    Toast.makeText(MainActivity.this, "bạn nhập sai mật khẩu", Toast.LENGTH_SHORT).show();
                }
                else if (name.equals("admin") && password.equals("123")){
                    Intent intent = new Intent(MainActivity.this,Login.class);
                    intent.putExtra("username",name);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "bạn nhập sai tên và mật khẩu", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}