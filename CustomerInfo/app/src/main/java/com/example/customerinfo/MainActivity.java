package com.example.customerinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    Button buttonLogin;
    EditText editTextName, editTextAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogin = findViewById(R.id.Next);
        editTextAge = findViewById(R.id.Age);
        editTextName= findViewById(R.id.Name);


        Intent i = new Intent(MainActivity.this,MainActivity2.class);

        EditText name = findViewById(R.id.Name);
        EditText age = findViewById(R.id.Age);
        Button next = findViewById(R.id.Next);


        Button travel = findViewById(R.id.Next);
        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = name.getText().toString();
                int a = Integer.parseInt(age.getText().toString());

                i.putExtra("info1",n);
                i.putExtra("info2",a);

                startActivity(i);
            }
        });
        editTextName.addTextChangedListener(textWatcher);
        editTextAge.addTextChangedListener(textWatcher);
    }

      private TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String userName = editTextName.getText().toString().trim();
            String userAge = editTextAge.getText().toString().trim();

            buttonLogin.setEnabled(!userName.isEmpty() && !userAge.isEmpty());


        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };


}