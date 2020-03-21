package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FifthActivity extends AppCompatActivity {

    ImageView img15,img16,img17,img18,img19,img20,img21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        img15 = (ImageView) findViewById(R.id.img15);
        img16 = (ImageView) findViewById(R.id.img16);
        img17 = (ImageView) findViewById(R.id.img17);
        img18 = (ImageView) findViewById(R.id.img18);
        img19 = (ImageView) findViewById(R.id.img19);
        img20 = (ImageView) findViewById(R.id.img20);
        img21 = (ImageView) findViewById(R.id.img21);

    }
    public void showimg16(View v)
    {
        img15.setVisibility(View.GONE);
        img16.setVisibility(View.VISIBLE);
        img17.setVisibility(View.GONE);
        img18.setVisibility(View.GONE);
        img19.setVisibility(View.GONE);
        img20.setVisibility(View.GONE);
        img21.setVisibility(View.GONE);
    }

    public void showimg17(View v)
    {
        img15.setVisibility(View.GONE);
        img16.setVisibility(View.GONE);
        img17.setVisibility(View.VISIBLE);
        img18.setVisibility(View.GONE);
        img19.setVisibility(View.GONE);
        img20.setVisibility(View.GONE);
        img21.setVisibility(View.GONE);
    }
    public void showimg18(View v)
    {
        img15.setVisibility(View.GONE);
        img16.setVisibility(View.GONE);
        img17.setVisibility(View.GONE);
        img18.setVisibility(View.VISIBLE);
        img19.setVisibility(View.GONE);
        img20.setVisibility(View.GONE);
        img21.setVisibility(View.GONE);
    }
    public void showimg19(View v)
    {
        img15.setVisibility(View.GONE);
        img16.setVisibility(View.GONE);
        img17.setVisibility(View.GONE);
        img18.setVisibility(View.GONE);
        img19.setVisibility(View.VISIBLE);
        img20.setVisibility(View.GONE);
        img21.setVisibility(View.GONE);
    }
    public void showimg20(View v)
    {
        img15.setVisibility(View.GONE);
        img16.setVisibility(View.GONE);
        img17.setVisibility(View.GONE);
        img18.setVisibility(View.GONE);
        img19.setVisibility(View.GONE);
        img20.setVisibility(View.VISIBLE);
        img21.setVisibility(View.GONE);
    }
    public void showimg21(View v)
    {
        img15.setVisibility(View.GONE);
        img16.setVisibility(View.GONE);
        img17.setVisibility(View.GONE);
        img18.setVisibility(View.GONE);
        img19.setVisibility(View.GONE);
        img20.setVisibility(View.GONE);
        img21.setVisibility(View.VISIBLE);
    }
    public void back(View v)
    {
        Intent page2 = new Intent(FifthActivity.this,AbsoluteActivity.class);
        startActivity(page2);

    }
}
