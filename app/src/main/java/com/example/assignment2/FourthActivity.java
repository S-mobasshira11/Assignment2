package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FourthActivity extends AppCompatActivity {

    ImageView img8,img9,img10,img11,img12,img13,img14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        img8= (ImageView) findViewById(R.id.img8);
        img9 = (ImageView) findViewById(R.id.img9);
        img10 = (ImageView) findViewById(R.id.img10);
        img11 = (ImageView) findViewById(R.id.img11);
        img12 = (ImageView) findViewById(R.id.img12);
        img13 = (ImageView) findViewById(R.id.img13);
        img14 = (ImageView) findViewById(R.id.img14);

    }
    public void showimg9(View v)
    {
        img8.setVisibility(View.GONE);
        img9.setVisibility(View.VISIBLE);
        img10.setVisibility(View.GONE);
        img11.setVisibility(View.GONE);
        img12.setVisibility(View.GONE);
        img13.setVisibility(View.GONE);
        img14.setVisibility(View.GONE);
    }

    public void showimg10(View v)
    {
        img8.setVisibility(View.GONE);
        img9.setVisibility(View.GONE);
        img10.setVisibility(View.VISIBLE);
        img11.setVisibility(View.GONE);
        img12.setVisibility(View.GONE);
        img13.setVisibility(View.GONE);
        img14.setVisibility(View.GONE);
    }

    public void showimg11(View v)
    {
        img8.setVisibility(View.GONE);
        img9.setVisibility(View.GONE);
        img10.setVisibility(View.GONE);
        img11.setVisibility(View.VISIBLE);
        img12.setVisibility(View.GONE);
        img13.setVisibility(View.GONE);
        img14.setVisibility(View.GONE);
    }

    public void showimg12(View v)
    {
        img8.setVisibility(View.GONE);
        img9.setVisibility(View.GONE);
        img10.setVisibility(View.GONE);
        img11.setVisibility(View.GONE);
        img12.setVisibility(View.VISIBLE);
        img13.setVisibility(View.GONE);
        img14.setVisibility(View.GONE);
    }
    public void showimg13(View v)
    {
        img8.setVisibility(View.GONE);
        img9.setVisibility(View.GONE);
        img10.setVisibility(View.GONE);
        img11.setVisibility(View.GONE);
        img12.setVisibility(View.GONE);
        img13.setVisibility(View.VISIBLE);
        img14.setVisibility(View.GONE);
    }
    public void showimg14(View v)
    {
        img8.setVisibility(View.GONE);
        img9.setVisibility(View.GONE);
        img10.setVisibility(View.GONE);
        img11.setVisibility(View.GONE);
        img12.setVisibility(View.GONE);
        img13.setVisibility(View.GONE);
        img14.setVisibility(View.VISIBLE);
    }

    public void back(View v)
    {
        Intent page2 = new Intent(FourthActivity.this,AbsoluteActivity.class);
        startActivity(page2);
    }
}
