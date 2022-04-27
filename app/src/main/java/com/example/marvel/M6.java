package com.example.marvel;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.LinearLayoutManager;
        import android.support.v7.widget.RecyclerView;

        import java.util.ArrayList;
        import java.util.List;

public class M6 extends AppCompatActivity {

    RecyclerView mList1;
    List<scroll> scrollList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m6);

        mList1=findViewById(R.id.list1);
        scrollList=new ArrayList<>();

        scrollList.add(new scroll(R.drawable.spiderman_ver1));
        scrollList.add(new scroll(R.drawable.spiderman_ver1));
        scrollList.add(new scroll(R.drawable.spiderman_ver1));
        scrollList.add(new scroll(R.drawable.spiderman_ver1));
        scrollList.add(new scroll(R.drawable.spiderman_ver1));

        LinearLayoutManager manager1=new LinearLayoutManager(this);
        manager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        mList1.setLayoutManager(manager1);

        adaptor1 adaptor1 = new adaptor1(this,scrollList);
        mList1.setAdapter(adaptor1);

    }
}