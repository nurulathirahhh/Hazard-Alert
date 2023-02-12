package com.example.reportapps;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

interface MyApi {
    @GET("news.json")
    Call<ArrayList<DisplayNews>>callDisplayNews();
}
