package com.example.diceroller;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int[] images = {R.drawable._1,R.drawable._2,R.drawable._3,R.drawable._4,R.drawable._5,R.drawable._6};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button roll = findViewById(R.id.btn);
        Button reset = findViewById(R.id.resetbtn);
        ImageView change = findViewById(R.id.imageView);

        reset.setOnClickListener(view -> change.setImageResource(R.drawable.empty));
        roll.setOnClickListener(view -> {
            int k = generate();
            change.setImageResource(images[k]);
        });

    }
    public int generate(){
        Random random = new Random();
        return random.nextInt(6);
    }
}