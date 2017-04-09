package com.example.youssefalaa.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class buyOnline extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_online);
        Button struct = (Button) findViewById(R.id.Struct);
        Button Now_playing  = (Button) findViewById(R.id.now);
        Button album = (Button) findViewById(R.id.album);
        Button play = (Button) findViewById(R.id.play);

        struct.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent struct = new Intent(buyOnline.this,MainActivity.class);
                startActivity(struct);
            }
        });
        /////////////////////
        Now_playing.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent Now_playing = new Intent(buyOnline.this,Now_Playing.class);
                startActivity(Now_playing);
            }
        });
        ///////////////////
        album.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent album = new Intent(buyOnline.this,Albums.class);
                startActivity(album);
            }
        });
        ///////////////////////
        play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent play = new Intent(buyOnline.this,playLists.class);
                startActivity(play);
            }
        });
    }
}
