package com.example.victorialee.coinflip;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

//Flips coin: sends user to coin flip result page when button is pressed.
    public void flip(View view) {
        //Button button = (Button) view;
        Intent intent = new Intent(this, CoinResult.class);
        startActivity(intent);
    }

//Rolls dice: sends user to dice result page when button is pressed.
    public void roll(View view) {
        //Button button = (Button) view;
        Intent intent = new Intent(this, DiceResult.class);
        startActivity(intent);

    }

//Sends user to 'View History' page where user can view their past results from the coin flip activity when button 'View History is pressed.
    public void view(View view) {
        //Button button = (Button) view;
        Intent intent = new Intent(this, ViewHistory.class);
        startActivity(intent);

    }

//Sends user to 'About Us' page when button 'About Us' is pressed.
    public void about(View view) {
        //Button button = (Button) view;
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }

    }




