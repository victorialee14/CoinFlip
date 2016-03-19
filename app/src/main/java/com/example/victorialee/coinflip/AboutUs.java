package com.example.victorialee.coinflip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        about();
    }
    public void about(){
        TextView textView = (TextView) findViewById(R.id.about_textView);
        textView.setText("This app is the most cutting edge app on the market, it performs tasks like no other. Ever needed to make a decision but you don't have a coin on hand to flip, or been playing aboard game and you have lost the dice? Well look no further. Our app 'fliproll' can perform both for you!");
    }
}
