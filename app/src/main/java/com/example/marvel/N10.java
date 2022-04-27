package com.example.marvel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class N10 extends AppCompatActivity {

    RecyclerView mList1,mList2,mList3;
    List<scroll> scrollList;
    List<scroll> scrollList1;
    List<scroll> scrollList2;
    public Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n10);
        button2 = (Button) findViewById(R.id.textView9);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_M8();
            }
        });

        mList1=findViewById(R.id.list1);
        mList2=findViewById(R.id.list2);
        mList3=findViewById(R.id.list3);
        scrollList=new ArrayList<>();
        scrollList1=new ArrayList<>();
        scrollList2=new ArrayList<>();

        scrollList.add(new scroll(R.drawable.nopath___copy__2_));
        scrollList.add(new scroll(R.drawable.nopath___copy__3_));
        scrollList.add(new scroll(R.drawable.nopath___copy__4_));
        scrollList.add(new scroll(R.drawable.nopath___copy__5_));
        scrollList.add(new scroll(R.drawable.nopath___copy__7_));
        scrollList.add(new scroll(R.drawable.nopath___copy__8_));
        scrollList.add(new scroll(R.drawable.nopath___copy__9_));
        scrollList.add(new scroll(R.drawable.redskulliw));

        scrollList1.add(new scroll(R.drawable.redskulliw));
        scrollList1.add(new scroll(R.drawable.nopath___copy__3_));
        scrollList1.add(new scroll(R.drawable.nopath___copy__8_));
        scrollList1.add(new scroll(R.drawable.nopath___copy__9_));

        scrollList2.add(new scroll(R.drawable.nopath___copy__2_));
        scrollList2.add(new scroll(R.drawable.nopath___copy__7_));
        scrollList2.add(new scroll(R.drawable.nopath___copy__4_));
        scrollList2.add(new scroll(R.drawable.nopath___copy__5_));


        LinearLayoutManager manager1=new LinearLayoutManager(this);
        manager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        mList1.setLayoutManager(manager1);

        LinearLayoutManager manager2=new LinearLayoutManager(this);
        manager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        mList2.setLayoutManager(manager2);

        LinearLayoutManager manager3=new LinearLayoutManager(this);
        manager3.setOrientation(LinearLayoutManager.HORIZONTAL);
        mList3.setLayoutManager(manager3);

        adaptor adaptor1 = new adaptor(this,scrollList);
        mList1.setAdapter(adaptor1);

        adaptor adaptor2 = new adaptor(this,scrollList2);
        mList2.setAdapter(adaptor2);

        adaptor adaptor3 = new adaptor(this,scrollList1);
        mList3.setAdapter(adaptor3);


    }
    public void open_M8(){
        Intent intent=new Intent(N10.this,M8.class);
        startActivity(intent);
    }
}