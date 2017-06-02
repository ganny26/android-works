package com.app.movie.tmdb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView = (TextView)findViewById(R.id.textView);
        Button articleButton = (Button) findViewById(R.id.button_show_article);
        textView.setText(message);
        articleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent articleIntent = new Intent(DisplayMessageActivity.this,NewsArticleActivity.class);
                startActivity(articleIntent);
            }
        });
    }

}
