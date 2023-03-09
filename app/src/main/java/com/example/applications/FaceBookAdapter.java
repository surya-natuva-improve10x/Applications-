package com.example.applications;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class FaceBookAdapter extends BaseAdapter {
    public  FaceBookItem[] items;
    public FaceBookAdapter(FaceBookItem[]faceBookItems){items=faceBookItems;}
    @Override
    public int getCount() {
        return items.length;}


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
        FaceBookViewHolder viewHolder;
        if(convertView == null){
            LayoutInflater inflater =LayoutInflater.from(parent.getContext());
            View view = inflater.inflate(R.layout.facebookitem,parent,false);
            viewHolder = new FaceBookViewHolder(convertView);
           convertView.setTag(viewHolder);
        }else{
            viewHolder =(FaceBookViewHolder) convertView.getTag();
        }
        FaceBookItem item =(FaceBookItem) getItem(position);


       viewHolder.title.setText(item.message);
        viewHolder.title2.setText(item.time2);
        Picasso.get().load(item.imageUrl2).into(viewHolder.imageView);
        return convertView;
    }
}
