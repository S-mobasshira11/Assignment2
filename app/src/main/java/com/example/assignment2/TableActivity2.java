package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TableActivity2 extends AppCompatActivity {

    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table2);

        next = (Button) findViewById(R.id.next);
    }

    public void show2(View v)
    {
        Intent page4 = new Intent(TableActivity2.this,FourthActivity.class);
        startActivity(page4);
    }



}
