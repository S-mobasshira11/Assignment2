package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TableActivity1 extends AppCompatActivity {

    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table1);

        next = (Button) findViewById(R.id.next);
    }

    public void show1(View v)
    {
        Intent page3 = new Intent(TableActivity1.this,ThirdActivity.class);
        startActivity(page3);
    }
}
