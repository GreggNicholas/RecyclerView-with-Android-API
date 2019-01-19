package com.example.greggnicholas.appfromscratch.AdapterwithViewHolder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.greggnicholas.appfromscratch.Model.Model_Android;
import com.example.greggnicholas.appfromscratch.R;

import java.util.List;

public class AndroidAdapter extends RecyclerView.Adapter<ViewHolder_Android> {
    private List<Model_Android> androidList;


    public AndroidAdapter( List<Model_Android> androidList) {
        this.androidList = androidList;

    }

    @NonNull
    @Override
    public ViewHolder_Android onCreateViewHolder(@NonNull ViewGroup childView, int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(childView.getContext());
        // populates the recyclerview
        View View = layoutInflater.inflate(R.layout.androidadapter, childView, false);
        return new ViewHolder_Android(View, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder_Android viewHolder_android, int position) {

        viewHolder_android.onBind(androidList.get(position));
    }


    @Override
    public int getItemCount() {
        return androidList.size();
    }


}

