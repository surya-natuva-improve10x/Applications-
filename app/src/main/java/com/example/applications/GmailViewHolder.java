package com.example.applications;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GmailViewHolder {
    TextView title;
    TextView title2;
    TextView title3;
    ImageView imageView;

    public GmailViewHolder(View convertView){
        title = convertView.findViewById(R.id.user_txt);
        title2 = convertView.findViewById(R.id.message_txt);
        title3 = convertView.findViewById(R.id.time_txt);
        imageView = convertView.findViewById(R.id.gmailurl_iv);
    }
}
