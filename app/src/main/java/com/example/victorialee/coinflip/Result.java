package com.example.victorialee.coinflip;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        flip();
    }

    public void flip(){

        final int HEADS = 0;
        final int TAILS = 1;
        int face;

        face = (int) (Math.random() * 2);

        if (face == HEADS) {
            TextView textView = (TextView) findViewById(R.id.result_textview);
            textView.setText("heads");
        }
        else {
            TextView textView = (TextView) findViewById(R.id.result_textview);
            textView.setText("tails");

        }
    }


    }


