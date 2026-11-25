package com.example.explicitintentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

/**
 * SecondActivity - Represents Activity 2
 * Navigates back to FirstActivity upon clicking the button.
 */
public class SecondActivity extends AppCompatActivity {

    private Button btnReturnFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnReturnFirst = findViewById(R.id.btnReturnFirst);

        btnReturnFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit Intent: explicitly specifying target class FirstActivity.class
                Intent returnIntent = new Intent(SecondActivity.this, FirstActivity.class);
                returnIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                
                Toast.makeText(SecondActivity.this, "Returning to First Activity", Toast.LENGTH_SHORT).show();
                
                startActivity(returnIntent);
                finish(); // Close SecondActivity
            }
        });
    }
}
