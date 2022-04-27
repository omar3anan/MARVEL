package com.example.marvel;

import android.content.Intent;
import android.content.SharedPreferences;
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
    public Button button2;
    RecyclerView movie;
    List<scroll> scrollList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m4);
        SharedPreferences preferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        String display = preferences.getString("display", "");
        button = (Button) findViewById(R.id.PlayBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_M5();
            }
        });
        button2 = (Button) findViewById(R.id.textView9);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_M8();
            }
        });
        Intent intent = getIntent();
        String message = intent.getStringExtra(M3.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);

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

    public void open_M8(){
        Intent intent=new Intent(M4.this,M8.class);
        startActivity(intent);
    }
}