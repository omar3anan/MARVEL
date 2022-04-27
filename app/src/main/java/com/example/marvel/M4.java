package com.example.marvel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class M4 extends AppCompatActivity {
    public Button button;
    RecyclerView movie;
    List<scroll> scrollList;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m4);

        button = findViewById(R.id.buttonx);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                open_M5();
            }
        });
        Intent intent = getIntent();
        String message = intent.getStringExtra(M3.EXTRA_MESSAGE);



        movie = findViewById(R.id.movies);
        scrollList = new ArrayList<>();

        scrollList.add(new scroll(R.drawable.movie1));
        scrollList.add(new scroll(R.drawable.movie2));
        scrollList.add(new scroll(R.drawable.movie3));
        scrollList.add(new scroll(R.drawable.movie4));

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        movie.setLayoutManager(manager);

        adaptor adaptor = new adaptor(this, scrollList);
        movie.setAdapter(adaptor);

    }
    private void open_M5() {
        Intent intent = new Intent(this, M5.class);
        startActivity(intent);
    }
}