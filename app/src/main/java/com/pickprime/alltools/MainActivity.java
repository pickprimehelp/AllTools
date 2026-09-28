package com.pickprime.alltools;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        EditText searchBox = findViewById(R.id.searchBox);

        Button weddingButton = findViewById(R.id.weddingButton);
        Button statusButton = findViewById(R.id.statusButton);
        Button reelsButton = findViewById(R.id.reelsButton);

        Button textToolsButton = findViewById(R.id.textToolsButton);
        Button imageToolsButton = findViewById(R.id.imageToolsButton);
        Button pdfToolsButton = findViewById(R.id.pdfToolsButton);
        Button calculatorButton = findViewById(R.id.calculatorButton);
        Button developerButton = findViewById(R.id.developerButton);

        // Temporary buttons.
        // Real tool screens will be added step-by-step.

        weddingButton.setOnClickListener(v ->
                showMessage("Wedding Card Maker"));

        statusButton.setOnClickListener(v ->
                showMessage("Status Maker"));

        reelsButton.setOnClickListener(v ->
                showMessage("Reels Maker"));

        textToolsButton.setOnClickListener(v ->
                showMessage("Text Tools"));

        imageToolsButton.setOnClickListener(v ->
                showMessage("Image Tools"));

        pdfToolsButton.setOnClickListener(v ->
                showMessage("PDF Tools"));

        calculatorButton.setOnClickListener(v ->
                showMessage("Calculator"));

        developerButton.setOnClickListener(v ->
                showMessage("Developer Tools"));
    }

    private void showMessage(String message) {
        android.widget.Toast.makeText(
                this,
                message + " - Coming Soon",
                android.widget.Toast.LENGTH_SHORT
        ).show();
    }
}
