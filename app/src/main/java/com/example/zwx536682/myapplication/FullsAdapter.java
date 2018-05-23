package com.example.zwx536682.myapplication;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import java.util.List;

public class FullsAdapter extends RecyclerView.Adapter<FullsAdapter.ViewHolder> {



    Context context;

    List<ItemBean> list;

    FullsAdapter(Context context, List<ItemBean> list) {

         this.context = context;
         this.list = list;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = View.inflate(parent.getContext(), R.layout.itemfragment_head, parent);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        if(list.get(position).getType() == 0){
            holder.item_fragment.
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        FrameLayout item_fragment;


        public ViewHolder(View itemView) {

            super(itemView);

            item_fragment = itemView.findViewById(R.id.item_fragment);
        }
    }
}
