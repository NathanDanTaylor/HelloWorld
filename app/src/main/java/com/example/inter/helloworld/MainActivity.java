package com.example.inter.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Hello Nata!", Toast.LENGTH_SHORT).show();
    }

    public void btnPopup(View view) {
        Toast.makeText(this, "Hello Nata!", Toast.LENGTH_SHORT).show();
    }
}
