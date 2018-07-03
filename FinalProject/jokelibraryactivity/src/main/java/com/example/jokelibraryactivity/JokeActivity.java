package com.example.jokelibraryactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_INTENT_EXTRA = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(JOKE_INTENT_EXTRA)) {
            TextView textView = findViewById(R.id.joke_text);
            textView.setText(intent.getStringExtra(JOKE_INTENT_EXTRA));
        }
    }

}
