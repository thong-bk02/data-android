package com.example.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnmenu;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmenu = (Button) findViewById(R.id.button);
        layout = (ConstraintLayout) findViewById(R.id.layout);

        //đăng ký context menu cho nút btn
        registerForContextMenu(btnmenu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.contextlayout,menu);
        menu.setHeaderTitle("chon mau");
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.yellow:
                layout.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.red:
                layout.setBackgroundColor(Color.RED);
                break;
            case R.id.black:
                layout.setBackgroundColor(Color.BLACK);
                break;
            case R.id.none:
                layout.setBackgroundColor(Color.WHITE);
                break;
        }
        return super.onContextItemSelected(item);
    }
}