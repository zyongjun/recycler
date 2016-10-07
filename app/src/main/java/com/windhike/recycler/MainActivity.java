package com.windhike.recycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.windhike.library.RecyclerAdapter;
import com.windhike.library.RecyclerHolder;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRvRecycler;
    private RecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRvRecycler = (RecyclerView) findViewById(R.id.rv_recycler);
        mRvRecycler.setHasFixedSize(true);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        mRvRecycler.setLayoutManager(manager);
        mAdapter = new RecyclerAdapter(new MainPresenter());

        mRvRecycler.setAdapter(mAdapter);
    }
}
