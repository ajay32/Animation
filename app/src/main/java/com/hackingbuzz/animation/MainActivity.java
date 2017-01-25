package com.hackingbuzz.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView penguin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void clickme(View view) {

        penguin = (ImageView) findViewById(R.id.imageView);  //  u can initilize it anywhere


        penguin.animate().alpha(0f).setDuration(5000);

    }
}
