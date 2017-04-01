package com.niconiconi.niconiconi;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by wook2 on 2017-04-01.
 */

public class Subway extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subway);

        ListView li;
        Lia lia;

        lia = new Lia();

        li = (ListView)findViewById(R.id.li1);
        li.setAdapter(lia);

        //lia.addItem(ContextCompat.getDrawable(this,));

        li.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Listviewitem lvi = (Listviewitem)parent.getItemAtPosition(position);

                Drawable ib = lvi.getib();
            }
        });
    }
}
