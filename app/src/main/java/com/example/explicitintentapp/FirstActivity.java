package com.example.explicitintentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

/**
 * FirstActivity - Represents Activity 1
 * Demonstrates launching SecondActivity using an Explicit Intent.
 */
public class FirstActivity extends AppCompatActivity {

    private Button btnGoToSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnGoToSecond = findViewById(R.id.btnGoToSecond);

        btnGoToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit Intent: explicitly specifying target class SecondActivity.class
                Intent explicitIntent = new Intent(FirstActivity.this, SecondActivity.class);
                
                // Show feedback toast
                Toast.makeText(FirstActivity.this, "Navigating to Second Activity via Explicit Intent", Toast.LENGTH_SHORT).show();
                
                // Launch the target activity
                startActivity(explicitIntent);
            }
        });
    }
}
