package com.example.victorialee.coinflip;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import java.lang.String;
import java.util.*;

public class ViewHistory extends AppCompatActivity {
    CoinResult coinResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_history);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        coinResult = new CoinResult();
        view();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

//Adds coin flip results to array and displays results in a list.
    public void view() {
        TextView textView = (TextView) findViewById(R.id.history_list);
        String text = "";
        for (int i = 0; i < coinResult.getHistory().length - 1; i++) {
            //Prevents nulls from being displayed.
            if (coinResult.getHistory()[i] != null) {
                text += "\n" + coinResult.getHistory()[i];
            }
        }
        textView.setText(text);
    }

//Alphabetises the 'View History' array.
    public void sortHistory(View view) {
        String t;
        for (int i = 0; i < coinResult.getHistory().length; i++) {
            if (coinResult.getHistory()[i] != null) {
                for (int j = 0; j < coinResult.getHistory().length - 1 - i; j++) {
                    if (coinResult.getHistory()[j + 1] != null) {
                        if (coinResult.getHistory()[j].compareTo(coinResult.getHistory()[j + 1]) > 0) {
                            t = coinResult.getHistory()[j];
                            coinResult.getHistory()[j] = coinResult.getHistory()[j + 1];
                            coinResult.getHistory()[j + 1] = t;
                        }

                    }
                }
            }
        }
        view();
    }

}




