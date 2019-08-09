package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MassageActivity<messgae> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_massage);

        Intent intent = getIntent();

        String message = intent.getStringExtra("ExTRA_MESSAGE");
        TextView textView = findViewById(R.id.display_message);
        textView.setText(message);

    }



}
