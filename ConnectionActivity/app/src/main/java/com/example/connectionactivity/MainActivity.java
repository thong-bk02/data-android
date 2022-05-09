package com.example.connectionactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ánh xạ
        btn1 = (Button) findViewById(R.id.buttonActivity1);

        //click vào btn1 thì chuyển sang second activity
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);//hai tham số (màn hình hiện tại, màn hình cần chuyển tới)
                //truyền dữ liệu vào
//                String mess1 = ed1.getText().toString();

                //truyền dữ liệu dưới dạng mảng
//                String[] mang = {"oppo","iphone","samsung","nokia"};
//                intent.putExtra("mang1",mang);

//                intent.putExtra("txt1",mess1);//hai tham số (tên biến, dữ liệu truyền đi)
//                intent.putExtra("so1",2022); //truyền dữ liệu dưới dạng số

//                //truyen du lieu duoi dang Object
//                HocSinh hs = new HocSinh("thong",2001);
//                intent.putExtra("student",hs);

                String[] mang = {"oppo","iphone","samsung","nokia"};
                HocSinh hs = new HocSinh("thong",2001);
                //Khai báo 1 Bundle de truyen du lieu
                Bundle bundle = new Bundle();
                //dung bundle de thuc hien gui du lieu
                bundle.putSerializable("student",hs);
                bundle.putStringArray("phone",mang);
                bundle.putInt("number",123);
                bundle.putString("string","dinh minh thong");
                //dung intent de truyen du lieu tu activity nay sang activity khac
                intent.putExtra("dataBundle",bundle);

                startActivity(intent);
            }
        });
    }


}