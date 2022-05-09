package com.example.popupmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Menu = (Button) findViewById(R.id.button);

        Menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowMenu();
            }
        });
    }
    private void ShowMenu(){
        PopupMenu popupMenu = new PopupMenu(this , Menu);
        popupMenu.getMenuInflater().inflate(R.menu.popuplayout,popupMenu.getMenu());
        //sự kiện khi nhấn vào các option của popupMENU
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.menuContact:
                        Menu.setText("Contact");
                        break;
                    case R.id.menuShare:
                        Menu.setText("Share");
                        break;
                    case R.id.menuPanel:
                        Menu.setText("Panel");
                        break;
                    case R.id.menuSetting:
                        Menu.setText("Setting");
                        break;
                    case R.id.Phone:
                        Menu.setText("Phone");
                        break;
                    case R.id.Address:
                        Menu.setText("Address");
                        break;
                }
                return false;
            }
        });
        popupMenu.show();
    }
}