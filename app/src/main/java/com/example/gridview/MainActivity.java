package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;

    String[] values = {
            "Captain Marvel",
            "Art Man",
            "Captain America",
            "Black Window",
            "Spider Man",
            "Thor",
            "Iron Man",
            "Black Panther",
    };
    int[] images = {
            R.drawable.captainmavel,
            R.drawable.antman,
            R.drawable.captain,
            R.drawable.black_window,
            R.drawable.spiderman,
            R.drawable.thor,
            R.drawable.ironman3,
            R.drawable.blackpanther,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridview);


        GridAdapter gridAdapter = new GridAdapter(this, values, images);
        gridView.setAdapter(gridAdapter);
    }
}