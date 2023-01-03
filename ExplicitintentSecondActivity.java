package com.example.myapps;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView name,email;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        sp = getSharedPreferences("MyPref", MODE_PRIVATE);
        name = (TextView) findViewById(R.id.uname);
        email = (TextView) findViewById(R.id.mail);

        if(sp.contains("Name"))
            name.setText(sp.getString("Name",""));
        if(sp.contains("Email"))
            email.setText(sp.getString("Email", ""));
    }
    public void Previous(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }
}