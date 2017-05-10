package com.example.android.mediaplayercode;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MediaPlayerMaine extends AppCompatActivity {

    private MediaPlayer mediaPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player_maine);

        mediaPlayer = MediaPlayer.create(this, R.raw.level_up);



        Button playbutton = (Button)findViewById(R.id.playbutton);
        playbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mediaPlayer.start();
            }
        });
        Button pausebutton = (Button)findViewById(R.id.pausebutton);
        pausebutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mediaPlayer.pause();
            }
        });
    }
}
