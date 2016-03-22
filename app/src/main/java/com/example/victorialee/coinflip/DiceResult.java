package com.example.victorialee.coinflip;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class DiceResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_result);
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
        roll();
    }

//Dice roll activity.
    public void roll() {
        final String[] faces;
        int face;

//Generates random number between one and six.
        getFace((int) (Math.random() * 6) + 1);
    }

//Switch statements paired with random number result to display the resulting dice roll number.
    public void getFace(int number) {
        switch (number) {
            case 1:
                TextView textView1 = (TextView) findViewById(R.id.dice_textView);
                textView1.setText("one");
                break;
            case 2:
                TextView textView2 = (TextView) findViewById(R.id.dice_textView);
                textView2.setText("two");
                break;
            case 3:
                TextView textView3 = (TextView) findViewById(R.id.dice_textView);
                textView3.setText("three");
                break;
            case 4:
                TextView textView4 = (TextView) findViewById(R.id.dice_textView);
                textView4.setText("four");
                break;
            case 5:
                TextView textView5 = (TextView) findViewById(R.id.dice_textView);
                textView5.setText("five");
                break;
            case 6:
                TextView textView6 = (TextView) findViewById(R.id.dice_textView);
                textView6.setText("six");
                break;

        }

    }


}
