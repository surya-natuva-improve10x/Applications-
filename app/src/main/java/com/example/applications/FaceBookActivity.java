package com.example.applications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class FaceBookActivity extends AppCompatActivity {
    ListView facebookLv;
    public FaceBookItem[] faceBookItems;
    public FaceBookAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_book);
        inItViews();
        createFaceBookData();
        setUpAdapter();
        connectAdapter();
    }

    private void setUpAdapter() {
       adapter = new FaceBookAdapter(faceBookItems);
    }

    private void connectAdapter() {
        facebookLv.setAdapter(adapter);
    }

    private void createFaceBookData() {
        faceBookItems = new FaceBookItem[7];
        FaceBookItem item1 = new FaceBookItem();
        item1.imageUrl2 = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item1.message = "Angela Jami Favorito Huit reacted to your story.";
        item1.time2 = "1 hour ago";
        faceBookItems[0]=item1;



        FaceBookItem item2 = new FaceBookItem();
        item2.imageUrl2 = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item2.message = "Kimwana Michael, Linh An and Channell Boxley asked to join I Love Still Life Painting!.";
        item2.time2 = "25 minutes ago";
        faceBookItems[1]=item2;


        FaceBookItem item3 = new FaceBookItem();
        item3.imageUrl2 = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item3.message = "Lloyd Cafe Cadena is live now: LAPIT NA MAG END OF SEASONII";
        item3.time2 = "5 minutes ago";
        faceBookItems[2]=item3;


        FaceBookItem item4 = new FaceBookItem();
        item4.imageUrl2 = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item4.message = "Sia Ellise Mejorada commented on a post in Hachi's Buy and Sell Group";
        item4.time2 = "2 hours ago";
        faceBookItems[3]=item4;


        FaceBookItem item5 = new FaceBookItem();
        item5.imageUrl2 = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item5.message = "Mavreen Anne Romero and others lidded to their stories";
        item5.time2 = "3 hours ago";
        faceBookItems[4]=item5;

        FaceBookItem item6 = new FaceBookItem();
        item6.imageUrl2 = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item6.message = "Sosy Sophie, Rampage Traveland Tours and LetsircEcarg Nodner Nillillam listed in CAMSUR...";
        item6.time2 = "2 hours ago";
        faceBookItems[5]=item6;

        FaceBookItem item7 = new FaceBookItem();
        item7.imageUrl2 = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        item7.message = "Bobby Alvarez and others added to their stories.";
        item7.time2 = "2 hours ago";
        faceBookItems[6]=item7;
    }

    private void inItViews() {
        facebookLv = findViewById(R.id.facebook_lv);
    }
}