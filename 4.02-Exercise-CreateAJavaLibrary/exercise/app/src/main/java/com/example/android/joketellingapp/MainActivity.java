package com.example.android.joketellingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.android.jokemodule.JokeSmith;
import com.example.android.jokewizard.JokeWizard;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JokeSmith js = new JokeSmith();
        ((TextView)findViewById(R.id.jokeWizard)).setText(js.getJoke());

        JokeWizard jw = new JokeWizard();
        ((TextView)findViewById(R.id.jokeWizard)).setText(jw.getJoke());
    }
}
