package com.example.applications;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FaceBookViewHolder {
    public TextView title;
    public TextView title2;
    public ImageView imageView;

    public FaceBookViewHolder(View convertView){
        title = convertView.findViewById(R.id.note_txt);
        title2 = convertView.findViewById(R.id.timedate_txt);
        imageView = convertView.findViewById(R.id.facebookpos_iv);
    }
}
