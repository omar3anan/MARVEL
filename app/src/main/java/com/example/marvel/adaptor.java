package com.example.marvel;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;
    // bynzm el swr elly ehna hn3rdha
public class adaptor extends  RecyclerView.Adapter<adaptor.MyViewHolder>{

    private Context context;
    //list of scrolls
    private List<scroll> scrolls;
    // constructor bygeb el context elly ehna feh w anhy scroll
    public adaptor(Context context, List<scroll> scrolls) {
        this.context = context;
        this.scrolls = scrolls;
    }
    // dah by-hold el swr elly hytt3rd w kol mara by-hold sora wahda
    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView mImage;
            //constructor by-hoold el image
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mImage = itemView.findViewById(R.id.image);
        }
    }

    @NonNull
    @Override
    // kol mara byrg3 item mn class myviewholder
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.layout_list_item,parent,false);

        return new MyViewHolder(v);
    }
    //byshof anhy sora elly 3leha el dor
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            // 3amlen obj mn el scrolls btgeb mn el array elly howa scrolls anhy sora elly 3leha el dor
        scroll slide = scrolls.get(position);
        // hna b2a byrg3 el image elly 3leha el dor dlw2ty
        holder.mImage.setImageResource(slide.getImage());


    }
        // btgeb size el list elly 3amlenha fo2
    @Override
    public int getItemCount() {
        return scrolls.size();
    }
}