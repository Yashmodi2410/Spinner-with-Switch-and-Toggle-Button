package com.example.practice.new_switch.RatingBar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.practice.R;

public class RatingBarActivity extends AppCompatActivity {

    private RatingBar rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        rating = findViewById(R.id.rating);

//        rating.setNumStars(10);
//        rating.setRating(6);

        rating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(RatingBarActivity.this, "" + v, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
