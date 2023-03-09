package com.example.applications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MessengerActivity extends AppCompatActivity {
    ListView msgLv;
    public MessengerItem[] messengerItems;
    public MessengerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messenger);
        inItViews();
        createMessageData();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        msgLv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new MessengerAdapter(messengerItems);
    }

    private void createMessageData() {
        messengerItems = new MessengerItem[7];
        MessengerItem item1 = new MessengerItem();
        item1.profile="https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        item1.username="Sam Scott";
        item1.msg="hey, how its going 🚹";
        messengerItems[0]=item1;


        MessengerItem item2 = new MessengerItem();
        item2.profile="https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        item2.username="Mai tran";
        item2.msg="Mai sent a Sticker";
        messengerItems[1]=item2;


        MessengerItem item3 = new MessengerItem();
        item3.profile="https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        item3.username="Emmie Baros";
        item3.msg="Hi Again😊";
        messengerItems[2]=item3;

        MessengerItem item4 = new MessengerItem();
        item4.profile="https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        item4.username="Jorge Torres";
        item4.msg="cant wait 🤷‍";
        messengerItems[3]=item4;

        MessengerItem item5 = new MessengerItem();
        item5.profile="https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        item5.username="Maria Soumya";
        item5.msg="had u r lunch";
        messengerItems[4]=item5;

        MessengerItem item6 = new MessengerItem();
        item6.profile="https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        item6.username="robert";
        item6.msg="whats men😎";
        messengerItems[5]=item6;

        MessengerItem item7 = new MessengerItem();
        item7.profile="https://orig00.deviantart.net/5860/f/2018/112/2/5/_free__journey_by_sqdpxl-dc9jiji.gif";
        item7.username="juan";
        item7.msg="Had u r lunch🍗";
        messengerItems[6]=item7;
    }

    private void inItViews() {
        msgLv = findViewById(R.id.msg_lv);
    }
}