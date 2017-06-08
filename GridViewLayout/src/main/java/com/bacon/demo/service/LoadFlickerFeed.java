package com.bacon.demo.service;

import android.os.AsyncTask;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by serajam on 6/8/2017.
 */

public class LoadFlickerFeed extends AsyncTask<String,Void,String[]> {

    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");





    @Override
    protected String[] doInBackground(String... params) {
        String getResponse = doGetRequest("https://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=c79895ea6c454b50e1c7ce72f887f24c");
        JSONObject jsonObject = new JSONObject(getResponse);
        JSONArray jsonArray = jsonObject.getJSONArray("results");
    }

    public String doGetRequest(String url) throws IOException{
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url).build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }




}

