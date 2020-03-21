package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView user;
    Button button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_SHORT).show();

        user = (TextView) findViewById(R.id.user);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);


        Bundle bundle = new Bundle();

        bundle = getIntent().getExtras();

        if(bundle!=null)
        {
            String s2 = bundle.getString("username");
            user.setText("Welcome "+s2);
        }
    }

    public void  showMusic(View v)
    {
        Intent page5 = new Intent(SecondActivity.this,TableActivity3.class);
        startActivity(page5);
    }
    public void showMovie(View v)
    {
        Intent page3 = new Intent(SecondActivity.this,TableActivity1.class);
        startActivity(page3);
    }
    public void showTVseries(View v)
    {
        Intent page4 = new Intent(SecondActivity.this,TableActivity2.class);
        startActivity(page4);
    }
}
