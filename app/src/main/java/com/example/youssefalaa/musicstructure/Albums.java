package com.example.youssefalaa.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
        Button struct = (Button) findViewById(R.id.Struct);
        Button search = (Button) findViewById(R.id.search);
        Button now = (Button) findViewById(R.id.now);
        Button play = (Button) findViewById(R.id.play);

        struct.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent struct = new Intent(Albums.this,MainActivity.class);
                startActivity(struct);
            }
        });
        /////////////////////
        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent search = new Intent(Albums.this,buyOnline.class);
                startActivity(search);
            }
        });
        ///////////////////
        now.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent now = new Intent(Albums.this,Now_Playing.class);
                startActivity(now);
            }
        });
        ///////////////////////
        play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent play = new Intent(Albums.this,playLists.class);
                startActivity(play);
            }
        });
    }
}
