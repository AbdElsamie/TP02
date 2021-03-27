package com.example.tp02_test;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ActivityDice extends AppCompatActivity {

    public int max=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_dice);

        int max = getIntent().getIntExtra("max", 0);

        TextView textTitle = (TextView) findViewById(R.id.textTitle);
        textTitle.setText(max + " sided dice");

        TextView textResult = (TextView) findViewById(R.id.textResult);
        textResult.setText(" X = ");

        Button buttonR = (Button) findViewById(R.id.buttonRoll);

        buttonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random ran = new Random();
                TextView TX = (TextView) findViewById(R.id.textResult);
                int result = ran.nextInt(getIntent().getIntExtra("max", 0)) + 1;
                TX.setText(String.valueOf(result));

            }
        });

    }
}
