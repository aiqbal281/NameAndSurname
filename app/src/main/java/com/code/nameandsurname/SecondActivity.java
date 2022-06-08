package com.code.nameandsurname;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView text,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text = (TextView) findViewById(R.id.T1);
        text2 = (TextView) findViewById(R.id.T2);

        Intent intent = getIntent();

      //  String nm = intent.getStringExtra("NAME");
      //  String srnm = intent.getStringExtra("SURNAME");

        String num = getIntent().getStringExtra("NAME");
        String num2 = getIntent().getStringExtra("SURNAME");

        text.append(num);
        text2.append(num2);

    }
}