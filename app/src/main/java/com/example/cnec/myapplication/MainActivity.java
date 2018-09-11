package com.example.cnec.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void animar(View v) {
        v.animate().rotation(v.getRotation() + 900);

        v.animate().translationXBy(200);
        v.animate().translationYBy(2000);
        v.animate().setDuration(10000);
        v.animate().start();
    }
}
