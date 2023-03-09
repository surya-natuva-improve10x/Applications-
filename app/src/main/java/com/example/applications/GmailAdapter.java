package com.example.applications;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class GmailAdapter extends BaseAdapter {
    public GmailItem[] items;

    public GmailAdapter(GmailItem[] gmailItems) {
        items = gmailItems;
    }

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
        GmailViewHolder viewHolder;
        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View view = inflater.inflate(R.layout.gmaiitems,parent,false);
            viewHolder = new GmailViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (GmailViewHolder) convertView.getTag();
        }
      GmailItem item =(GmailItem) getItem(position);


        viewHolder.title.setText(item.name);

        viewHolder.title2.setText(item.disc);

        viewHolder.title3.setText(item.time);

        Picasso.get().load(item.imageUrl).into(viewHolder.imageView);
        return convertView;
    }
}
