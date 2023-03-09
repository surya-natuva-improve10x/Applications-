package com.example.applications;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MessengerItemViewHolder {
    public TextView title;
    public TextView title2;
    public ImageView imageView;

    public MessengerItemViewHolder(View convertView){
        title = convertView.findViewById(R.id.username_txt);
        title2 = convertView.findViewById(R.id.msgs121_txt);
        imageView = convertView.findViewById(R.id.dp_iv);
    }
}
