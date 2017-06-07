package com.example.ishant.emergencymsg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(getBaseContext(),"Surprise Motherfucker",Toast.LENGTH_SHORT).show();
    }
}
