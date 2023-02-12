package com.example.reportapps;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class News extends AppCompatActivity {

    private String BaseUrl = "https://hazardnews-mobile-app.000webhostapp.com/";
    private ArrayList<DisplayNews> modelArrayList;
    private MyApi myApi;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        lv=findViewById ( R.id.listView );
        modelArrayList=new ArrayList<> ();

        //bar
        getSupportActionBar().setTitle("News");
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#8BC34A"));
        actionBar.setBackgroundDrawable(colorDrawable);

        displayRetrofitData();

    }

    private void displayRetrofitData() {
        Retrofit retrofit=new Retrofit.Builder ()
                .baseUrl ( BaseUrl )
                .addConverterFactory ( GsonConverterFactory.create () )
                .build ();
        myApi=retrofit.create ( MyApi.class );
        Call<ArrayList<DisplayNews>> arrayListCall=myApi.callDisplayNews ();
        arrayListCall.enqueue ( new Callback<ArrayList<DisplayNews>>() {

            @Override
            public void onResponse(Call<ArrayList<DisplayNews>> call, retrofit2.Response<ArrayList<DisplayNews>> response) {
                modelArrayList=response.body();
                for (int i=0;i<modelArrayList.size ();i++);
                //create adapter
                Custom custom=new Custom(modelArrayList,News.this,R.layout.singleview);
                lv.setAdapter ( custom );
            }


            @Override
            public void onFailure(Call<ArrayList<DisplayNews>> call, Throwable t) {
                Toast.makeText ( News.this, "Failed to load data", Toast.LENGTH_SHORT ).show ();
            }
        } );
    }


}