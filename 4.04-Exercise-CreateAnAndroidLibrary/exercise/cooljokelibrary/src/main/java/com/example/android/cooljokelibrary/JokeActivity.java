package com.example.android.cooljokelibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.jokemodule.JokeSmith;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView tv = (TextView) findViewById(R.id.joke_text);

        JokeSmith js = new JokeSmith();
        tv.setText(js.getJoke());

    }
}
