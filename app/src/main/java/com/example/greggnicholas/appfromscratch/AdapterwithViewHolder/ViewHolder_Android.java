package com.example.greggnicholas.appfromscratch.AdapterwithViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.greggnicholas.appfromscratch.Model.ArrayList_Android;
import com.example.greggnicholas.appfromscratch.Model.Model_Android;
import com.example.greggnicholas.appfromscratch.Network.Service_Android;
import com.example.greggnicholas.appfromscratch.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ViewHolder_Android extends RecyclerView.ViewHolder {
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;

    private AndroidAdapter androidAdapter;
    //android adapter will link the viewholder to the adapter


    public ViewHolder_Android(@NonNull View itemView, AndroidAdapter androidAdapter) {
        super(itemView);
        this.textView1 = (TextView) itemView.findViewById(R.id.textview_ver);
        this.textView2 = (TextView) itemView.findViewById(R.id.textview_name);
        this.textView3 = (TextView) itemView.findViewById(R.id.textview_api);

        this.androidAdapter = androidAdapter;
    }


    public void onBind(Model_Android model_android){

        textView1.setText(model_android.getVer());
        textView2.setText(model_android.getName());
        textView3.setText(model_android.getApi());

    }


//    public void onBind(final String ver, final String name, final String api){
//
//        textView1.setText(ver);
//        textView2.setText(name);
//        textView3.setText(api);
//
//    }


}
