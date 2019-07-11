package com.example.topquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  TextView mtext;
    private  EditText   mEdit;
    private  Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdit = findViewById(R.id.input_text_activity);
        mButton = findViewById(R.id.button_activity);

        mButton.setEnabled(false);

        mEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mButton.setEnabled(charSequence.toString().length() != 0);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mGameActivity = new Intent(MainActivity.this, GameActivity.class);
                startActivity(mGameActivity);
            }
        });

    }
}
