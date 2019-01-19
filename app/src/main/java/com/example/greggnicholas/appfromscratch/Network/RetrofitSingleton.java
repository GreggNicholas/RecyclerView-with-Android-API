package com.example.greggnicholas.appfromscratch.Network;

import android.support.annotation.NonNull;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitSingleton {

    private static Retrofit instance;

    @NonNull
    public static Retrofit retrofitInstance() {
        if (instance != null) {
            return instance;
        }
        instance = new Retrofit.Builder()
                .baseUrl("https://api.learn2crack.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return instance;
    }

    // access modifier should be private so the instance cannot be modified
    private RetrofitSingleton() {
    }
}
