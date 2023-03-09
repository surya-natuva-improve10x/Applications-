package com.example.applications;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MessengerAdapter extends BaseAdapter {
    public  MessengerItem[] items;
    public MessengerAdapter(MessengerItem[]messengerItems){items = messengerItems;}
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
        MessengerItemViewHolder viewHolder;
        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.messageitem,parent,false);
            viewHolder = new MessengerItemViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else {
            viewHolder =(MessengerItemViewHolder) convertView.getTag();
        }
        MessengerItem item = (MessengerItem) getItem(position);
        viewHolder.title.setText(item.username);
       viewHolder.title2.setText(item.msg);
        Picasso.get().load(item.profile).into(viewHolder.imageView);
        return convertView;
    }
}
