package com.example.greggnicholas.appfromscratch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.greggnicholas.appfromscratch.AdapterwithViewHolder.AndroidAdapter;
import com.example.greggnicholas.appfromscratch.Model.ArrayList_Android;
import com.example.greggnicholas.appfromscratch.Model.Model_Android;
import com.example.greggnicholas.appfromscratch.Network.RetrofitSingleton;
import com.example.greggnicholas.appfromscratch.Network.Service_Android;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    AndroidAdapter adapter;
    List<Model_Android> model_androids = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.android_adapter_recyclerview);
        adapter = new AndroidAdapter(model_androids);
//retrofit instance
        Retrofit retrofit = RetrofitSingleton.retrofitInstance();
//.enqueue makes the retrofit run on the back thread
        retrofit.create(Service_Android.class)
                .getAndroid()
                .enqueue(new Callback<ArrayList_Android>() {
                    @Override
                    public void onResponse(Call<ArrayList_Android> call, Response<ArrayList_Android> response) {
                        Log.d("TAG", "onResponse: " + response.body()
                                .getAndroid()
                                .get(0)// first object of the Json arraylist
                                .getName()); // the name element of the Json object
                        for (int i = 0; i < response.body().getAndroid().size(); i++) {
                            model_androids.add(response.body().getAndroid().get(i));
                        }
                        Log.d("TAG", "size: " + model_androids.size());

                        recyclerView.setAdapter(adapter);
                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    }


                    @Override
                    public void onFailure(Call<ArrayList_Android> call, Throwable t) {
                        Log.d("TAG", "onResponse: " + t.toString());
                    }
                });


    }
}
