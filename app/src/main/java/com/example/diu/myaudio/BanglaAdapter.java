package com.example.diu.myaudio;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class BanglaAdapter extends RecyclerView.Adapter<BanglaAdapter.ViewHolder> {


    private List<BanglaItem> banglaItems;
    private Context context;

    public BanglaAdapter(List<BanglaItem> banglaItems, Context context) {
        this.banglaItems = banglaItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bangla_list_item,viewGroup,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        BanglaItem banglaItem = banglaItems.get(i);

        viewHolder.textViewStory.setText(banglaItem.getStoryName());
        viewHolder.textViewWritter.setText(banglaItem.getWritterName());

        Picasso.get().load(banglaItem.getStoryImage()).fit().into(viewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return banglaItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewStory;
        public TextView textViewWritter;
        public ImageView  imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewStory = (TextView) itemView.findViewById(R.id.story);
            textViewWritter = (TextView) itemView.findViewById(R.id.writter);
            imageView = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
