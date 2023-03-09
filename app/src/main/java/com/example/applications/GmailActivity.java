package com.example.applications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class GmailActivity extends AppCompatActivity {
    ListView gmailLv;
    public GmailItem[] gmailItems;
    public GmailAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail);
        initViews();
        createGmailData();
        setAdapter();
        connenctAdapter();
    }

    private void connenctAdapter() {
        gmailLv.setAdapter(adapter);
    }

    private void setAdapter() {
        adapter = new GmailAdapter(gmailItems);
    }

    private void createGmailData() {
        gmailItems = new GmailItem[7];
        GmailItem item1 = new GmailItem();
        item1.disc = "Hi Julia! Thank you for your interest in volun...Elena Casarosa";
        item1.imageUrl = "https://o.remove.bg/downloads/fe63dd61-4fed-4bd8-b464-8a6cf6d101b5/person-girl-outline-filled-removebg-preview.png";
        item1.name ="Lisa Paik";
        item1.time = "3:43 PM";
        gmailItems[0]=item1;

        GmailItem item2 = new GmailItem();
        item2.disc = "Hi Julia! Thank you for your interest in volun...";
        item2.imageUrl = "https://o.remove.bg/downloads/722e893c-8e6e-44c5-8ab1-4db7dd2d0e63/v3_0145795-removebg-preview.png";
        item2.name ="Elena Casarosa";
        item2.time = "4:00 am";
        gmailItems[1]=item2;

        GmailItem item3 = new GmailItem();
        item3.disc = "Hi grace! Thank you for your interest in volun...";
        item3.imageUrl = "https://o.remove.bg/downloads/dc35bf5c-7224-499d-9b30-f4d125cbf5ab/images-removebg-preview.png";
        item3.name ="Grace Ellington";
        item3.time = "10:00 pm";
        gmailItems[2]=item3;

        GmailItem item4 = new GmailItem();
        item4.disc = "Hi herni! Thank you for your interest in volun...";
        item4.imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item4.name ="Henri Rousseau";
        item4.time = "3;00 pm";
        gmailItems[3]=item4;

        GmailItem item5 = new GmailItem();
        item5.disc = "Hi jhon! Thank you for your interest in volun...";
        item5.imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item5.name ="Jhon";
        item5.time = "2:00 pm";
        gmailItems[4]=item5;


        GmailItem item6 = new GmailItem();
        item6.disc = "Hi justin! Thank you for your interest in volun...";
        item6.imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
        item6.name ="justin";
        item6.time = "11:00 pm";
        gmailItems[5]=item6;


        GmailItem item7 = new GmailItem();
        item7.disc = "Hi robert! Thank you for your interest in volun...";
        item7.imageUrl = "https://o.remove.bg/downloads/01178b62-d84f-4f29-9f5a-db380a4463b4/Artboard-34-removebg-preview.png";
        item7.name ="robert";
        item7.time = "12:00 pm";
        gmailItems[6]=item7;


    }

    private void initViews() {
        gmailLv = findViewById(R.id.gmail_lv);
    }
}