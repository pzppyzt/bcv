package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.bean.Bean;

import java.util.ArrayList;
import java.util.List;

class Myadapter extends RecyclerView.Adapter {

    private Context context;

    public Myadapter(Context context) {
        this.context = context;
    }
    private List<Bean.DataBean.DatasBean> list=new ArrayList<>();
    public void Additem(List<Bean.DataBean.DatasBean> list){
        this.list=list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item1, parent, false);
        return new vh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Bean.DataBean.DatasBean datasBean = list.get(position);
        vh vh= (Myadapter.vh) holder;
        vh.tv.setText(datasBean.getTitle());
        Glide.with(context).load(datasBean.getEnvelopePic()).into(vh.lv);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class vh extends RecyclerView.ViewHolder{

        private ImageView lv;
        private TextView tv;
        public vh(@NonNull View itemView) {
            super(itemView);
            lv=itemView.findViewById(R.id.lv);
            tv=itemView.findViewById(R.id.tv);
        }
    }
}
