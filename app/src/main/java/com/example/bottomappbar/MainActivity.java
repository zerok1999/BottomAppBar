package com.example.bottomappbar;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import android.os.Bundle;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton floatingActionButton;
    BottomAppBar bottomAppBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatingActionButton = findViewById(R.id.fab);
        bottomAppBar = findViewById(R.id.bottomAppBar);
        //main line for setting menu in bottom app bar
        setSupportActionBar(bottomAppBar);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"174020217 张坤" ,Snackbar.LENGTH_LONG)
                        .setAction("UNDO",null)
                        .show();
            }
        });
    }
    private void setSupportActionBar(BottomAppBar bottomAppBar) {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.bottom_app_bar, menu);
        return true;
    }
}
