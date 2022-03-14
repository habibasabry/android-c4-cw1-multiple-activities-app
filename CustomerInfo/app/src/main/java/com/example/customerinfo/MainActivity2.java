package com.example.customerinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText theName, theAge;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView x = findViewById(R.id.yourName);
        TextView y = findViewById(R.id.yourAge);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("info1");
        int age = (bundle.getInt("info2"));

        x.setText(name);
        y.setText(age + "");


    }
}