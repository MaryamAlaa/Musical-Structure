package com.example.youssefalaa.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.youssefalaa.musicstructure.R.id.play;

public class playLists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_lists);
        Button struct = (Button) findViewById(R.id.Struct);
        Button search = (Button) findViewById(R.id.search);
        Button album = (Button) findViewById(R.id.album);
        Button play_now = (Button) findViewById(R.id.play_now);

        struct.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent struct = new Intent(playLists.this,MainActivity.class);
                startActivity(struct);
            }
        });
        /////////////////////
        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent search = new Intent(playLists.this,buyOnline.class);
                startActivity(search);
            }
        });
        ///////////////////
        album.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent album = new Intent(playLists.this,Albums.class);
                startActivity(album);
            }
        });
        ///////////////////////
        play_now.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent play = new Intent(playLists.this,Now_Playing.class);
                startActivity(play);
            }
        });
    }
}
