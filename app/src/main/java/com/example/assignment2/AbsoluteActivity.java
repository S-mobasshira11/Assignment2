package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AbsoluteActivity extends AppCompatActivity {

    Button button4;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absolute);

        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);

    }

    public void main1(View v)
    {
        Intent page1 = new Intent(AbsoluteActivity.this,SecondActivity.class);
        startActivity(page1);
    }

    public void main2(View v)
    {
        this.finishAffinity();
    }
}
