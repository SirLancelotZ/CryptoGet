package com.example.cryptoget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.CustomViewHolder> {

    private List<CryptoExchange> dataList;

    public MyAdapter(List<CryptoExchange> dataList){

        this.dataList = dataList;
    }


    class CustomViewHolder extends RecyclerView.ViewHolder {


        public final View myView;

        TextView textUser;
        TextView textUser2;
        TextView textUser3;
        TextView textUser4;
        TextView textUser5;



        CustomViewHolder(View itemView) {
            super(itemView);
            myView = itemView;

            textUser = myView.findViewById(R.id.user);
            textUser2 = myView.findViewById(R.id.user2);
            textUser3 = myView.findViewById(R.id.user3);
            textUser4 = myView.findViewById(R.id.user4);
            textUser5 = myView.findViewById(R.id.user5);


        }
    }



    @Override

    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_layout, parent, false);
        return new CustomViewHolder(view);
    }

    @Override

    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.textUser.setText(dataList.get(position).getCurrency());
        holder.textUser2.setText(dataList.get(position).getActive_pairs());

        holder.textUser3.setText(dataList.get(position).getVolume_usd());
        holder.textUser4.setText(dataList.get(position).getCountry());
        holder.textUser5.setText(dataList.get(position).getUrl());


    }


    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
