package com.niconiconi.niconiconi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by wook2 on 2017-04-01.
 */

public class Theme extends AppCompatActivity {

    ImageButton bt1, bt2, bt3, bt4;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.theme);
        bt1 = (ImageButton)findViewById(R.id.bt1);
        bt2 = (ImageButton)findViewById(R.id.bt2);
        bt3 = (ImageButton)findViewById(R.id.bt3);
        bt4 = (ImageButton)findViewById(R.id.bt4);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Theme.this,Subway.class);
                startActivity(i);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Theme.this,Subway.class);
                startActivity(i);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Theme.this,Subway.class);
                startActivity(i);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Theme.this,Subway.class);
                startActivity(i);
            }
        });
    }
}
