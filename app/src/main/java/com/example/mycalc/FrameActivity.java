package com.example.mycalc;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FrameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        TextView textView = findViewById(R.id.textView4);
        Button button = findViewById(R.id.button4);

        String text = getIntent().getStringExtra("text");
        textView.setText(text);

        button.setOnClickListener(v -> {
            finish(); // Возврат на предыдущую Activity
        });
    }
}