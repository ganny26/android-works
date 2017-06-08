package com.bacon.demo.activities;

import android.content.Intent;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;


import com.bacon.demo.R;
import com.bacon.demo.adapter.MyGridAdapter;


public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";
    //public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final String[] colors = new String[] {"red", "blue", "black", "white", "yellow"};
    private static final String[] locations = new String[] {"seattle", "sf", "LA", "NYC"};

    MyGridAdapter adapter;
    RecyclerView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void openRecycleActivity(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, RecycleActivity.class);
        startActivity(intent);
    }


}