package com.example.youssefalaa.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.os.Build.VERSION_CODES.N;

public class Now_Playing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now__playing);
        Button struct = (Button) findViewById(R.id.Struct);
        Button search = (Button) findViewById(R.id.Search);
        Button album = (Button) findViewById(R.id.album);
        Button play = (Button) findViewById(R.id.play);

        struct.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent struct = new Intent(Now_Playing.this,MainActivity.class);
                startActivity(struct);
            }
        });
        /////////////////////
        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent search = new Intent(Now_Playing.this,buyOnline.class);
                startActivity(search);
            }
        });
        ///////////////////
        album.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent album = new Intent(Now_Playing.this,Albums.class);
                startActivity(album);
            }
        });
        ///////////////////////
        play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent play = new Intent(Now_Playing.this,playLists.class);
                startActivity(play);
            }
        });
    }
}
