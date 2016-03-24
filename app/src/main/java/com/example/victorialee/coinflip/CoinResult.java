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
    //Creates array of size 15.
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

//Coin flip activity
    public void flip(){

        final int HEADS = 0;
        final int TAILS = 1;
        int face;

//Generates random number between zero and one.
        face = (int) (Math.random() * 2);

//Displays result 'heads' if the generated random number equals zero.
        if (face == HEADS) {
            TextView textView = (TextView) findViewById(R.id.result_textview);
            textView.setText("heads");

            //Keeps record of 'heads' results for 'View History' page.
            history[counter] = "Heads";
        }

//If the generated random number does not equal zero, the displayed result will show up as 'tails' (random number = 1).
        else {
            TextView textView = (TextView) findViewById(R.id.result_textview);
            textView.setText("tails");

            //Keeps record of 'tails' results for 'View History' page.
            history[counter] = "Tails";
        }
        counter++;
    }

//Returns history results.
    public String[] getHistory(){
        return history;
    }
    public int getCounter(){
        return counter;
    }

    }



