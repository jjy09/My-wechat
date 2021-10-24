package com.example.mywork;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.collection.CircularArray;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class myadapter extends RecyclerView.Adapter<myadapter.Myviewholder> {

    private static OnRecyclerItemClickListener onItemClickListener;
    private List<chat> mList;
    private Context context;

    public myadapter(Context context,List<chat> list) {
        this.mList= list;
        this.context=context;
    }

    public myadapter() {

    }


    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view=(View)LayoutInflater.from(parent.getContext()).inflate(R.layout.item_down,parent,false);
        Myviewholder myviewholder= new Myviewholder((view));
        return myviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {
        chat chat = mList.get(position);
        holder.Image.setImageResource(chat.getImageid());
        holder.Name.setText(chat.getName());
        holder.Message.setText(chat.getMessage());
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(context,frdFragment.class);
//                context.startActivities(new Intent[]{intent});
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public  class Myviewholder extends RecyclerView.ViewHolder{
        private ImageView Image;
        private TextView Name;
        private TextView Message;

        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            Image = itemView.findViewById(R.id.item_img);
            Name = itemView.findViewById(R.id.item_name);
            Message = itemView.findViewById(R.id.item_message);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(onItemClickListener!=null){
                        onItemClickListener.onRecyclerItemClick(getAdapterPosition());
                    }
                }
            });

        }
    }

    public static void setRecyclerItemClickListener(OnRecyclerItemClickListener listener){
        onItemClickListener=listener;
    }
    public interface  OnRecyclerItemClickListener{
        void  onRecyclerItemClick(int position);
    }

}