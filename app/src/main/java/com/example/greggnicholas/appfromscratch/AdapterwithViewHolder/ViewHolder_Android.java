package com.example.greggnicholas.appfromscratch.AdapterwithViewHolder;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.greggnicholas.appfromscratch.DisplayActivity;
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

    private CardView cardView;

    private AndroidAdapter androidAdapter;
    //android adapter will link the viewholder to the adapter


    public ViewHolder_Android(@NonNull View itemView, AndroidAdapter androidAdapter) {
        super(itemView);
        this.textView1 = (TextView) itemView.findViewById(R.id.textview_ver);
        this.textView2 = (TextView) itemView.findViewById(R.id.textview_name);
        this.textView3 = (TextView) itemView.findViewById(R.id.textview_api);
        this.cardView = itemView.findViewById(R.id.cardview_Display_layout);

        this.androidAdapter = androidAdapter;
    }


    public void onBind(final Model_Android model_android) {
        textView1.setText(model_android.getVer());
        textView2.setText(model_android.getName());
        textView3.setText(model_android.getApi());
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), DisplayActivity.class);
                intent.putExtra("version", model_android.getVer());
                intent.putExtra("name", model_android.getName());
                intent.putExtra("api", model_android.getApi());
                v.getContext().startActivity(intent);

            }
        });
    }


//    public void onBind(final String ver, final String name, final String api){
//
//        textView1.setText(ver);
//        textView2.setText(name);
//        textView3.setText(api);
//
//    }


}
