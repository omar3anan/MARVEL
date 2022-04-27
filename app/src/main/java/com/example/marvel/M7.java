package com.example.marvel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class M7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m7);

        RecyclerView comics;
        List<scroll> scrollList;

        comics = findViewById(R.id.comics);
        scrollList = new ArrayList<>();

        scrollList.add(new scroll(R.drawable.clean));
        scrollList.add(new scroll(R.drawable.nopath___copy));
        scrollList.add(new scroll(R.drawable.clean));
        scrollList.add(new scroll(R.drawable.nopath___copy));
        scrollList.add(new scroll(R.drawable.clean));

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        comics.setLayoutManager(manager);

        adaptor1 adaptor = new adaptor1(this, scrollList);
        comics.setAdapter(adaptor);
    }
}