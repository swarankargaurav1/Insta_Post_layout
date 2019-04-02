package com.example.insta_layout;

import android.content.Context;
import android.gesture.Gesture;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    Context context;
    int count = 0;
    int county=0;


    public MyAdapter(Context context)
    {
        this.context = context;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view =
                LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_layout,
                        viewGroup, false);
        return new MyHolder(view);

    }

    @Override
    public void onBindViewHolder(MyHolder myHolder, int i)
    {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class MyHolder extends RecyclerView.ViewHolder
    {
        ImageView img2, img3, img1, img4, img5,img7;

        public MyHolder(View itemView)
        {
            super(itemView);
            img1 = (itemView).findViewById(R.id.img1);
            img2 = (itemView).findViewById(R.id.img2);
            img3 = (itemView).findViewById(R.id.img3);
            img4 = (itemView).findViewById(R.id.img4);
            img5 = (itemView).findViewById(R.id.img5);
            img7 = (itemView).findViewById(R.id.img7);

            img7.setOnLongClickListener(new View.OnLongClickListener()
            {
                @Override
                public boolean onLongClick(View v)
                {
                    county++;

                    if (county%2!=0)
                    {
                        img3.setImageResource(R.drawable.likes);
                    } else
                        {
                        img3.setImageResource(R.drawable.like);
                    }

                    return false;
                }
            });


            img3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    if (count == 0) {
                        img3.setImageResource(R.drawable.likes);
                        count = 1;
                    } else {
                        img3.setImageResource(R.drawable.like);
                        count = 0;
                    }
                }
            });


        }


    }
}
