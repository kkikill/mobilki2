package com.example.mycalc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            String text = editText.getText().toString();
            Intent intent = new Intent(MainActivity.this, RelativeActivity.class);
            intent.putExtra("text", text);
            startActivity(intent);
        });
    }
}