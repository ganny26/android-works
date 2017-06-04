package com.app.movie.clients;

import android.os.AsyncTask;

/**
 * Created by serajam on 6/4/2017.
 */

public class APIClient extends AsyncTask{
    public static final String DISCOVER_MOVIE = "https://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=c79895ea6c454b50e1c7ce72f887f24c";

    @Override
    protected Object doInBackground(Object[] params) {
        return null;
    }
}
