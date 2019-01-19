package com.example.greggnicholas.appfromscratch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        textView1 = findViewById(R.id.textview_ver_display);
        textView2 = findViewById(R.id.textview_name_display);
        textView3 = findViewById(R.id.textview_api_display);

textView1.setText(getIntent().getStringExtra("version"));
textView2.setText(getIntent().getStringExtra("name"));
textView3.setText(getIntent().getStringExtra("api"));


    }


}
