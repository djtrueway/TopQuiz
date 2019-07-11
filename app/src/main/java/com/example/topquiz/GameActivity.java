package com.example.topquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {

    private Button mBtn1 ;
    private Button mBtn2 ;
    private Button mBtn3 ;
    private Button mBtn4 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mBtn1 = findViewById(R.id.button_activity_answer1);
        mBtn2 = findViewById(R.id.button_activity_answer2);
        mBtn3 = findViewById(R.id.button_activity_answer3);
        mBtn4 = findViewById(R.id.button_activity_answer4);

        mBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
