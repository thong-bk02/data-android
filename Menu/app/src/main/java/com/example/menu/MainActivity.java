package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //
        getMenuInflater().inflate(R.menu.layoutmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    //gọi hàm bắt sự kiện khi chọn vào menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.menuContact:
//                Toast.makeText(this, "ban chon menu contact", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.menuShare:
//                Toast.makeText(this, "ban chon menu share", Toast.LENGTH_LONG).show();
//                break;
//            case R.id.menuPanel:
//                Toast.makeText(this, "ban chon menu panel", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.menuSetting:
//                Toast.makeText(this, "ban chon menu setting", Toast.LENGTH_LONG).show();
//                break;
//            case R.id.Phone:
//                Toast.makeText(this, "ban chon menu phone", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.Address:
//                Toast.makeText(this, "ban chon menu address", Toast.LENGTH_LONG).show();
//                break;
//        }
        return super.onOptionsItemSelected(item);
    }
}