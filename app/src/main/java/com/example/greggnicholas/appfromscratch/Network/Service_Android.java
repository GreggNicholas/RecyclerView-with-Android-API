package com.example.greggnicholas.appfromscratch.Network;

import com.example.greggnicholas.appfromscratch.Model.ArrayList_Android;
import com.example.greggnicholas.appfromscratch.Model.Model_Android;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service_Android {


    @GET("android/jsonandroid/")
    Call<ArrayList_Android> getAndroid();


}
