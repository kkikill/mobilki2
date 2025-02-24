package com.example.mycalc;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    private static final String TAG = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView messageText = new TextView(this);
        messageText.setTextSize(26);
        messageText.setPadding(16, 16, 16, 16);

        Bundle arguments = getIntent().getExtras();
        if (arguments != null) {
            String fio = arguments.getString("fio", "Unknown");
            String group = arguments.getString("group", "Unknown");
            int age = arguments.getInt("age", 0);
            int res = arguments.getInt("res", 0);

            messageText.setText("Имя: " + fio +
                    "\nГруппа: " + group +
                    "\nВозраст: " + age +
                    "\nХочу оценку: " + res);
        } else {
            messageText.setText("Надо нажать на розовый!");
        }

        setContentView(messageText);
        Log.d(TAG, "onCreate() called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }
}
