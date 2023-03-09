package com.example.applications;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CallViewHolder {
    TextView title;
    TextView title2;
    ImageView imageView;

    public  CallViewHolder(View covertView){
        title = covertView.findViewById(R.id.name_txt);
        title2 = covertView.findViewById(R.id.time1_txt);
        imageView = covertView.findViewById(R.id.callpos_iv);
    }
}
