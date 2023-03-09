package com.example.applications;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class CallAdapter extends BaseAdapter {
    public CallItem[] items;
    public CallAdapter(CallItem[]callItems){items=callItems;}
    @Override
    public int getCount() {
        return items.length;
    }


    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CallViewHolder viewHolder;
        if(convertView == null){
            LayoutInflater inflater =LayoutInflater.from(parent.getContext());
            View view = inflater.inflate(R.layout.calllogoitem,parent,false);
            viewHolder = new CallViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (CallViewHolder) convertView.getTag();
        }
        CallItem item =(CallItem) getItem(position);


        viewHolder.title.setText(item.contactName);

        viewHolder.title2.setText(item.disc);

        Picasso.get().load(item.image).into(viewHolder.imageView);
        return convertView;

    }


}
