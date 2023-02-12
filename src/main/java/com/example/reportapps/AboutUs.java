package com.example.reportapps;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class AboutUs extends AppCompatActivity implements View.OnClickListener {

    //grid view
    public CardView gridYoutube, gridGithub, gridProfile, gridSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        //bar
        getSupportActionBar().setTitle("About Us");
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#8BC34A"));
        actionBar.setBackgroundDrawable(colorDrawable);

        //card view grid * add from here*
        gridYoutube = (CardView) findViewById(R.id.grid1);
        gridYoutube.setOnClickListener(this);

        gridGithub = (CardView) findViewById(R.id.grid2);
        gridGithub.setOnClickListener(this);

        gridProfile = (CardView) findViewById(R.id.grid3);
        gridProfile.setOnClickListener(this);


    } // sec col

    //card view
    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {

            case R.id.grid1:
                i = new Intent(this, Youtube.class);
                startActivity(i);
                break;

            case R.id.grid2:
                i = new Intent(this, Github.class);
                startActivity(i);
                break;

            case R.id.grid3:
                i = new Intent(this, UserProfile.class);
                startActivity(i);
                break;

        }
    }

} // last col