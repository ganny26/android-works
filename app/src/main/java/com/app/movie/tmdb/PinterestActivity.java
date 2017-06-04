package com.app.movie.tmdb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;
import com.app.movie.lib.ItemObjects;

public class PinterestActivity extends AppCompatActivity {
    private StaggeredGridLayoutManager gaggeredGridLayoutManager;
    OkHttpClient client = new OkHttpClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinterest);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        List<ItemObjects> gaggeredList = getListItemData();

        SolventRecyclerViewAdapter rcAdapter = new SolventRecyclerViewAdapter(PinterestActivity.this, gaggeredList);
        recyclerView.setAdapter(rcAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private List<ItemObjects> getListItemData(){
        List<ItemObjects> listViewItems = new ArrayList<ItemObjects>();
        listViewItems.add(new ItemObjects("Recipe 1", R.drawable.one));
        listViewItems.add(new ItemObjects("Recipe 2", R.drawable.two));
        listViewItems.add(new ItemObjects("Recipe 3", R.drawable.three));
        listViewItems.add(new ItemObjects("Recipe 4", R.drawable.four));
        listViewItems.add(new ItemObjects("Recipe 5", R.drawable.one));
        listViewItems.add(new ItemObjects("Recipe 6", R.drawable.two));
        listViewItems.add(new ItemObjects("Recipe 7", R.drawable.three));
        listViewItems.add(new ItemObjects("Recipe 8", R.drawable.four));
        listViewItems.add(new ItemObjects("Recipe 9", R.drawable.one));
        listViewItems.add(new ItemObjects("Recipe 10", R.drawable.four));
        listViewItems.add(new ItemObjects("Recipe 11", R.drawable.two));
        listViewItems.add(new ItemObjects("REcipe 12", R.drawable.three));

        return listViewItems;
    }
}
