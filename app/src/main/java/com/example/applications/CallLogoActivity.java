package com.example.applications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class CallLogoActivity extends AppCompatActivity {
    ListView calllogoIv;
    public CallItem[] callItems;
    public CallAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_logo);
        initViews();
        createCallLogoData();
        setUpAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        calllogoIv.setAdapter(adapter);
    }

    private void setUpAdapter() {
        adapter = new CallAdapter(callItems);
    }

    private void createCallLogoData() {
        callItems = new CallItem[7];
        CallItem item1 = new CallItem();
        item1.image="https://static.thenounproject.com/png/100859-200.png";
        item1.contactName="Charan";
        item1.disc = "90109190201";
        callItems[0]=item1;

        CallItem item2 = new CallItem();
        item2.image="https://static.thenounproject.com/png/100859-200.png";
        item2.contactName="siva";
        item2.disc = "90909090909";
        callItems[1]=item2;


        CallItem item3 = new CallItem();
        item3.image="https://static.thenounproject.com/png/100859-200.png";
        item3.contactName="sai sri";
        item3.disc = "80000000008";
        callItems[2]=item3;

        CallItem item4 = new CallItem();
        item4.image="https://static.thenounproject.com/png/100859-200.png";
        item4.contactName="manu";
        item4.disc = "700000709";
        callItems[3]=item4;

        CallItem item5 = new CallItem();
        item5.image="https://static.thenounproject.com/png/100859-200.png";
        item5.contactName="siv";
        item5.disc = "9090909098";
        callItems[4]=item5;

        CallItem item6 = new CallItem();
        item6.image="https://static.thenounproject.com/png/100859-200.png";
        item6.contactName="ram";
        item6.disc = "809089876";
        callItems[5]=item6;

        CallItem item7 = new CallItem();
        item7.image="https://static.thenounproject.com/png/100859-200.png";
        item7.contactName="lucky";
        item7.disc = "9089809882";
        callItems[6]=item7;
    }

    private void initViews() {
        calllogoIv = findViewById(R.id.calllogo_iv);
    }
}