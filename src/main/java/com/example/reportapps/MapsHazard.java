package com.example.reportapps;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MapsHazard extends AppCompatActivity {

    private RelativeLayout RL1, RL2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_hazard);

        //bar
        getSupportActionBar().setTitle("Dashboard Maps");
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#8BC34A"));
        actionBar.setBackgroundDrawable(colorDrawable);

        RL2 = findViewById(R.id.RL2);


        RL2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MapsHazard.this, ViewMaps.class);
                startActivity(intent);

            }
        });
    }
}