package com.example.myapps1;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button maps, messenger, gmail,playstore;
    Intent i, chooser = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        maps = (Button) findViewById(R.id.maps);
        messenger = (Button) findViewById(R.id.messenger);
        gmail = (Button) findViewById(R.id.gmail);
        playstore = (Button) findViewById(R.id.playstore);

        maps.setOnClickListener(this);
        messenger.setOnClickListener(this);
        gmail.setOnClickListener(this);
        playstore.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.maps) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo: 10.065206, 76.629128"));
            chooser = i.createChooser(i, "Maps");
            startActivity(chooser);
        }
        else if(v.getId() == R.id.messenger) {

        }
        else if (v.getId() == R.id.playstore) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.zhiliaoapp.musically&hl=en_US&gl=US"));
            chooser = i.createChooser(i, "Playstore");
            startActivity(chooser);
        }
        else {
            i = new Intent(Intent.ACTION_SEND);
            i.setData(Uri.parse("mailto"));
            String to[] = {"hijasmoideensha@gmail.com"};
            i.putExtra(i.EXTRA_EMAIL, to);
            i.putExtra(i.EXTRA_SUBJECT, "From mymail");
            i.putExtra(i.EXTRA_TEXT, "My mail");
            i.setType("message/rfc822");
            chooser = i.createChooser(i, "Email");
            startActivity(chooser);
        }
    }}