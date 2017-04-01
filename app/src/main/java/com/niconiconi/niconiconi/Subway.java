package com.niconiconi.niconiconi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

/**
 * Created by wook2 on 2017-04-01.
 */

public class Subway extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String[] li = {"1호선","2호선","3호선"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subway);

        Spinner sp1 = (Spinner)findViewById(R.id.sp1);
        sp1.setPrompt("호선 선택");
        ArrayAdapter<String> list;
        list = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,li);
        sp1.setAdapter(list);
        sp1.setOnItemSelectedListener(this);

        ListView li;
        Lia lia;

        lia = new Lia();

        li = (ListView)findViewById(R.id.li1);
        li.setAdapter(lia);

        lia.addItem(ContextCompat.getDrawable(this,R.mipmap.sinrim));
        lia.addItem(ContextCompat.getDrawable(this,R.mipmap.gangnam));
        lia.addItem(ContextCompat.getDrawable(this,R.mipmap.gyedae));
        lia.addItem(ContextCompat.getDrawable(this,R.mipmap.sadang));
        lia.addItem(ContextCompat.getDrawable(this,R.mipmap.seouluni));

        li.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Listviewitem lvi = (Listviewitem)parent.getItemAtPosition(position);
                Drawable ib = lvi.getib();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        //TODO Auto-generated method stub

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //TODO Auto-generated method stub
    }
}
