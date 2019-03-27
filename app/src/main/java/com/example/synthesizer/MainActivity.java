package com.example.synthesizer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button bt;
    Button b;
    private Object raw;


    private void delayPlaying(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button) findViewById(R.id.button3);
        final int WHOLE_NOTE = 1000;
        final int HALF_NOTE = 500;

        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.scalea);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.scalea);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.scalehighe);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.scalehighe);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.scalehighfs);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.scalehighfs);
        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.scalehighe);
        final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.scaled);
        final MediaPlayer mp9 = MediaPlayer.create(this, R.raw.scaled);
        final MediaPlayer mp10 = MediaPlayer.create(this, R.raw.scalecs);
        final MediaPlayer mp11 = MediaPlayer.create(this, R.raw.scalecs);
        final MediaPlayer mp12 = MediaPlayer.create(this, R.raw.scaleb);
        final MediaPlayer mp13 = MediaPlayer.create(this, R.raw.scaleb);
        final MediaPlayer mp14 = MediaPlayer.create(this, R.raw.scalea);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("SynthesizerActivity","Audio playback interrupted");
                mp1.start();
                delayPlaying(HALF_NOTE);
                mp2.start();
                delayPlaying(HALF_NOTE);
                mp3.start();
                delayPlaying(HALF_NOTE);
                mp4.start();
                delayPlaying(HALF_NOTE);
                mp5.start();
                delayPlaying(HALF_NOTE);
                mp6.start();
                delayPlaying(HALF_NOTE);
                mp7.start();
                delayPlaying(WHOLE_NOTE);
                mp8.start();
                delayPlaying(HALF_NOTE);
                mp9.start();
                delayPlaying(HALF_NOTE);
                mp10.start();
                delayPlaying(HALF_NOTE);
                mp11.start();
                delayPlaying(HALF_NOTE);
                mp12.start();
                delayPlaying(HALF_NOTE);
                mp13.start();
                delayPlaying(HALF_NOTE);
                mp14.start();
                b = (Button) findViewById(R.id.button4);
                final MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.scalef);
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();
            }







                    });
                }
        });
    }
}



