package com.oslac.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
   CheckBox male;
   CheckBox female;
  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        male = findViewById(R.id.checkBox);
        female = findViewById(R.id.checkBox2);

        male.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(male.isChecked()){
                    Toast.makeText(MainActivity.this, "You checked male", Toast.LENGTH_SHORT).show();
                    female.setChecked(false);
                }
                else{
                    Toast.makeText(MainActivity.this, "Please select your gender", Toast.LENGTH_SHORT).show();
                }
            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(female.isChecked()){
                    Toast.makeText(MainActivity.this, "You checked female", Toast.LENGTH_SHORT).show();
                   male.setChecked(false);
                }
                else{
                    Toast.makeText(MainActivity.this, "Please select your gender", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}