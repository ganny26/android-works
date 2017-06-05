package com.app.movie.tmdb;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class AsyncActivity extends AppCompatActivity {

    private static final String TAG = AsyncActivity.class.getName();

    private Button btnGetResponse;
    private TextView txtResult;

    private OkHttpClient okHttpClient;
    private Request request;
    private String urlText = "https://api.github.com/users/ganny26";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async);

        btnGetResponse = (Button) findViewById(R.id.btnGetRequest);
        txtResult = (TextView) findViewById(R.id.textViewResult);

        btnGetResponse.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                okHttpClient = new OkHttpClient();
                request = new Request.Builder().url(urlText).build();

                okHttpClient.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        Log.i(TAG,e.getMessage());
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        Log.i(TAG,response.body().toString());
                    }
                });
            }
        });






    }
}
