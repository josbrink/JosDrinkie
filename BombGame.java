package com.example.bomb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class BombGame extends AppCompatActivity {

    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bomb_game);
        counter = new Random().nextInt(30) + 1;
    }

    public void takeOneOff(View v) {
        counter--;
        if (counter == 0) {
            Intent bombEnd = new Intent(this, bombEndScreen.class);
            startActivity(bombEnd);
        }
    }
}
