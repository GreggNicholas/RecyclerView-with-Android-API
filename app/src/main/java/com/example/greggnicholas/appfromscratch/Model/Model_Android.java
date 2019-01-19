package com.example.greggnicholas.appfromscratch.Model;

import android.support.annotation.NonNull;

public class Model_Android {
    private String ver;
    private String name;
    private String api;

    public Model_Android(@NonNull String ver, @NonNull String name, @NonNull String api) {
        this.ver = ver;
        this.name = name;
        this.api = api;
    }

    @NonNull
    public String getVer() {
        return ver;
    }

    @NonNull
    public String getName() {
        return name;
    }

    @NonNull
    public String getApi() {
        return api;
    }


}
