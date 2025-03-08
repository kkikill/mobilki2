package com.example.mycalc;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class ConstraintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);

        TextView textView = findViewById(R.id.textView3);
        Button button = findViewById(R.id.button3);

        String text = getIntent().getStringExtra("text");
        textView.setText(text);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(ConstraintActivity.this, FrameActivity.class);
            intent.putExtra("text", text);
            startActivity(intent);
        });
    }
}