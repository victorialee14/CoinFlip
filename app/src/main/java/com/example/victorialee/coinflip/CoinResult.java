package com.example.victorialee.coinflip;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class CoinResult extends AppCompatActivity {
    private static String[] history = new String[15];
    private static int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
            history[counter] = "Heads";
        }
        else {
            TextView textView = (TextView) findViewById(R.id.result_textview);
            textView.setText("tails");
            history[counter] = "Tails";
        }
        counter++;
    }
    public String[] getHistory(){
        return history;
    }
    public int getCounter(){
        return counter;
    }

    }



