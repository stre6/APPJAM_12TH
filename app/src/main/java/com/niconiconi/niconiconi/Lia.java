package com.niconiconi.niconiconi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;

import java.util.ArrayList;

/**
 * Created by wook2 on 2017-04-01.
 */

public class Lia extends BaseAdapter{

    ArrayList<Listviewitem> listviewitems = new ArrayList<>();

    public Lia(){

    }

    @Override
    public int getCount() {
        return listviewitems.size();
    }

    @Override
    public Object getItem(int position) {
        return listviewitems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        int pos = position;
        Context context = parent.getContext();

        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listviewitem,parent,false);
        }
        ImageButton ib = (ImageButton)convertView.findViewById(R.id.liib);

        Listviewitem listviewitem = listviewitems.get(position);

        ib.setImageDrawable(listviewitem.getib());

        return convertView;
    }

    public void addItem(Drawable ib){
        Listviewitem li = new Listviewitem();

        li.setib(ib);

        listviewitems.add(li);
    }
}
