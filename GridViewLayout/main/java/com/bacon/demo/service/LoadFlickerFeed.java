package com.bacon.demo.service;

import android.os.AsyncTask;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;


import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by serajam on 6/8/2017.
 */

public class LoadFlickerFeed extends AsyncTask<String,Void,String[]> {



    public static final String API_URL = "https://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=c79895ea6c454b50e1c7ce72f887f24c";

    OkHttpClient client = new OkHttpClient();

    @Override
    protected String[] doInBackground(String... params) {


        try{
            String response = doGetRequest(API_URL);
            JSONObject jsonObject = new JSONObject(response);
            jsonObject.getString("results");
        }catch(IOException e){
            e.printStackTrace();
        }

//        Request request = new Request.Builder()
//                .url(API_URL).build();
//        try{
//            Response response = client.newCall(request).execute();
//            return response.body().string();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//
//        return null;

    }

    public String doGetRequest(String url) throws IOException{
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url).build();
        Response response = client.newCall(request).execute();
        return response.body().string();
    }




}

