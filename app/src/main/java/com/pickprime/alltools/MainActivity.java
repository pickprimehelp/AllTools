package com.pickprime.alltools;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button weddingButton = findViewById(R.id.weddingButton);
        Button statusButton = findViewById(R.id.statusButton);
        Button reelsButton = findViewById(R.id.reelsButton);

        Button textToolsButton = findViewById(R.id.textToolsButton);
        Button imageToolsButton = findViewById(R.id.imageToolsButton);
        Button pdfToolsButton = findViewById(R.id.pdfToolsButton);
        Button calculatorButton = findViewById(R.id.calculatorButton);
        Button developerButton = findViewById(R.id.developerButton);

        textToolsButton.setOnClickListener(v ->
                openTools("Text Tools"));

        imageToolsButton.setOnClickListener(v ->
                openTools("Image Tools"));

        pdfToolsButton.setOnClickListener(v ->
                openTools("PDF Tools"));

        calculatorButton.setOnClickListener(v ->
                openTools("Calculator"));

        developerButton.setOnClickListener(v ->
                openTools("Developer Tools"));

        // These screens will be built next.
        weddingButton.setOnClickListener(v ->
                openTools("Wedding Card Maker"));

        statusButton.setOnClickListener(v ->
                openTools("Status Maker"));

        reelsButton.setOnClickListener(v ->
                openTools("Reels Maker"));
    }

    private void openTools(String category) {
        Intent intent = new Intent(this, ToolListActivity.class);
        intent.putExtra("category", category);
        startActivity(intent);
    }
}
