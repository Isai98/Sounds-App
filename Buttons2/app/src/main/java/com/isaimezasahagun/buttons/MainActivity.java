package com.isaimezasahagun.buttons;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button playsms;
    private Button playgun;
    private Button r2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeApp();
    }

    private void initializeApp() {


        playsms = (Button) findViewById(R.id.buttonsms);
        playsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                smsplay();
            }
        });

        playgun = (Button) findViewById(R.id.buttongun);
        playgun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                magnumplay();
            }
        });

        r2 = (Button) findViewById(R.id.buttonr2);
        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                starwarsplay();
            }
        });
    }


    public void magnumplay() {
        final MediaPlayer slap = MediaPlayer.create(this, R.raw.magnum);
        slap.start();

    }

    public void smsplay() {
        final MediaPlayer badumtss = MediaPlayer.create(this, R.raw.sms);
        badumtss.start();

    }

    public void starwarsplay() {
        final MediaPlayer shot = MediaPlayer.create(this, R.raw.starwars1);
        shot.start();

    }



}