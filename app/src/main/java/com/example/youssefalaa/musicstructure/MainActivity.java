package com.example.youssefalaa.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// Find the View that shows the nNowPlaying category
        final TextView Now_playing = (TextView) findViewById(R.id.now__playing);
        // Find the View that shows the Albums category
        TextView Albums = (TextView) findViewById(R.id.albums);
        // Find the View that shows the PlayLists category
        TextView play_lists = (TextView) findViewById(R.id.play_lists);
        // Find the View that shows the Search category
        TextView buy_Online = (TextView) findViewById(R.id.buy_online);

///////////////////
        Now_playing.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View view)
           {
               Intent nowPlaying = new Intent(MainActivity.this,Now_Playing.class);
               startActivity(nowPlaying);
           }
                });
////////////////////////
        Albums.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent albums = new Intent(MainActivity.this,Albums.class);
                startActivity(albums);
            }
        });
///////////////////////
        buy_Online.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent buyOnline = new Intent(MainActivity.this,buyOnline.class);
                startActivity(buyOnline);
            }
        });
////////////////////
        play_lists.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent playLists = new Intent(MainActivity.this,playLists.class);
                startActivity(playLists);
            }
        });


    }

}
