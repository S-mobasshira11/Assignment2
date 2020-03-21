package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TableActivity3 extends AppCompatActivity {

    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table3);

        next = (Button) findViewById(R.id.next);

    }

    public void show3(View v)
    {
        Intent page3 = new Intent(TableActivity3.this,FifthActivity.class);
        startActivity(page3);
    }

}
