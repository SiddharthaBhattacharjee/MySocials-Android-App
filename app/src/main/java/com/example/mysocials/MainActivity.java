package com.example.mysocials;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public static final String webkey = "com.example.mysocials.web.url";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void githubf(View view){
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra(webkey,"http://github.com/SiddharthaBhattacharjee");
        startActivity(i);
    }
    public void linkedinf(View view){
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra(webkey,"https://www.linkedin.com/in/siddharthabhattacharjee2345/");
        startActivity(i);
    }
    public void twitterf(View view){
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra(webkey,"http://twitter.com/Siddhartha_2345");
        startActivity(i);
    }
    public void instagramf(View view){
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra(webkey,"http://www.instagram.com/programmer_sid/");
        startActivity(i);
    }
    public void whatsaapf(View view){
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra(webkey,"https://stackoverflow.com/users/16950216/siddharth-bhattacharjee");
        startActivity(i);
    }
    public void emailf(View view){
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"siddharthabhatt2345@gmail.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, " ");
        i.putExtra(Intent.EXTRA_TEXT   , " ");
        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }



}