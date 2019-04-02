package com.example.insta_layout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class StoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{

    Context context1;

    public StoryAdapter(Context context1)
    {
        this.context1 = context1;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder( ViewGroup viewGroup, int i)
    {
        View view =
                LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.insta_stories,
                        viewGroup, false);
        return new storyholder(view);
    }

    @Override
    public void onBindViewHolder( RecyclerView.ViewHolder viewHolder, int i)
    {

    }

    @Override
    public int getItemCount()
    {
        return 10;
    }

    public class storyholder extends RecyclerView.ViewHolder
    {
        TextView tv1;

        public storyholder( View itemView)
        {
            super(itemView);
            tv1 = (TextView)itemView.findViewById(R.id.tv1);
        }
    }
}
