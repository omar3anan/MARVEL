package com.example.marvel;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;
        import android.view.View;
        import android.widget.Button;

        import java.util.ArrayList;
        import java.util.List;

public class M6 extends AppCompatActivity {

    RecyclerView mList1;
    List<scroll> scrollList;
    public Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m6);
        button2 = (Button) findViewById(R.id.textView9);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_M8();
            }
        });

        mList1=findViewById(R.id.list1);
        scrollList=new ArrayList<>();

        scrollList.add(new scroll(R.drawable.spiderman_ver1));
        scrollList.add(new scroll(R.drawable.clean));
        scrollList.add(new scroll(R.drawable.spiderman_ver1));
        scrollList.add(new scroll(R.drawable.clean));
        scrollList.add(new scroll(R.drawable.spiderman_ver1));

        LinearLayoutManager manager1=new LinearLayoutManager(this);
        manager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        mList1.setLayoutManager(manager1);

        adaptor1 adaptor1 = new adaptor1(this,scrollList);
        mList1.setAdapter(adaptor1);

    }
    public void open_M8(){
        Intent intent=new Intent(M6.this,M8.class);
        startActivity(intent);
    }
}