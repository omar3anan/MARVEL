package com.example.marvel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class N11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n11);

        RecyclerView team;
        List<scroll> scrollList;

        team = findViewById(R.id.Team);
        scrollList = new ArrayList<>();

        scrollList.add(new scroll(R.drawable.nopath___copy__10_));
        scrollList.add(new scroll(R.drawable.nopath___copy__10_));
        scrollList.add(new scroll(R.drawable.nopath___copy__10_));
        scrollList.add(new scroll(R.drawable.nopath___copy__10_));
        scrollList.add(new scroll(R.drawable.nopath___copy__10_));
        scrollList.add(new scroll(R.drawable.nopath___copy__10_));
        scrollList.add(new scroll(R.drawable.nopath___copy__10_));

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        team.setLayoutManager(manager);

        adaptor1 adaptor = new adaptor1(this, scrollList);
        team.setAdapter(adaptor);
    }
}