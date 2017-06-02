package com.app.movie.tmdb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.app.movie.lib.ItemModel;

public class SmoothScrollActivity extends AppCompatActivity {
    private String[] names = Constant.name;
    private  String[] images = Constant.image;

    private RecyclerItemAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smooth_scroll);
    }
    private void initView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List listItems = getList();
        mAdapter = new RecyclerItemAdapter(this, listItems);
        recyclerView.setAdapter(mAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

    }

    private List getList(){
        List list = new ArrayList<>();
        for (int index =0; index < names.length; index++){
            ItemModel itemModel = new ItemModel();
            itemModel.setName(names[index]);
            itemModel.setImagePath(images[index]);
            list.add(itemModel);
        }

        if (list.size() > 0) {
            Collections.sort(list, new Comparator() {
                @Override
                public int compare(final ItemModel object1, final ItemModel object2) {
                    return object1.getName().compareTo(object2.getName());
                }
            });
        }
        return list;
    }
}
