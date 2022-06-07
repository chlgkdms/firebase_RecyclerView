package com.example.firebaserecyclerview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private ArrayList<Flag> arrayList;
    private Context context;

    public MainAdapter(ArrayList<Flag> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        MainViewHolder holder = new MainViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        Glide.with(holder.itemView)
                .load(arrayList.get(position).getFlag())
                .into(holder.iv_flag);
        holder.tv_name.setText(arrayList.get(position).getFlagName());
        holder.tv_capital.setText(arrayList.get(position).getCapital());
    }

    @Override
    public int getItemCount() {
        // 삼항 연산자
        return (arrayList != null ? arrayList.size() : 0);
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_flag;
        TextView tv_name;
        TextView tv_capital;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            this.iv_flag = itemView.findViewById(R.id.iv_flag);
            this.tv_name = itemView.findViewById(R.id.tv_name);
            this.tv_capital = itemView.findViewById(R.id.tv_capital);
        }
    }
}
