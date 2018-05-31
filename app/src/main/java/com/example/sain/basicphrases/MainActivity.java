package com.example.sain.basicphrases;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Button button = (Button) view;
        String filename = button.getText().toString().replace(" ", "_");

        int resId = getResources().getIdentifier(filename, "raw", getPackageName());

        mediaPlayer = MediaPlayer.create(this, resId);
        mediaPlayer.start();
    }
}
