package com.code.nameandsurname;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText,editText1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.ET1);
        editText1 = (EditText) findViewById(R.id.ET2);

        btn = (Button) findViewById(R.id.Button);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String num = editText.getText().toString();
                String num2 = editText1.getText().toString();

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);

                intent.putExtra("NAME",num);
                intent.putExtra("SURNAME",num2);
                startActivity(intent);

            }
        });

    }
}