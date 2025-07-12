package com.example.myfirstinternapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickButton = findViewById(R.id.clickButton);
        clickButton.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Button clicked!", Toast.LENGTH_SHORT).show()
        );
    }
}
