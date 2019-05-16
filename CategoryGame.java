package com.example.namesincategory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CategoryGame extends AppCompatActivity {

    private String[] categories = {"Car brands", "Famous American actors", "Famous Dutch actors",
            "African animals", "Asian animals", "Australian animals", "Asian brands", "Films",
            "American presidents", "Dutch singers", "African countries", "South-American countries",
            "European countries", "Asian countries", "Islands", "Footballers"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_game);
        TextView categoryText = findViewById(R.id.category);
        final int random = new Random().nextInt(17);
        categoryText.setText(categories[random]);
    }

    public void toEndScreen (View v){
        Intent endScreen = new Intent(this, CategoryEndScreen.class);
        startActivity(endScreen);
    }
}
