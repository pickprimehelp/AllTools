package com.pickprime.alltools;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ToolListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tool_list);

        TextView titleText = findViewById(R.id.titleText);
        TextView subtitleText = findViewById(R.id.subtitleText);

        String category = getIntent().getStringExtra("category");

        if (category == null) {
            category = "Tools";
        }

        titleText.setText(category);
        subtitleText.setText(
                "Tools in " + category + " will appear here."
        );
    }
}
